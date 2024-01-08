package com.basic;

		/*Java’s StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in
		  java is same as String class except it is mutable i.e. it can be changed.
		  This class is also in java.lang package.
		 * 
		 */
public class StringBufferDemo {	

		  public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    
		    StringBuffer sb1= new StringBuffer();
		    System.out.println(sb1.capacity());
		    
		    StringBuffer sb2= new StringBuffer(" Sudarshan ");
		    System.out.println(sb2.capacity());
		    
		    StringBuffer sb3= new StringBuffer(100);
		    System.out.println(sb3.capacity());
		    
		    sb2.ensureCapacity(50);
		    System.out.println(sb2.capacity());
		    
		    sb2.append(" Narhe");
		    System.out.println(sb2);
		    
		    sb2.insert(8, "Pavan");
		    System.out.println(sb2);
		    
		    sb2.replace(1,7 , "Aadarsh");
		    System.out.println(sb2);
		    
		    sb2.delete(9, 14);
		    System.out.println(sb2);
		    
		    sb2.reverse();
		    System.out.println(sb2);
		    
		    System.out.println(sb2.compareTo(sb3));
		    System.out.println(sb2.compareTo(sb2));
		    
		    
		    
		  }

	}


