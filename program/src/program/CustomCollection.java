package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomCollection {

	public static void main(String[] args) {
 List<Student> list=new ArrayList<>();
 list.add(new Student(22,"shyam","ssvm"));
 list.add(new Student(25,"ram","dav"));
 list.add(new Student(24,"tina","dps"));
 list.add(new Student(26,"rina","carmel"));
Iterator<Student> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}
	

}
