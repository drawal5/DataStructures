package my.datastructure;

import java.util.Arrays;

public class HashFunction {
	String theArray[];
	int arraySize;  
	int itemsInArray=0;
	
	
	HashFunction(int size){
		this.arraySize=size;
	    theArray= new String[size];
	    Arrays.fill(theArray,"-1");
	}
	
	
	public static void main (String[] args) {
		
	}

}
