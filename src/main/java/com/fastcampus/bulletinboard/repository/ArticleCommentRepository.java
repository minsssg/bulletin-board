package com.fastcampus.bulletinboard.repository;

import com.fastcampus.bulletinboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
