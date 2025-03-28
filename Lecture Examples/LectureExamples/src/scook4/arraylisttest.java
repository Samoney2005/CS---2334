package scook4;

import java.util.*;

public class arraylisttest {
	public static void main (String [] args) {
		HashSet<Integer> set = new 
HashSet<Integer>(7);
				set.add(15);
				set.add(12);
				set.add(8);
				set.add(11);
				set.add(25);
		
		System.out.println("Hash set:" + set);
		set.remove(12);
		System.out.println("After removing 2:" + set);
		
		
		}
	}

