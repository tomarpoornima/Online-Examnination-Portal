package com.examination.exam_service.controller;

import com.examination.exam_service.model.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
        @PostMapping
        public Question addQuestion(Question question){
            return question;
        }
        @GetMapping
        public List<Question> getAllQuestion(){
            return null;
        }
        @GetMapping("/{id}")
        public Question getQuestionById(@PathVariable(value = "id")int id){
            return null;
        }

        @DeleteMapping("/{id}")
        public void deleteQuestion(@PathVariable(value = "id")int id){

        }

        @PutMapping("/{id}")
        public Question editQuestion(@PathVariable(value = "id,question")int id, Question question){
            return question;
        }


}
