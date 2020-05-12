package com.company;

import java.util.Scanner;

public class Question {

    private String question;
    private String possibleAnswers;
    private String answer;
    private int points;

    public Question(String aQuestion, String aPossibleAnswers, String aAnswer, int aPoints) {
        question = aQuestion;
        possibleAnswers = aPossibleAnswers;
        answer = aAnswer;
        points = aPoints;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int test_question() {
        Scanner input = new Scanner(System.in);
        System.out.println(question);
        System.out.println("\n Answers: \n" + possibleAnswers);
        System.out.println("\nYour Answer:");
        String submittedAnswer = input.nextLine();


        if (answer.toLowerCase().equals(submittedAnswer.toLowerCase())) {
            System.out.println("Correct!");
            return getPoints();
        } else {
            System.out.println("Wrong!");
            return 0;
        }
    }

}


