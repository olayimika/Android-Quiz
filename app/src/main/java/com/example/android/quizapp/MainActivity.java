package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary QuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score_view);
        mQuestionView = (TextView) findViewById(R.id.question_view);
        mButtonChoice1= (Button) findViewById(R.id.option1_view);
        mButtonChoice2= (Button) findViewById(R.id.option2_view);
        mButtonChoice3= (Button) findViewById(R.id.option3_view);

        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice1.getText() == mAnswer){
                    mScore ++;
                    updateScore(mScore);
                    updateQuestion();
                }


            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice2.getText() == mAnswer){
                    mScore ++;
                    updateScore(mScore);
                    updateQuestion();
                }


            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice3.getText() == mAnswer){
                    mScore ++;
                    updateScore(mScore);
                    updateQuestion();
                }


            }
        });



    }

    private void updateQuestion(){
        mQuestionView.setText(QuestionLibrary.getQuestions(mQuestionNumber));
        mButtonChoice1.setText(QuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(QuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(QuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = QuestionLibrary.getCorrectAnswers(mQuestionNumber);
        mQuestionNumber++;
    }

    private void updateScore(int a){
        mScoreView.setText("" + mScore);

    }

}
