package com.java.dsa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

class javaPractice {

	public static void main(String[] args) {
		

	int b[] = { 25, 58, 78,26, 94,25, 14, 26 };
	int cou =0;
	for(int j=0;j<b.length-1 ;j++) {
		for (int k = j + 1; k < b.length-1; k++) {
            if (b[j] == b[k]) {
                System.out.println(b[j]);
                //break; // To avoid printing the same duplicate multiple times
            }
       
		}
	}
	
	}	

}*/

public class JavaPractice {
	public static void main(String[] args) {
		int[] a = { 25, 58, 78, 26, 94, 25, 14, 26 }; // Example array
		List al = new ArrayList();
		
		al.add(1);
		al.add(21);
		al.add(32);
		al.add(5);
		al.add(9);
		al.add(78);
		
		System.out.println(al);
		//al.remove(4);
		System.out.println(al);
		
		System.out.println(al.lastIndexOf(78));
		al.lastIndexOf(al);
		Iterator itr =al.iterator();
		while (itr.hasNext()) {
			int x =(int) itr.next();
			if(x<10) {
				//itr.remove();
			}
				
		}
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al.removeIf(null));
		
		Predicate<Interger> p =s->
		//System.out.println(al.spliterator());
		

		
}
}
