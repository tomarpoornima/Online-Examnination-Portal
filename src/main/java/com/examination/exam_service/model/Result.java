package com.examination.exam_service.model;

public class Result {
    private final int examId;
    private final int studentId;
    private final int totalCorrect;
    private final int totalWrong;
    private final String result;

    public Result(int examId, int studentId, int totalCorrect, int totalWrong, String result) {
        this.examId = examId;
        this.studentId = studentId;
        this.totalCorrect = totalCorrect;
        this.totalWrong = totalWrong;
        this.result = result;
    }

    public int getExamId() {
        return examId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public int getTotalWrong() {
        return totalWrong;
    }

    public String getResult() {
        return result;
    }
}

