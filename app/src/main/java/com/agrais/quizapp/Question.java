package com.agrais.quizapp;

import java.io.StreamCorruptedException;

public class Question {

    private int mTextResId;
    private int mHintResId;
    private boolean mAnswer;

    public Question(int TextResId, int HintResId, boolean answer )
    {
        mTextResId=TextResId;
        mHintResId=HintResId;
        mAnswer=answer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    public int getHintResId() {
        return mHintResId;
    }

    public void setHintResId(int hintResId) {
        mHintResId = hintResId;
    }
}
