package com.examination.exam_service.model;


public class Question {
    private final int id;
    private final String subject;
    private final String text;
    private final String optionOne;
    private final String optionTwo;
    private final String optionThree;
    private final String optionFour;

    private final String answer;

    public Question(int id, String subject, String text, String optionOne, String optionTwo, String optionThree, String optionFour, String answer) {
        this.id = id;
        this.subject = subject;
        this.text = text;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public String getAnswer() {
        return answer;
    }
}
