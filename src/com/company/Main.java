package com.company;

public class Main {

    public static void main(String[] args) {

        Quiz newQuiz = new Quiz();



	    Question one = new Question("What is 2 + 2?", "2, 3, 4, 1", "2", 1);

	    True_False_Question two = new True_False_Question("2 + 2 = 4", "True, False", "True", 1);

	    Checkbox three = new Checkbox("Access Modifiers:", "private, public, constant", "private, public", 1);

	    newQuiz.addQuestion(one);
        newQuiz.addQuestion(two);
        newQuiz.addQuestion(three);

        newQuiz.printQuiz();

    }
}
