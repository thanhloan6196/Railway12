package com.vti.entity;

import java.util.Date;

public class Question {
	private int id;
	private String content;
	private CategoryQuestion categoryQuestion;
	private TypeQuestion typeQuestion;
	private Account creatorID;
	private Date createDate;
	private Exam[] exams;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}
	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}
	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}
	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
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
	public Exam[] getExams() {
		return exams;
	}
	public void setExams(Exam[] exams) {
		this.exams = exams;
	}
	
	
}
