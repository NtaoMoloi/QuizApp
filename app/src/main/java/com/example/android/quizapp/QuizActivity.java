package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    int score = 0;

    CardView card_one;
    CardView card_two;
    CardView card_three;
    CardView card_four;
    CardView card_five;
    CardView card_six;
    CardView card_seven;
    CardView card_eight;
    CardView card_nine;
    CardView card_ten;
    Intent initiateIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        initiateIntent = getIntent();

        TextView textView = (TextView) findViewById(R.id.quiz_title);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Hometown.ttf");
        textView.setTypeface(typeface);
    }

    /* This method checks if the user checked the correct answers for question one,
     * if correct the score add a point */

    private void questionOneRadioCheck() {
        RadioButton tRadioButton = (RadioButton) findViewById(R.id.radio_true);
        RadioButton fRadioButton = (RadioButton) findViewById(R.id.radio_false);
        boolean checkedTrue = tRadioButton.isChecked();
        boolean checkedFalse = fRadioButton.isChecked();
        if (checkedTrue) {
            score += 1;
        }else if (checkedFalse) {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question two,
     * if correct the score add a point */

private void questionTwoCheck() {
        CheckBox twoCheckBoxOne = (CheckBox) findViewById(R.id.question_two_check_one);
        CheckBox twoCheckBoxTwo = (CheckBox) findViewById(R.id.question_two_check_two);
        CheckBox twoCheckBoxThree = (CheckBox) findViewById(R.id.question_two_check_three);
        CheckBox twoCheckBoxFour = (CheckBox) findViewById(R.id.question_two_check_four);
        if (!twoCheckBoxOne.isChecked() && twoCheckBoxThree.isChecked() && twoCheckBoxFour.isChecked()) {
            score += 0;
        } else if (twoCheckBoxTwo.isChecked()) {
            score += 0;
        }else {
            score += 1;
        }
    }

    /* This method checks if the user checked the correct answers for question three,
     * if correct the score add a point */

    private void questionThreeRadioCheck() {
        RadioButton q3rd1 = (RadioButton) findViewById(R.id.question_three_radio_one);
        RadioButton q3r2 = (RadioButton) findViewById(R.id.question_three_radio_two);
        RadioButton q3r3 = (RadioButton) findViewById(R.id.question_three_radio_three);
        RadioButton q3r4 = (RadioButton) findViewById(R.id.question_three_radio_four);
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
     * if correct the score add a point */

    private void questionFourRadioCheck() {
        RadioButton q4rd1 = (RadioButton) findViewById(R.id.question_four_radio_one);
        RadioButton q4rd2 = (RadioButton) findViewById(R.id.question_four_radio_two);
        RadioButton q4rd3 = (RadioButton) findViewById(R.id.question_four_radio_three);
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
     * if correct the score add a point */

    private void questionFiveEditText() {
        EditText inputText = (EditText) findViewById(R.id.input_answer);
        if (inputText.getText().toString().equals(getString(R.string.questionFiveAnswer))) {
            score += 1;
        } else {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question six,
     * if correct the score add a point */

    private void questionSixRadioCheck() {
        RadioButton q6rd1 = (RadioButton) findViewById(R.id.question_six_radio_one);
        RadioButton q6rd2 = (RadioButton) findViewById(R.id.question_six_radio_two);
        RadioButton q6rd3 = (RadioButton) findViewById(R.id.question_six_radio_three);
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
     * if correct the score add a point */

    private void questionSevenRadioCheck() {
        RadioButton RadioButtonTrue = (RadioButton) findViewById(R.id.seven_radio_true);
        RadioButton RadioButtonFalse = (RadioButton) findViewById(R.id.seven_radio_false);
        boolean checkedTrue = RadioButtonTrue.isChecked();
        boolean checkedFalse = RadioButtonFalse.isChecked();
        if (checkedTrue) {
            score += 0;
        }else if (checkedFalse) {
            score += 1;
        }
    }

    /* This method checks if the user checked the correct answers for question eight,
     * if correct the score add a point */

    private void questionEightCheck() {
        CheckBox eightCheckBoxOne = (CheckBox) findViewById(R.id.question_eight_check_one);
        CheckBox eightCheckBoxTwo = (CheckBox) findViewById(R.id.question_eight_check_two);
        CheckBox eightCheckBoxThree = (CheckBox) findViewById(R.id.question_eight_check_three);
        CheckBox eightCheckBoxFour = (CheckBox) findViewById(R.id.question_eight_check_four);
        if (eightCheckBoxThree.isChecked() && eightCheckBoxFour.isChecked()) {
            score += 1;
        }else if (eightCheckBoxOne.isChecked() || eightCheckBoxTwo.isChecked()) {
            score += 0;
        }
    }

    /* This method checks if the user checked the correct answers for question nine,
     * if correct the score add a point */

    private void questionNineRadioCheck() {
        RadioButton q9rd1 = (RadioButton) findViewById(R.id.question_nine_radio_one);
        RadioButton q9rd2 = (RadioButton) findViewById(R.id.question_nine_radio_two);
        RadioButton q9rd3 = (RadioButton) findViewById(R.id.question_nine_radio_three);
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
     * if correct the score add a point */

    private void questionTenRadioCheck() {
        RadioButton q10rd1 = (RadioButton) findViewById(R.id.question_ten_radio_one);
        RadioButton q10rd2 = (RadioButton) findViewById(R.id.question_ten_radio_two);
        RadioButton q10rd3 = (RadioButton) findViewById(R.id.question_ten_radio_three);
        boolean checkedOne = q10rd1.isChecked();
        boolean checkedTwo = q10rd2.isChecked();
        boolean checkedThree = q10rd3.isChecked();

        if (checkedOne) {
            score += 1;
        } else if (checkedTwo || checkedThree) {
            score += 0;
        }
    }

    /* This method add all the scores for the previous questions */

    private void addScores() {
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
    }


    /* This method shows a toast that displays the scores added by the addScores method and
    * starts the activity afresh */

    public void checkScores(View v) {
        addScores();
        Toast.makeText(this, "Your score is " + score + " out of 10", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(initiateIntent);
    }

}
