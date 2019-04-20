package com.recruit.controllers;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.recruit.dto.Question;
import com.recruit.dto.QuestionSet;

@RestController
public class QuestionsController {

	@GetMapping(value = "/question_set/{question_set}", produces = MediaType.APPLICATION_JSON_VALUE)
	public QuestionSet getQuestionsBySetId(@PathVariable("question_set") String questionSetId) {
		Question q = Question.builder().question_serial(1L).question("What is your name?").build();
		return QuestionSet.builder().question_set_id(questionSetId).questions(Arrays.asList(q)).build();

	}

}
