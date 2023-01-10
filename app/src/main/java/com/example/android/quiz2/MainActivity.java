package com.example.android.quiz2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//   The exam questions and solutions
//    How I met your mother
//    1.) What is Ted middle name?
//        Evelyn
//    2.) What Stella allegric too?
//        Peanuts
//    3.) What is Barney Occupation?
//        Please or Provide Legal Exculpation And Sign Everything
//    4.) How many dogs does Robbin Have?
//        Five
//    5.) Select the men Robin had dated?
//            Barney
//            Ted
//            Nick
//    6.) Is Barney Marshall co-best man?
//        Yes
//    7.) Who is the owner of the yellow umbrella?
//        Tracy McConnell
//    8.) Who did Robin Marry first?
//        Barney
//    9.) Select the women Barney has dated?
//        Quinn
//        Robin
//        Shannon
//        Nora
//    10.) What university did Lilly attend?
//        Wesleyan University
//
//
//**/

    //Grade for the entire quiz.
    double grade = 0;

    //String correct answers
    String message = "";


    //the correct answers for quiz.
    String correctAnswerForQuestion1 = "Evelyn";
    String correctAnswerForQuestion2 = "Peanuts";
    String correctAnswerForQuestion3a = "Please";
    String correctAnswerForQuestion3b = "Provide Legal Exculpation And Sign Everything";
    String correctAnswerForQuestion4 = "Five";


    boolean isBarney5 = true;
    boolean isTed5 = true;
    boolean isNick5 = true;
    boolean isDon5 = true;
    boolean answerSoFar = false;

    //Question Sixth is radio button so I did not create a variable to hold that state.

    String correctAnswerForQuestion7 = "Tracy McConnell";

    //Question Eight  is radio button as well so I did not create a variable to hold that state.

    boolean isQuin9 = true;
    boolean isRobin9 = true;
    boolean isShannon9 = true;
    boolean isNora9 = true;
    boolean answerSoFar9 = true;

    String correctAnswerForQuestion10 = "Wesleyan University";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * gradeQuiz method grades the quiz
     * */

    public void gradeQuiz(View view) {


        prepareMessageTitle();

        //Check the answer for question 1.
        gradeQuestion1();

        //Check the answer for question 2.
        gradeQuestion2();

        // Check the answer for question 3.
        gradeQuestion3();

        //Check the answer for question 4.
        gradeQuestion4();

        // Check the answer for question 5.
        gradeQuestion5();

        // Check the answer for question 6.
        gradeQuestion6();

        // Check the answer for question 7.
        gradeQuestion7();

        // Check the answer for question 8.
        gradeQuestion8();

        // Check the answer for question 9.
        gradeQuestion9();

        // Check the answer for question  10.
        gradeQuestion10();

        //Show the results.
        displayToast();


    }

    private void prepareMessageTitle() {

        EditText inputName = (EditText) findViewById(R.id.userName);

        //If the user is not careful, EditText will include a whitespace at the end of the answer. .trim() removes whitespace.
        String userName = inputName.getText().toString().trim();
        message += userName + "\n";


        //Date
        EditText inputDate = (EditText) findViewById(R.id.userDate);
        String userDate = inputDate.getText().toString().trim();
        message += userDate + "\n";


    }


    ///gradeQuestion1 grades the first question
    private void gradeQuestion1() {

        EditText answer1 = (EditText) findViewById(R.id.answer1);

        //If the user is not careful, EditText will include a whitespace at the end of the answer. .trim() removes whitespace.
        String userAnswer1 = answer1.getText().toString().trim();
        //Log .i("answer1", String.valueOf(userAnswer1))


        //If the user gets it right, add ten points to the grade.
        if (userAnswer1.equals(correctAnswerForQuestion1)) {

            message += "First question is correct.\n";
            grade += 10;
            Log.i("grade", String.valueOf(grade));
        } else {

            message += "First question is wrong.\n";

        }


    }


    ///gradeQuestion2 grades the second question
    private void gradeQuestion2() {

        EditText answer2 = (EditText) findViewById(R.id.answer2);
        String userAnswer2 = answer2.getText().toString().trim();
        Log.i("answer2", String.valueOf(userAnswer2));


        //If the user gets it right, add ten points to the grade.
        if (userAnswer2.equals(correctAnswerForQuestion2)) {
            message += "Second question is correct.\n";
            grade += 10;
            Log.i("grade", String.valueOf(grade));
        } else {

            message += "Second question is wrong.\n";
        }


    }

    ///gradeQuestion3 grades the third question
    //Two correct answers exist for question three.
    private void gradeQuestion3() {

        EditText answer3 = (EditText) findViewById(R.id.answer3);
        String userAnswer3 = answer3.getText().toString().trim();
        Log.i("answer3", String.valueOf(userAnswer3));


        //If the user gets it right, add ten points to the grade.
        if (userAnswer3.equals(correctAnswerForQuestion3a)) {

            message += "Third question is correct.\n";
            grade += 10;
            Log.i("grade", String.valueOf(grade));
        } else if (userAnswer3.equals(correctAnswerForQuestion3b)) {
            message += "Third question is correct.\n";
            grade += 10;
            Log.i("grade", String.valueOf(grade));

        } else {

            message += "Third question is wrong.\n";
        }


    }

    private void gradeQuestion4() {

        EditText answer4 = (EditText) findViewById(R.id.answer4);
        String userAnswer4 = answer4.getText().toString().trim();
        Log.i("answer4", String.valueOf(userAnswer4));


        //If the user gets it right, add ten points to the grade.
        if (userAnswer4.equals(correctAnswerForQuestion4)) {
            message += "Fourth question is correct.\n";
            grade += 10;
            Log.i("grade", String.valueOf(grade));
        } else {

            message += "Fourth question is wrong.\n";
        }

    }

    //Check which checkbox was check
    private void gradeQuestion5() {

        final CheckBox checkBox_barney = (CheckBox) findViewById(R.id.checkbox_barney5);
        final CheckBox checkBox_ted = (CheckBox) findViewById(R.id.checkbox_ted5);
        final CheckBox checkBox_nick = (CheckBox) findViewById(R.id.checkbox_nick5);
        final CheckBox checkBox_don = (CheckBox) findViewById(R.id.checkbox_don5);

        //Checking the Barney check box.
        if ((checkBox_barney.isChecked()) == isBarney5) {

            answerSoFar = true;

        } else {
            message += "Fifth question is wrong.\n";
            answerSoFar = false;
            return;
        }

        //Check the Ted check box.
        if ((checkBox_ted.isChecked()) == isTed5) {

            answerSoFar = true;

        } else {
            message += "Fifth question is wrong.\n";
            answerSoFar = false;
            return;
        }

        //Check the Nick check box.
        if ((checkBox_nick.isChecked()) == isNick5) {

            answerSoFar = true;
        } else {
            message += "Fifth question is wrong.\n";
            answerSoFar = false;
            return;
        }

        //Check the Don check box.
        if ((checkBox_don.isChecked()) == isDon5) {

            answerSoFar = true;
        } else {
            message += "Fifth question is wrong.\n";
            answerSoFar = false;
        }


        //Calculate the grade


        if (answerSoFar) {
            message += "Fifth question is correct.\n";
            grade += 10;
            Log.i("grade from question5", String.valueOf(grade));

        } else {
            message += "Fifth question is wrong.\n";

        }


    }

    ///gradeQuestion6 grades the second question

    public void gradeQuestion6() {

        //Select the radio group
        final RadioGroup radioGroup6 = findViewById(R.id.answer6_Radio_Group);


        // get selected radio button from radioGroup
        int selectedId = radioGroup6.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton selectedRadioButton = (RadioButton) findViewById(selectedId);

        //If the radio group is not selected, selectedRadioButton will have the value of null.
        if (selectedRadioButton == null) {

            message += "Sixth question was not answered." + "\n";
            return;


        } else if ("yes".equals(selectedRadioButton.getText())) {

            message += "Sixth question is correct.\n";
            grade += 10;
            return;
        } else if ("No".equals(selectedRadioButton.getText())) {

            //The other radio button with the ID answer6_No must have been selected.
            message += "Sixth question is wrong.\n";
            return;

        }

    }


    ///gradeQuestion7 grades the seventh  question
    private void gradeQuestion7() {

        EditText answer7 = (EditText) findViewById(R.id.answer7);

        //If the user is not careful, EditText will include a whitespace at the end of the answer. .trim() removes whitespace.
        String userAnswer7 = answer7.getText().toString().trim();
        //Log .i("answer7", String.valueOf(userAnswer7))


        //If the user gets it right, add ten points to the grade.
        if (userAnswer7.equals(correctAnswerForQuestion7)) {

            message += "Seventh question is correct.\n";
            grade += 10;
            Log.i("grade from question 7", String.valueOf(grade));
        } else {
            message += "Seventh question is wrong.\n";
            Log.i("grade from question 7", String.valueOf(grade));
        }


    }

    ///gradeQuestion8 grades the eight question

    public void gradeQuestion8() {

        //Get the RadioGroup for question eight.
        RadioGroup answer8 = (RadioGroup) findViewById(R.id.answer8_Radio_Group);

        //Get the Id number of the radio button that was selected
        int selectedRadioGroupId = answer8.getCheckedRadioButtonId();

        //Find the radio button with that Id
        RadioButton selectedRadioButton = answer8.findViewById(selectedRadioGroupId);

        if (selectedRadioButton == null) {

            message += "Eight question was not selected" + "\n";
        } else if ("Ted".equals(selectedRadioButton.getText())) {

            message += "Eight question is wrong" + "\n";
            return;


        } else {

            message += "Eight question is correct" + "\n";
            grade += 10;
            return;


        }


    }

    //gradeQuestion9 grades the ninth question
    //Check which checkbox was check
    private void gradeQuestion9() {

        final CheckBox checkBox_quin = (CheckBox) findViewById(R.id.checkbox_quin);
        final CheckBox checkbox_robin = (CheckBox) findViewById(R.id.checkbox_robin);
        final CheckBox checkBox_shannon = (CheckBox) findViewById(R.id.checkbox_shannon);
        final CheckBox checkBox_nora = (CheckBox) findViewById(R.id.checkbox_nora);

        //Checking the Quin check box.
        if ((checkBox_quin.isChecked()) == isQuin9) {

            answerSoFar9 = true;

        } else {
            message += "Ninth question is wrong.\n";
            answerSoFar9 = false;
            return;
        }

        //Check the Robin check box.
        if ((checkbox_robin.isChecked()) == isRobin9) {

            answerSoFar9 = true;

        } else {
            message += "Ninth question is wrong.\n";
            answerSoFar9 = false;
            return;
        }

        //Check the Shannon check box.
        if ((checkBox_shannon.isChecked()) == isShannon9) {

            answerSoFar9 = true;
        } else {
            message += "Ninth question is wrong.\n";
            answerSoFar9 = false;
            return;
        }

        //Check the Nora check box.
        if ((checkBox_nora.isChecked()) == isNora9) {

            answerSoFar9 = true;
        } else {
            message += "Ninth question is wrong.\n";
            answerSoFar9 = false;
        }


        //Calculate the grade


        if (answerSoFar9) {

            message += "Ninth question is correct.\n";
            grade += 10;
            Log.i("grade from question9", String.valueOf(grade));

        }

    }

    ///gradeQuestion10 grades the tenth question
    private void gradeQuestion10() {

        EditText answer10 = (EditText) findViewById(R.id.answer10);

        //If the user is not careful, EditText will include a whitespace at the end of the answer. .trim() removes whitespace.
        String userAnswer10 = answer10.getText().toString().trim();
        //Log .i("answer1", String.valueOf(userAnswer1))


        //If the user gets it right, add ten points to the grade.
        if (userAnswer10.equals(correctAnswerForQuestion10)) {
            message += "Tenth question is correct.\n";
            grade += 10;
            Log.i("gradeFromQuestion10", String.valueOf(grade));
        } else {

            message += "Tenth question is wrong.\n";
        }


    }

    public void displayToast() {

        //Getting the grade.
        message += "Total: " + String.valueOf(grade);
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        //Reset
        grade = 0.0;
        message = "";
        return;

    }


}




