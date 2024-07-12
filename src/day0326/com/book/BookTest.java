package day0326.com.book;


public class BookTest {

	public static void main(String[] args) {
		Book [] books =new Book[3];
		books[0] = new Book("SQL Plus",50000,5);
		books[1]= new Book("Java",40000,3);
		books[2]= new Book("Java Servlet",60000,6);
		
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		System.out.println("-----------------------------------");
		for (Book b: books) {
			System.out.println(b);
		}
	}

}
