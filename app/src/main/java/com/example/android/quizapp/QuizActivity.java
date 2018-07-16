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

        TextView textView = findViewById(R.id.quiz_title);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Hometown.ttf");
        textView.setTypeface(typeface);

        Button submitButton = findViewById(R.id.sub_button);
        submitButton.getBackground().setAlpha(150);
    }

    /* This method checks if the user checked the correct answers for question one,
     * correct answer = True */

    private void questionOneRadioCheck() {
        RadioButton tRadioButton = findViewById(R.id.radio_true);
        RadioButton fRadioButton = findViewById(R.id.radio_false);
        if (tRadioButton.isChecked()) {
            score += 1;
        }else if (fRadioButton.isChecked()) {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question two,
     * correct answers = Metamorphic, Sedimentary, Igneous */

private void questionTwoCheck() {
        CheckBox twoCheckBoxOne = findViewById(R.id.question_two_check_one);
        CheckBox twoCheckBoxTwo = findViewById(R.id.question_two_check_two);
        CheckBox twoCheckBoxThree = findViewById(R.id.question_two_check_three);
        CheckBox twoCheckBoxFour = findViewById(R.id.question_two_check_four);
        if (twoCheckBoxOne.isChecked() && twoCheckBoxThree.isChecked() && twoCheckBoxFour.isChecked()) {
            score += 1;
        }
        else if (twoCheckBoxTwo.isChecked()) {
            score = 0;
        }
}

    /* This method checks if the user checked the correct answers for question three,
     * correct answer = Most rocks are a mixture if minerals */

    private void questionThreeRadioCheck() {
        RadioButton q3rd1 = findViewById(R.id.question_three_radio_one);
        RadioButton q3r2 = findViewById(R.id.question_three_radio_two);
        RadioButton q3r3 = findViewById(R.id.question_three_radio_three);
        RadioButton q3r4 = findViewById(R.id.question_three_radio_four);
        boolean checkedOne = q3rd1.isChecked();
        boolean checkedTwo = q3r2.isChecked();
        boolean checkedThree = q3r3.isChecked();
        boolean checkedFour = q3r4.isChecked();

        if (checkedOne || checkedThree || checkedTwo) {
            score += 0;
        } else if (checkedFour) {
            score += 1;
        }
    }

    /* This method checks if the user checked the correct answers for question four,
     * correct answer = Heat and Pressure */

    private void questionFourRadioCheck() {
        RadioButton q4rd1 = findViewById(R.id.question_four_radio_one);
        RadioButton q4rd2 = findViewById(R.id.question_four_radio_two);
        RadioButton q4rd3 = findViewById(R.id.question_four_radio_three);
        boolean checkedOne = q4rd1.isChecked();
        boolean checkedTwo = q4rd2.isChecked();
        boolean checkedThree = q4rd3.isChecked();

        if (checkedOne) {
            score += 1;
        } else if (checkedTwo || checkedThree) {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question five,
     * correct answer = Granite */

    private void questionFiveEditText() {
        String userAnswer;

        EditText inputText = findViewById(R.id.input_answer);
        userAnswer = inputText.getText().toString();
        if (userAnswer.trim().equalsIgnoreCase("granite")) {
            score += 1;
        } else {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question six,
     * correct answer = Magma */

    private void questionSixRadioCheck() {
        RadioButton q6rd1 = findViewById(R.id.question_six_radio_one);
        RadioButton q6rd2 = findViewById(R.id.question_six_radio_two);
        RadioButton q6rd3 = findViewById(R.id.question_six_radio_three);
        boolean checkedOne = q6rd1.isChecked();
        boolean checkedTwo = q6rd2.isChecked();
        boolean checkedThree = q6rd3.isChecked();

        if (checkedOne || checkedTwo) {
            score += 0;
        } else if (checkedThree) {
            score += 1;
        }
    }

    /* This method checks if the user checked the correct answers for question seven,
     * correct answer = False */

    private void questionSevenRadioCheck() {
        RadioButton RadioButtonTrue = findViewById(R.id.seven_radio_true);
        RadioButton RadioButtonFalse = findViewById(R.id.seven_radio_false);
        boolean checkedTrue = RadioButtonTrue.isChecked();
        boolean checkedFalse = RadioButtonFalse.isChecked();
        if (checkedTrue) {
            score += 0;
        }else if (checkedFalse) {
            score += 1;
        }
    }

    /* This method checks if the user checked the correct answers for question eight,
     * correct answers = Gneiss and Basalt*/

    private void questionEightCheck() {
        CheckBox eightCheckBoxOne = findViewById(R.id.question_eight_check_one);
        CheckBox eightCheckBoxTwo = findViewById(R.id.question_eight_check_two);
        CheckBox eightCheckBoxThree = findViewById(R.id.question_eight_check_three);
        CheckBox eightCheckBoxFour = findViewById(R.id.question_eight_check_four);
        if (eightCheckBoxThree.isChecked() && eightCheckBoxFour.isChecked()) {
            score += 1;
        }else if (eightCheckBoxOne.isChecked() || eightCheckBoxTwo.isChecked()) {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question nine,
     * correct answer = Seismology */

    private void questionNineRadioCheck() {
        RadioButton q9rd1 = findViewById(R.id.question_nine_radio_one);
        RadioButton q9rd2 = findViewById(R.id.question_nine_radio_two);
        RadioButton q9rd3 = findViewById(R.id.question_nine_radio_three);
        boolean checkedOne = q9rd1.isChecked();
        boolean checkedTwo = q9rd2.isChecked();
        boolean checkedThree = q9rd3.isChecked();

        if (checkedOne || checkedThree) {
            score += 0;
        } else if (checkedTwo) {
            score += 1;
        }
    }

    /* This method checks if the user checked the correct answers for question ten,
     * correct answer = 4.6 Billion Years */

    private void questionTenRadioCheck() {
        RadioButton q10rd1 = findViewById(R.id.question_ten_radio_one);
        RadioButton q10rd2 = findViewById(R.id.question_ten_radio_two);
        RadioButton q10rd3 = findViewById(R.id.question_ten_radio_three);
        boolean checkedOne = q10rd1.isChecked();
        boolean checkedTwo = q10rd2.isChecked();
        boolean checkedThree = q10rd3.isChecked();

        if (checkedOne) {
            score += 1;
        } else if (checkedTwo || checkedThree) {
            score += 0;
        }
    }

    /* This method adds all the scores for the previous questions */

    private int addScores() {
        score = 0;
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
            Toast.makeText(this, "You scored " + score +", please try again :)", Toast.LENGTH_LONG).show();
        }
        else if (score <= 4) {
            Toast.makeText(this, "Your scored " + score + " points, won't you try again? ", Toast.LENGTH_LONG).show();
        }
        else if (score == 5) {
            Toast.makeText(this, "You are doing great, you scored " + score + " points, won't you try again? ", Toast.LENGTH_LONG).show();
        }
        else if (score == 6 || score == 7) {
            Toast.makeText(this, "Nice!! just half way there, you scored " + score + " points. ", Toast.LENGTH_LONG).show();
        }
        else if (score == 8 || score == 9) {
            Toast.makeText(this, "Too close!! You scored " + score + " points, well done!! ", Toast.LENGTH_LONG).show();
        }
        else if (score == 10) {
            Toast.makeText(this, "WhooHoo!! Genius!!!!, You scored :" + score + " points :) ", Toast.LENGTH_LONG).show();
        }
    }
}
