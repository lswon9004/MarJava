package day0329.exception;

import java.util.Scanner;

public class IdFormatExceptionEx {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) throws IdFormayException {
		if (id == null) {
			throw new IdFormayException("아이디는 null일 수 없습니다.");
		}
		if (id.length() < 5 || id.length() > 10) {
			throw new IdFormayException("아이디는 5자 이상 10자 이하로 작성하세요.");
		}
		this.id = id;
	}

	public static void main(String[] args) {
		IdFormatExceptionEx idt = new IdFormatExceptionEx();
		Scanner s = new Scanner(System.in);

		
		while (idt.getId() == null) {
			System.out.print("저장할 id값을 입력하세요 > ");
			String id = s.next();
			try {
				idt.setId(id);
				System.out.println("저장되었습니다. " + idt.getId());
			} catch (IdFormayException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
