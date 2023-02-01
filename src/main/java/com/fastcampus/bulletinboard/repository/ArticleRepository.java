package com.fastcampus.bulletinboard.repository;

import com.fastcampus.bulletinboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}