package com.example.android.quizzy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //initializing score to be zero
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method will be called when submit button is clicked
    public void submitAnswers(View view) {

        //initializing score to be zero on every time submit button is pressed
        score = 0;

        //getting the id's of the options
        RadioButton answer1 = (RadioButton) findViewById(R.id.ans1);
        EditText answer2 = (EditText) findViewById(R.id.ans2);
        RadioButton answer3 = (RadioButton) findViewById(R.id.ans3);
        CheckBox answer4a = (CheckBox) findViewById(R.id.ans4a);
        CheckBox answer4b = (CheckBox) findViewById(R.id.ans4b);
        CheckBox answer4c = (CheckBox) findViewById(R.id.ans4c);
        CheckBox answer4d = (CheckBox) findViewById(R.id.ans4d);
        RadioButton answer5 = (RadioButton) findViewById(R.id.ans5);
        EditText answer6 = (EditText) findViewById(R.id.ans6);

        //passing the answers to respective answer checking methods
        check_ans1(answer1.isChecked());
        check_ans2("nepal".equals(answer2.getText().toString()));
        check_ans3(answer3.isChecked());
        check_ans4(answer4a.isChecked(), answer4b.isChecked(), answer4c.isChecked(), answer4d.isChecked());
        check_ans5(answer5.isChecked());
        check_ans6("turkey".equals(answer6.getText().toString()));

        //show the toast message after checking all the answers
        Toast.makeText(this, "Score : " + score + "/6", Toast.LENGTH_SHORT).show();
    }

    /**
     * to check correct answer for question 1
     *
     * @param correct
     */
    public void check_ans1(boolean correct) {

        if (correct) {
            score += 1;
        }
    }

    /**
     * to check correct answer for question 2
     *
     * @param correct
     */
    public void check_ans2(boolean correct) {

        if (correct) {
            score += 1;
        }
    }

    /**
     * to check correct answer for question 3
     *
     * @param correct
     */
    public void check_ans3(boolean correct) {

        if (correct) {
            score += 1;
        }
    }

    /**
     * to check correct answer for question 4
     *
     * @param correctA
     * @param InCorrectB
     * @param correctC
     * @param InCorrectD
     */
    public void check_ans4(boolean correctA, boolean InCorrectB, boolean correctC, boolean InCorrectD) {

        if (InCorrectB || InCorrectD) {

            score += 0;

        } else if (correctA && correctC) {
            score += 1;
        }
    }

    /**
     * to check correct answer for question 5
     *
     * @param correct
     */
    public void check_ans5(boolean correct) {

        if (correct) {
            score += 1;
        }
    }

    /**
     * to check correct answer for question 6
     *
     * @param correct
     */
    public void check_ans6(boolean correct) {

        if (correct) {
            score += 1;
        }
    }
/**
 * ques1 = India
 * ques2 = nepal
 * ques3 = Russia
 * ques4 = England & Wales
 * ques5 = 15
 * ques6 = turkey
 */
}
