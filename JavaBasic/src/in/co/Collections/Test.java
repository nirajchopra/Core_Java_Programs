package in.co.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("hey");
		c.add('g');
		c.add(1);
		c.add(80.0);
		c.add(true);
		
		System.out.println(c.size());

	}

}
