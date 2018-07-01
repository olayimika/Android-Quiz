package com.example.android.quizapp;

public class QuestionLibrary {
    private String Questions [] = {
            "What's the fifth planet from the sun?",
            "When was the first airplane created?",
            "When did columbus discover the Americas?",
                    "What is a obtuse angle?"
    };

    private String Choices[] [] = {
            {"A. Mars", "B. Jupiter", "C. Earth"},
            {"1915","1908","1912"},
            {"1467","1598","1492"},
            {"2x*x","E^3","Fish"}

    };

    private String CorrectAnswers[]= {
         "Jupiter","1912","1492","E^3"
    };

    public String getQuestions(int a) {
        String question = Questions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0= Choices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1= Choices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2= Choices[a][2];
        return choice2;
    }

    public String getCorrectAnswers(int a) {
        String answer = CorrectAnswers[a];
        return answer;
    }
}
