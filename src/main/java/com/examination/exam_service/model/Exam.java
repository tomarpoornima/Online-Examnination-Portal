package com.examination.exam_service.model;

import java.util.Date;
import java.util.List;

public class Exam {
    private final int id;
    private final String title;
    private final Date startTime;
    private final Date endTime;
    private final int duration;
    private final int totalQuestions;
    private final int totalMarks;
    private final List<Question> questions;

    public Exam(int id, String title, Date startTime, Date endTime, int duration, int totalQuestions, int totalMarks, List<Question> questions){
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.totalQuestions = totalQuestions;
        this.totalMarks = totalMarks;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public List<Question> getQuestion() {
        return questions;
    }
}
