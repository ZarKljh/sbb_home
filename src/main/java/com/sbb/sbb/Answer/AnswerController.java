package com.sbb.sbb.Answer;

import com.sbb.sbb.Question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerRepository answerRepository;

}
