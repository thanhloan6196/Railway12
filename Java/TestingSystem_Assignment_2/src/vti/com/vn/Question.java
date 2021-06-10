package vti.com.vn;

import java.util.Date;

public class Question {
	int id;
	String content;
	CategoryQuestion categoryQuestion;
	TypeQuestion typeQuestion;
	Account creatorID;
	Date createDate;
	Exam[] exams;
}
