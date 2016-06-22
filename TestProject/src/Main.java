import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		System.out.println("abc");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		for (String string : list) {
			System.out.println(string);
		}
		
		Student student = new Student();
		student.changeName();
		System.out.print(Student.name);
	}

}
