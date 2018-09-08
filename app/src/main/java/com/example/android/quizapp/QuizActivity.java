package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    int score;

    Intent initiateIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        initiateIntent = getIntent();

        //change text font
        TextView textView = findViewById(R.id.quiz_title);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Hometown.ttf");
        textView.setTypeface(typeface);

        //set button transparency
        Button submitButton = findViewById(R.id.sub_button);
        submitButton.getBackground().setAlpha(170);
    }

    /* This method checks if the user checked the correct answers for question one,
     * correct answer = True */

    private void questionOneRadioCheck() {
        RadioButton tRadioButton = findViewById(R.id.radio_true);
        if (tRadioButton.isChecked()) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question two,
     * correct answers = Metamorphic, Sedimentary, Igneous */

private void questionTwoCheck() {
        CheckBox twoCheckBoxOne = findViewById(R.id.question_two_check_one);
        CheckBox twoCheckBoxTwo = findViewById(R.id.question_two_check_two);
        CheckBox twoCheckBoxThree = findViewById(R.id.question_two_check_three);
        CheckBox twoCheckBoxFour = findViewById(R.id.question_two_check_four);
        if (twoCheckBoxOne.isChecked() && twoCheckBoxThree.isChecked() && twoCheckBoxFour.isChecked() && !twoCheckBoxTwo.isChecked()) {
            score++;
        }
}

    /* This method checks if the user checked the correct answers for question three,
     * correct answer = Most rocks are a mixture if minerals */

    private void questionThreeRadioCheck() {
        RadioButton q3r4 = findViewById(R.id.question_three_radio_four);
        boolean checkedFour = q3r4.isChecked();
        if (checkedFour) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question four,
     * correct answer = Heat and Pressure */

    private void questionFourRadioCheck() {
        RadioButton q4rd1 = findViewById(R.id.question_four_radio_one);
        boolean checkedOne = q4rd1.isChecked();
        if (checkedOne) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question five,
     * correct answer = Granite */

    private void questionFiveEditText() {
        String userAnswer;

        EditText inputText = findViewById(R.id.input_answer);
        userAnswer = inputText.getText().toString();
        if (userAnswer.trim().equalsIgnoreCase("granite")) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question six,
     * correct answer = Magma */

    private void questionSixRadioCheck() {
        RadioButton q6rd3 = findViewById(R.id.question_six_radio_three);
        boolean checkedThree = q6rd3.isChecked();
        if (checkedThree) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question seven,
     * correct answer = False */

    private void questionSevenRadioCheck() {
        RadioButton RadioButtonFalse = findViewById(R.id.seven_radio_false);
        boolean checkedFalse = RadioButtonFalse.isChecked();
        if (checkedFalse) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question eight,
     * correct answers = Gneiss and Basalt*/

    private void questionEightCheck() {
        CheckBox eightCheckBoxOne = findViewById(R.id.question_eight_check_one);
        CheckBox eightCheckBoxTwo = findViewById(R.id.question_eight_check_two);
        CheckBox eightCheckBoxThree = findViewById(R.id.question_eight_check_three);
        CheckBox eightCheckBoxFour = findViewById(R.id.question_eight_check_four);
        if (eightCheckBoxThree.isChecked() && eightCheckBoxFour.isChecked() && !eightCheckBoxOne.isChecked() && !eightCheckBoxTwo.isChecked()) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question nine,
     * correct answer = Seismology */

    private void questionNineRadioCheck() {
        RadioButton q9rd2 = findViewById(R.id.question_nine_radio_two);
        boolean checkedTwo = q9rd2.isChecked();
        if (checkedTwo) {
            score++;
        }
    }

    /* This method checks if the user checked the correct answers for question ten,
     * correct answer = 4.6 Billion Years */

    private void questionTenRadioCheck() {
        RadioButton q10rd1 = findViewById(R.id.question_ten_radio_one);
        boolean checkedOne = q10rd1.isChecked();
        if (checkedOne) {
            score++;
        }
    }

    /* This method adds all the scores for the previous questions */

    private int addScores() {
        questionOneRadioCheck();
        questionTwoCheck();
        questionThreeRadioCheck();
        questionFourRadioCheck();
        questionFiveEditText();
        questionSixRadioCheck();
        questionSevenRadioCheck();
        questionEightCheck();
        questionNineRadioCheck();
        questionTenRadioCheck();

        return score;
    }

    /* This method displays scores*/

    public void checkScores(View v) {
        showResults(addScores());
        finish();
        startActivity(initiateIntent);
    }

    /* This method displays the relevant toast according to score */

    public void showResults(int score) {
        if (score <= 1) {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.tryAgain), Toast.LENGTH_LONG).show();
        }
        else if (score <= 4) {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.tryAgain), Toast.LENGTH_LONG).show();
        }
        else if (score == 5) {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.tryAgain), Toast.LENGTH_LONG).show();
        }
        else if (score == 6 || score == 7) {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.tryAgain), Toast.LENGTH_LONG).show();
        }
        else if (score == 8 || score == 9) {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.congrats), Toast.LENGTH_LONG).show();
        }
        else if (score == 10) {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.congrats), Toast.LENGTH_LONG).show();
        }
    }
}
