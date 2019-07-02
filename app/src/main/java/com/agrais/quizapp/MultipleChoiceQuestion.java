package com.agrais.quizapp;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion (String text, String[] Options, int ans ){
        super(text);
        // index for MC options 0 = A, 1= B, 2=C, 3= D
        mOptions= Options;
        mAnswer = ans;
    }
    @Override
    public boolean checkAnswer(int userChoice){
            if (userChoice == mAnswer){
                return true;
            }
            else
                {
                return false;
                }
    }

    @Override
    public boolean readInputAndCheckAnswer (Scanner input){
        System.out.print("Enter answer (0,1,2,3): ");
        for (int i=0; i < mOptions.length; i++)
        {
            System.out.println(mOptions[i]);
        }
         int in = input.nextInt();
        return checkAnswer(in);
    }
}