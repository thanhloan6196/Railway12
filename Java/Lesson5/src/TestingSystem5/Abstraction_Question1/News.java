package TestingSystem5.Abstraction_Question1;

public class News implements INews{
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;
	
	public News(int id, String title, String publishDate, String author, String content, int[] rates ) {
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.rates = rates;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	
	public void setRates(int[] rates) {
		this.rates = rates;
	}
	@Override
	public void Display() {
		System.out.println(" Title: " + title + " , PublishDate: " + publishDate
				+ " , Author: " + author + " , Content: " + content);
		
	}
	@Override
	public float Caculate() {
		float averageRate = (float) ( rates[0] + rates[1] + rates[2])/3;
		return averageRate;
	}
	
	
	
	
}
