package com.nms.model;

public class Game {
	private int targetNumber;
    private int attempts;
    private int attemptLimit;
    private boolean isCorrect;
    private boolean isGameOver;
    private String hint;

    public Game(int targetNumber, int attemptLimit) {
        this.targetNumber = targetNumber;
        this.attemptLimit = attemptLimit;
        this.attempts = 0;
        this.isCorrect = false;
        this.isGameOver = false;
        this.hint = "Make your guess!";
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getAttemptLimit() {
        return attemptLimit;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public String getHint() {
        return hint;
    }

    public void incrementAttempts() {
        this.attempts++;
        if (this.attempts >= this.attemptLimit && !this.isCorrect) {
            setGameOver(true);
        }
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public void setGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}