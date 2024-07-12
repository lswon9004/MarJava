package day0409.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		Person p1 = new Person("김자바","학생");
		Person p2 = new Person("이자바","요리사");
		//파일에 객체를 저장 : 파일에 객체를 직렬화해 출력하는 스트림
		
		try(FileOutputStream fos = new FileOutputStream("Serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)	){
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//파일로부터 객체를 읽어 오는 스트림(역작렬화 == 객체복원)
		try(FileInputStream fis = new FileInputStream("Serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)	){
			Person kim = (Person)ois.readObject();
			Person lee = (Person)ois.readObject();
			
			System.out.println(kim);
			System.out.println(lee);

		} catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
