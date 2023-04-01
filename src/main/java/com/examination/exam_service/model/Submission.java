package com.examination.exam_service.model;

import org.springframework.boot.SpringBootVersion;

public class Submission {
    private final int examId;
    private final int studentId;
    private final int totalAttempted;
    private final int score;
    private final String answers;

    public Submission(int examId, int studentId, int totalAttempted, int score, String answers) {
        this.examId = examId;
        this.studentId = studentId;
        this.totalAttempted = totalAttempted;
        this.score = score;
        this.answers = answers;
    }

    public int getExamId() {
        return examId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTotalAttempted() {
        return totalAttempted;
    }

    public int getScore() {
        return score;
    }

    public String getAnswers() {
        return answers;
    }
}
