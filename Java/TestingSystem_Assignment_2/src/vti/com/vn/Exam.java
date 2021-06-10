package vti.com.vn;

import java.time.LocalDate;
import java.util.Date;

public class Exam {
	int id;
	String code;
	String title;
	CategoryQuestion categoryQuestion;
	String duration;
	Account creatorID;
	LocalDate createDate;
	Question[] questions;
	
}
