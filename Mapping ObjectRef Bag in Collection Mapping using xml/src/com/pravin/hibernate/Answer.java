package com.pravin.hibernate;

public class Answer {
    private int id;
    private String givenAnswer;
    private String postBy;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getGivenAnswer() {
	return givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer) {
	this.givenAnswer = givenAnswer;
    }

    public String getPostBy() {
	return postBy;
    }

    public void setPostBy(String postBy) {
	this.postBy = postBy;
    }

}
