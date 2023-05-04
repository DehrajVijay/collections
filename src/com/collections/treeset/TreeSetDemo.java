package com.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

//Write a Programa to inster integer objects into the TreeSet where the sorting 
//order is descending order:
class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else

			return 0;
	}

}

public class TreeSetDemo {

	public static void main(String[] args) {

		// TreeSet ts=new TreeSet(); this is the default sorting order constructor.
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(12);
		// ts.add(null);// NullPointerException if try to add null.
		ts.add(12);
		ts.add(22);
		ts.add(4);
		ts.add(56);
		ts.add(35);
		
		System.out.println(ts);
		// System.out.println(ts.add(null));
	}

}
