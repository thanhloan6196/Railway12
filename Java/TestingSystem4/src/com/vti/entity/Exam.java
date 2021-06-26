package com.vti.entity;

import java.util.Date;

public class Exam {
	private int id;
	private String code;
	private String title;
	private CategoryQuestion categoryQuestion;
	private String duration;
	private Account creatorID;
	private Date createDate;
	private Question[] questions;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}
	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Account getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(Account creatorID) {
		this.creatorID = creatorID;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	
	
}
