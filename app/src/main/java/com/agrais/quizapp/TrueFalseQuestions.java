package com.agrais.quizapp;

import java.util.Scanner;

public class TrueFalseQuestions extends Question {
    private boolean mTFAnswer;
    private String[] mFillAnswers;

    public TrueFalseQuestions(String text, boolean ans){
        super(text);
        mTFAnswer=ans;
    }

    //checks user input against answer.
    //returns whether the user answered the question correctly
    @Override
    public boolean checkAnswer(boolean userAnswer){
        return (mTFAnswer == userAnswer);
    }

    public boolean getTFAnswer() {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer) {
        mTFAnswer = TFAnswer;
    }
    //fill in the blank question check
    public boolean checkAnswer(String userAnswer)
    {
        for(String ans : getFillAnswers()){
          if (ans.equalsIgnoreCase((userAnswer)))
          {
              return true;
          }
        }
        return false;
    }

    public String[] getFillAnswers(){
    return mFillAnswers;
    }
    @Override
    public boolean readInputAndCheckAnswer (Scanner input){
        System.out.print("Enter t/f");
        String in = input.nextLine();
        boolean boolResponse;

        if (in.equals("t")|| in.equals("true")|| in.equals("T")){
            boolResponse = true;
        }
        else {
            boolResponse = false;
        }
        return checkAnswer(boolResponse);
    }
}
