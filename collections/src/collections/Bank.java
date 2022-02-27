package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bank {

	public static void main(String[] args) {
 List<Employee> list=new LinkedList<>();
    list.add(new Employee("raju",1,"clerk",15000));
    list.add(new Employee("raj",2,"clerk",25000));
    list.add(new Employee("naj",3,"manager",55000));
  Iterator <Employee> itr= list.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
	 //comments//
 }
		
	}

}
