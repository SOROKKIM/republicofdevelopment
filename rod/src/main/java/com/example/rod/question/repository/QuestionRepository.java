package com.example.rod.question.repository;

import com.example.rod.question.entity.Question;
import com.example.rod.user.entity.User;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {


    Page<Question> findAllByUser(User user, Pageable pageable);

    Long countAllByUser(User user);

    Long countByTitleContaining(String title);

    Long countByUser_NameContaining(String title);

    Page<Question> findByTitleContaining(String title, Pageable pageable);

    Page<Question> findByUser_NameContaining(String nickname, Pageable pageable);


}
