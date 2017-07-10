/*Write a program in java to show how the capacity is changing in StringBuffer or in StringBuilder if we 
append the string. */
package asst7_3;  //This java file is inside package named asst7_3 inside src folder.

// StringBuffer objects are mutable, thread safe class & its initial capacity is 16

// Every string buffer has a capacity. As long as the length of the character sequence contained in 
// the string buffer does not exceed the capacity, it is not necessary to allocate a new 
// internal buffer array. If the internal buffer overflows, it is automatically made larger.

//(oldcapacity*2)+2

//When we use toString() method, a new String object is allocated and initialized to contain 
//the character sequence currently represented by StringBuffer/StringBuilder object, that means 
//the subsequent changes to the StringBuffer/StringBuilder object do not affect the contents of 
//the String object.

public class StringBuffer_Builder_Demo{

	public static void main(String[] args) {

		StringBuffer sbObj = new StringBuffer();
		System.out.println("\n*****  Example of StringBuffer class ******");
		System.out.println("Defaut StringBuffer capacity is " + sbObj.capacity()); // initial capacity is 16
				StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println("Name of String sb is::::: " + sb);// prints Hello Java
		System.out.println("Length of Hello Java is " + sb.length()); // length : 10
		System.out.println("Capacity of Hello Java is " + sb.capacity()); //(10*2)+2, capacity : 22
		
	/*	StringBuilder ensureCapacity() method:::::::

		The ensureCapacity() method of StringBuilder class ensures that the given capacity is the minimum to the 
		current capacity. If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. 
		For example if your current capacity is 16, it will be (16*2)+2=34.*/
		
		System.out.println("\n***** Example of StringBuilder class ******");
		StringBuilder sb1=new StringBuilder();  
		System.out.println( "Defaut StringBuilder capacity is " + sb1.capacity()); //default 16  
		sb1.append("Hello");  
		sb1.append("java is my favourite language"); 
		System.out.println("Name of String sb1 is::::: " + sb1);
		sb1.ensureCapacity(10);   //now no change  
		System.out.println("Capacity of String sb1 is " + sb1.capacity()); //now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		//Changing the ensurecapacity
		sb1.ensureCapacity(50);//now (34*2)+2  
		System.out.println("New Capacity value is : " + sb1.capacity()); //now 70  
	}

}