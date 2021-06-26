package TestingSystem5.Abstraction_Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTest5 {
	static List<News> listNews = new ArrayList<News>();

	public static void main(String[] args) {

		System.out.println(" ===========================Welcome to Program MyNews==============================");
		Scanner sc = new Scanner(System.in);
		int idChucNang = 0;
		while (idChucNang != 4) {
			System.out.println("Please choose function: ");
			System.out.println(" Enter 1: Insert News");
			System.out.println(" Enter 2: View List News");
			System.out.println(" Enter 3: Average Rate");
			System.out.println(" Enter 4: Exit");
			idChucNang = sc.nextInt();
			switch (idChucNang) {
			case 1:
				insertNews();
				break;
			case 2:
				viewListNews();
				break;
			case 3:
				averageRate();
				break;
			case 4:
				System.out.println("Thank You For Using Program MyNews!");
				break;
			default:
				System.err.println(" Please choose 1 to 4!");
				break;
			}
		}

	}

	private static void insertNews() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(" Enter title: ");
		String title = sc.nextLine();
		System.out.println(" Enter Publish Date: ");
		String publishDate = sc.nextLine();
		System.out.println(" Enter author: ");
		String author = sc.nextLine();
		System.out.println(" Enter Content: ");
		String content = sc.nextLine();

		int[] rates = new int[3];
		for (int i = 0; i < rates.length; i++) {
			System.out.println(" Danh gia thu " + (i + 1) + ": ");
			rates[i] = sc.nextInt();

		}

		News new1 = new News(id, title, publishDate, author, content, rates);
		listNews.add(new1);

	}

	private static void viewListNews() {
		for (News news : listNews) {
			news.Display();
		}

	}

	private static void averageRate() {
		for (News news : listNews) {
			System.out.println(" Title: " + news.getTitle() + "/ Average Rate: " + news.Caculate());
		}

	}
}
