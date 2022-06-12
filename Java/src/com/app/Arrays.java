package com.app;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Arrays {
   public static void main(String args[]) {
	   int arr[]=new int[5];
	   arr[0]=1;
	   arr[1]=2;
	   arr[2]=3;
	   arr[3]=4;
	   arr[4]=5;
	   System.out.println(arr[4]);
	   
	   String[] str=new String[5];
	   str[0]="Alvin";
	   str[1]="Alex";
	   str[2]="Smith";
	   str[3]="Kane";
	   str[4]="Root";
	   for(int i=0;i<5;i++) {
		   System.out.println(str[i]);
	   }
	   
	   float fl[] = {0.1f,0.2f,0.3f,0.4f,0.5f};
	   for(int i=0;i<fl.length;i++) {
		   System.out.println(fl[i]);
	   }
	   
	   int arr1[] = {1,2,3,4,5};
	   for(int k:arr1) {
		   System.out.println(k);
	   }
	   
	   // Collection
	   
	   Collection<Object> val = new ArrayList<>();
	   
	   val.add(5);
	   val.add(0.25);
	   val.add("Biswa");
	   
	   System.out.println(val);
	   
	   Iterator it = val.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   
	   // List
	   
	   List<Integer> lst = new ArrayList<>();
	   
	   lst.add(25);
	   lst.add(5);
	   lst.add(75);
	   
	   Collections.sort(lst);
	   Collections.reverse(lst);
	   Collections.shuffle(lst);

	   for(int i : lst) {
		   System.out.println(i);
	   }
	   
	   
	   // Set
	   
	   Set<Integer> set = new HashSet<>();
	   
	   set.add(25);
	   set.add(5);
	   set.add(75);
	   set.add(25);
	   set.add(5);
	   set.add(75);
	   
	   for(int i : set) {
		   System.out.println(i);
	   }
	   
	   // Map
	   
	   Map<Integer,String> map = new HashMap<>();
	   
	   map.put(1,"A");
	   map.put(2,"B");
	   map.put(3,"C");
	   map.put(4,"D");
	   map.put(5,"E");
	   
	   System.out.println(map);
	   System.out.println(map.get(1));
	   
	   Set<Integer> key = map.keySet();
	   for(Integer i : key) {
		   System.out.println(i + "  :  " + map.get(i));
	   }
	   
	   // ArrayList
	   
	   ArrayList<Integer> arr2 = new ArrayList<Integer>();
	   for(int i=1;i<=5;i++) {
		   arr2.add(i);
	   }
	   System.out.println(arr2);
	   
	   arr2.remove(2);
	   System.out.println(arr2);
	   
	   arr2.add(6);
	   arr2.add(7);
	   arr2.add(8);
	   
	   for(int i=0;i<arr2.size();i++) {
		   System.out.println(arr2.get(i)+" ");
	   }
   }
}
