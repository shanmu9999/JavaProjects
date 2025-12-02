package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Hashtable;

public class Collectionsjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] empname = new String[3];
		empname [0] = "sai";
		empname [1] = "barath";
		empname [2] = "Bharagav";
		
		System.out.println("Print name barath: "+empname[1]);
		
		// Wrapper class can be used where Primitive datatypes are used in the Collections basically Collections asre used for Non Primitive datatypes
		
		System.out.println("------------ARRAYLIST----------");
		// syntax = List <Datatype> variable = new Arraylist <Datatype> ();
				
        // Store employee names using ARRAYLIST
		
		List <String> empname1 = new ArrayList<String>();
		empname1.add("shanmukha");
		empname1.add("sai"); // sai got removed
		empname1.add("badiga");
		empname1.add("shanmukha");// duplicate value stored
		empname1.add(null); // adding null value
		empname1.remove("sai");// remove the employee
		System.out.println("Number of employees: " + empname1.size());
		System.out.println("Employee at index 3: " + empname1.get(3));
		System.out.println("Employee Names: " + empname1);
		
		System.out.println("------------LINKEDLIST----------");
		// Store employee names using LINKEDLIST
		
		List <String> empname2 = new LinkedList<String>();
		empname2.add("shanmukha");
		empname2.add("sai"); // sai got removed
		empname2.add("badiga");
		empname2.add("shanmukha");// duplicate value stored
		empname2.add(null); // adding null value
		empname2.remove("sai"); // remove the employee
		System.out.println("Number of employees: " + empname2.size());
		System.out.println("Employee at index 3: " + empname2.get(3));
		System.out.println("Employee Names: " + empname2);
		
		System.out.println("------------HASHSET----------");
		// Store employee names using HASHSET
		
		Set <String> empname3 = new HashSet<String>();
		empname3.add("shanmukha");
		empname3.add("sai");
		empname3.add("badiga");
		empname3.add("shanmukha");// duplicate value not stored
		empname3.add(null); // adding null value
		empname3.remove("sai"); // remove the employee
		System.out.println("Number of employees: " + empname3.size());
		// System.out.println("Employee at index 3: " + empname3.get(3));
		System.out.println("Employee Names: " + empname3);
		
		System.out.println("------------LINKEDHASHSET----------");
		// Store employee names using LINKEDHASHSET
		
		Set <String> empname4 = new LinkedHashSet<String>();
		empname4.add("shanmukha");
		empname4.add("sai");
		empname4.add("badiga");
		empname4.add("shanmukha");// duplicate value not stored
		empname4.add(null); // adding null value
		empname4.remove("sai"); // remove the employee
		System.out.println("Number of employees: " + empname4.size());
		// System.out.println("Employee at index 3: " + empname3.get(3));
		System.out.println("Employee Names: " + empname4);
		
		System.out.println("------------TreeSet----------");
		// Store employee names using TreeSet
		
		Set <String> empname5 = new TreeSet<String>();
		empname5.add("shanmukha");
		empname5.add("sai");
		empname5.add("badiga");
		empname5.add("shanmukha");// duplicate value not stored
		//empname5.add(null); // adding null value not stored
		empname5.remove("sai"); // remove the employee
		System.out.println("Number of employees: " + empname5.size());
		// System.out.println("Employee at index 3: " + empname3.get(3));
		System.out.println("Employee Names: " + empname5);
		
		System.out.println("------------HashMap----------");
		// Store employee names using HashMap
		
		Map <String,Integer> empname6 = new HashMap<String,Integer>();
		empname6.put("shanmukha",1234);
		empname6.put("sai",1234);
		empname6.put("badiga",1234);
		empname6.put("shanmukha",1234);// duplicate value not stored
		empname6.put(null,null); // adding null value
		empname6.remove("sai",1234); // remove the employee
		System.out.println("Number of employees: " + empname6.size());
		System.out.println("Employee at index 3: " + empname6.get("badiga"));
		System.out.println("Employee Names: " + empname6);
		
		System.out.println("------------LinkedHashMap----------");
		// Store employee names using LinkedHashMap
		
		Map <String,Integer> empname7 = new LinkedHashMap<String,Integer>();
		empname7.put("shanmukha",1234);
		empname7.put("sai",1234);
		empname7.put("badiga",1234);
		empname7.put("shanmukha",1235);// duplicate value not stored
		empname7.put(null,null); // adding null value
		empname7.remove("sai",1234); // remove the employee
		System.out.println("Number of employees: " + empname7.size());
		System.out.println("Employee at index 3: " + empname7.get("Shanmukha"));
		System.out.println("Employee Names: " + empname7);
		
		System.out.println("------------TreeMap----------");
		// Store employee names using TreeMap
		
		Map <String,Integer> empname8 = new TreeMap<String,Integer>();
		empname8.put("shanmukha",1234);
		empname8.put("sai",1234);
		empname8.put("badiga",1234);
		empname8.put("shanmukha",1235);// duplicate value not stored
		// empname8.put(null,null); // adding null value
		empname8.remove("sai",1234); // remove the employee
		System.out.println("Number of employees: " + empname8.size());
		System.out.println("Employee at index 3: " + empname8.get("badiga"));
		System.out.println("Employee Names: " + empname8);
		
		System.out.println("------------HashTable----------");
		// Store employee names using HashTable
		
		Map <String,Integer> empname9 = new Hashtable<String,Integer>();
		empname9.put("shanmukha",1234);
		empname9.put("sai",1234);
		empname9.put("badiga",1234);
		empname9.put("shanmukha",1235);// duplicate value not stored
		// empname9.put(null,null); // adding null value
		empname9.remove("sai",1234); // remove the employee
		System.out.println("Number of employees: " + empname9.size());
		System.out.println("Employee at index 3: " + empname9.get("badiga"));
		System.out.println("Employee Names: " + empname9);
		
		
		
		
		
		
		
		
		
		
		
	}

}
