package com.example.rod.answer.service;

import com.example.rod.answer.dto.AnswerRequestDto;
import com.example.rod.answer.dto.AnswerResponseDto;
import com.example.rod.answer.entity.Answer;
import com.example.rod.comment.dto.CommentResultDto;
import org.springframework.data.domain.Pageable;

public interface AnswerService {

    void createAnswer(Long questionId, AnswerRequestDto answerRequestDto);

    void updateAnswer(Long answerId, AnswerRequestDto answerRequestDto);

    void deleteAnswer(Long answerId);

    AnswerResponseDto getAnswer(Long answerId);

    CommentResultDto getListAnswer(Pageable pageable, int page);

}
