package com.TreeMap;

import java.util.Comparator;
//Insert string and stringBuffer using increasing length order
public class MyComparator_S_Sb implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		
	   int l1=s1.length();
	   int l2=s2.length();
	   
	   if(l1<l2)
	   {
		   return -1;
	   }
	   else if(l1>l2)
	   {
		   return 1;
	   }
	   else {
		   return s1.compareTo(s2);
	   }
	}

}
