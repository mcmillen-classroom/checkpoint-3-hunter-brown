package com.agrais.quizapp;

import java.util.Scanner;

public class QuizOOPMain {
  public static void main(String[] args)
  {
     String[] mOptions2 = {"Pelog","Selendro", "Selisir", "Gede"};
     String[] mOptions3 = {"Rangda", "Barong", "Bhoma", "Xing"};

      Question[] mQuestions= new Question[5];
      mQuestions[0] = new TrueFalseQuestions("Jakarta is the Capital of Indonesia", true);
      mQuestions[1]= new MultipleChoiceQuestion("What is the most common Scale in Bali?",mOptions2,0);
      mQuestions[2]= new MultipleChoiceQuestion("What is the name of the Lion Dance in Bali?",mOptions3,1);
      mQuestions[3]=new TrueFalseQuestions("Mas is the Capital of Bali",false);
      mQuestions[4]= new FillTheBlankQuestion("What is no in Balinese?", "Sing");
      int mIndex = 0;
      int mScore = 0;

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to the Quiz! Good Luck and Have Fun!");

      while (mIndex < mQuestions.length){
          System.out.println(mQuestions[mIndex].getText());
          if (mQuestions[mIndex].readInputAndCheckAnswer(input)){
              System.out.println("You are correct!");
          }
          else {
              System.out.println("You are incorrect!");
          }
          mIndex++;
      }

  }

}
