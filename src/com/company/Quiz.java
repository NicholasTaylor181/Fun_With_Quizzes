package com.company;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> quiz = new ArrayList<>();


    public void addQuestion(Question aQuestion) {
        quiz.add(aQuestion);

    }

    public void printQuiz() {
        int totalRight = 0;
        int total = 0;


        for (Question item : quiz) {
            totalRight = item.test_question() + totalRight;
            total = item.getPoints() + total;
        }
        double percentCorrect = totalRight / Double.valueOf(total);
        System.out.println("You got " + totalRight + " out of " + total + " (" + percentCorrect * 100 + "%)");
    }
}
