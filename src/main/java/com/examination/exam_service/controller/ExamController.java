package com.examination.exam_service.controller;

import com.examination.exam_service.model.Exam;
import com.examination.exam_service.model.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {
        @PostMapping
        public Exam addExam(Exam exam){
            return exam;
        }
        @GetMapping
        public List<Exam> getAllExam(){
            return null;
        }

        @GetMapping("/{id}")
        public Exam getExamById(@PathVariable(value = "id")int id){
            return null;
        }

        @DeleteMapping("/{id}")
        public void deleteExam(@PathVariable(value = "id")int id){

        }

        @PutMapping({"/{examId}"})
        public Exam editExam(@PathVariable(value = "id")int id, Exam exam){
            return exam;
        }
        @GetMapping("/{examId}")
        public List<Question> getAllQuestionByExamId(@PathVariable(value = "examId")int id){
             return null;
        }


}
