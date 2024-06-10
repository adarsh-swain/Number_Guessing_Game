package com.nms.model;

public class Game {
    private int targetNumber;
    private int attempts;
    private boolean isCorrect;
    private int attemptLimit;
    private boolean isGameOver;
    private String hint;

    public Game(int targetNumber, int attemptLimit) {
        this.targetNumber = targetNumber;
        this.attempts = 0;
        this.isCorrect = false;
        this.attemptLimit = attemptLimit;
        this.isGameOver = false;
        this.hint = "";
    }

    // Getters and Setters

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getAttemptLimit() {
        return attemptLimit;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void incrementAttempts() {
        if (attempts < attemptLimit) {
            attempts++;
            if (attempts >= attemptLimit) {
                isGameOver = true;
            }
        }
    }
}