package com.sbb.sbb.Answer;

import com.sbb.sbb.Question.Question;
import com.sbb.sbb.Question.QuestionService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam(value = "content") String content){

        Question question = this.questionService.getQuestion(id);
        this.answerService.create(question, content);

        return String.format("redirect:/question/detail/%s", id);
    }
}
