package com.agrais.quizapp;

import java.util.Scanner;

public class Question {

 private String mText;
 // 0 = Boolean 1= String 2= Number (MC)
 private int mAnswerType;

 public Question (String text){
     mText = text;
 }
 //Only Applies to T/F
    public boolean checkAnswer (boolean boolResponse){
     return false;
    }
//Only Applies to fill in the Blank
    public boolean checkAnswer (String userAnswer){
     return false;
    }

    //Only Applies to Multiple Choice
    public boolean checkAnswer(int userChoice){
     return false;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getAnswerType() {
        return mAnswerType;
    }

    public void setAnswerType(int answerType) {
        mAnswerType = answerType;
    }

    public boolean readInputAndCheckAnswer(Scanner input){
     return false;
    }
}

