package com.company;

import java.util.Scanner;

public class Checkbox extends Question {
    private String[] answers;

    public Checkbox(String aQuestion, String aPossibleAnswers, String aAnswer, int aPoints) {
        super(aQuestion, aPossibleAnswers, aAnswer, aPoints);
        answers = aAnswer.split(", ");
    }

    @Override
    public int test_question() {
        Scanner input = new Scanner(System.in);
        System.out.println(getQuestion());
        System.out.println("\n Answers: \n" + getPossibleAnswers());
        System.out.println("\nYour Answer:");
        String submittedAnswer = input.nextLine();
        String[] subAnswerArr = submittedAnswer.split(", ");
        int count = 0;

        for (int i = 0; i < subAnswerArr.length; i++) {
            String temp = subAnswerArr[i];
            if (!getAnswer().contains(temp)) {
                count = 1;
            }
        }
        if (count > 0) {
            System.out.println("Wrong!");
            return 0;
        } else {
            System.out.println("Correct!");
            return getPoints();
        }
    }
}
