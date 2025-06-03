package Main;

import java.util.ArrayList;
import java.util.List;

public class student {
	int rollno;
	String name, address;

	student(String name, int rollno, String address) {
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	public static void main(String[] args) {
		student st = new student("sairam", 2, "Rajahmundry");
		student st1 = new student("siva", 3, "Kakinada");
		student st3 = new student("srinu", 4, "Karimnagar");
		List<student> str = new ArrayList<>();
		str.add(st);
		str.add(st3);
		str.add(st1);
		for (student s : str) {
			System.out.println(s.rollno + " " + s.address + " " + s.name);
		}
	}
}
