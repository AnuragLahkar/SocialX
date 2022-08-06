package com.example.socialx2.home;

import java.util.List;

public class NewsApiResponse {
    String status;
    int totalResults;
    List<com.example.socialx2.home.NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<com.example.socialx2.home.NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<com.example.socialx2.home.NewsHeadlines> articles) {
        this.articles = articles;
    }
}
