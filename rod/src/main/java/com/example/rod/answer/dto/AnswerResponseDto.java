package com.example.rod.answer.dto;

import com.example.rod.comment.dto.CommentResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerResponseDto {

    private Long id;
    private String content;

    private int answerLike;

    private List<CommentResponseDto> commentResponseDtoList;

    public AnswerResponseDto(Long id, String content, int answerLike) {
        this.id = id;
        this.content = content;
        this.answerLike = answerLike;
    }

    public AnswerResponseDto(String content) {
        this.content = content;
    }
}