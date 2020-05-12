package com.company;

import java.util.Scanner;

public class True_False_Question extends Question {
    public True_False_Question(String aQuestion, String aPossibleAnswers, String aAnswer, int aPoints) {
        super(aQuestion, aPossibleAnswers, aAnswer, aPoints);
        while (!getAnswer().toLowerCase().equals("true") && (!getAnswer().toLowerCase().equals("false"))){
            System.out.println("Please enter an answer that is True or False!");
            Scanner input = new Scanner(System.in);
            System.out.println("Your Answer:");
            setAnswer(input.nextLine());
            System.out.println(getAnswer());
        }
    }


}
