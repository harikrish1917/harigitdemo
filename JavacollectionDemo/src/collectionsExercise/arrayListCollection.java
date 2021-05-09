package collectionsExercise;

import java.util.ArrayList;
import java.util.List;

/*
 Collections
 ------------
 Primitive or non primitive data type variable can allow to store a single variable.
 Integer Example:
 ---------------- 
 int a = 10; //It is single data storage variable for integer variable.
 String example:
 --------------
 String str = "Java"; // //It is single data storage variable for string variable.
 
 Array
 -----
 Array is a collection of data stored with single array of variable.
 The array variable allows to store similar type of data.
 Example:
 --------
 int a[3] = {1,2,3}; // It is allowed to store only integer value.
 String v[3] = {"Java","Python","Data Science"};
 
 Collections is also collection of data similar to array but collections can allow to store different type of data.
 
 Collection is a interface. It can store by the value by using collections abstract method.
 
 Collection is allowed to store multiple values. There is no boundary of index.
 
 Collection can allow to store multiple values by using abstract method of add,remove,append,get,put etc....
 
 Collections required to known as - 1. List, 2. Set, 3.Optimized collections of Map.
 
 Java collections refer by java util package.
 
 Note: Array can store multiple values of homogenous of data. But collections stores multiple values of hetrogeneous of data.
 
  */

public class arrayListCollection {
  	
	
	public static void main(String[] args) {

		//List l = new ArrayList();
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add("Java");
		l.add(12.68);
		
		System.out.println(l);
		
		l.add("Python");
		System.out.println(l);
		l.add(0,"C++");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		
		
		
		//System.out.println(l.get(0));
		
		/*for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
	}

}
