import java.util.ArrayList;
import java.util.List;


public class ListStudent {

	List<Student> li;

	public ListStudent() {
		li = new ArrayList<Student>();
	}

	public static void main(String[] args) {

		Student stu = new Student("superman",10,10,20) ;
		li.add(stu);
		li.get(0);
		li.get(0);


	}
}

