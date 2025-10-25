package switchToModule;

import java.io.Serializable;
import java.util.Comparator;

public class InterfaceClass implements Serializable {
	
	private InterfaceClass() {
		
	}

}

class run implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class run1 implements Comparable<T>{

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class run2 implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
//normal interface-
//marker interface-
//functional interface-
//why we can't extends from class to interface
//what is the current version of jdk and what is the advantage?25
//what is the current version of selenium- 4.35
//constructor chaining


