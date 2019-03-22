package com.sukyeong.jdbc.raw;

import java.util.List;
import com.sukyeong.jdbc.template.ArticleDaoImplUsingTemplate;


public class ArticleMain {
    ArticleDao articleDao = new ArticleDaoImplUsingTemplate();

    /**
     * main 메서드
     */
    public static void main(String[] args) {
        new ArticleMain().listArticles();
        new ArticleMain().addArticle();
    }

    public void listArticles() {
        List<Article> articles = articleDao.listArticles();
        System.out.println(articles);
    }

    public void getArticle() {
        Article article = articleDao.getArticle("3");
        System.out.println(article);
    }

    public void addArticle() {
        Article article = new Article();
        article.setTitle("제목입니다");
        article.setContent("내용입니다");
        article.setUserId("1");
        article.setName("이수경");
        articleDao.addArticle(article);
    }

    public void updateArticle() {
        Article article = new Article();
        article.setArticleId("7");
        article.setTitle("This is modified title.");
        article.setContent("This is modified content");
        articleDao.updateArticle(article);
    }

    public void deleteArticle() {
        articleDao.deleteArticle("10");
    }
}