package com.array.task;

import java.util.*;
public class Durstenfeld_Shuffle {
	
	
	    public static void main(String[] args) {
	       
	        Scanner ip=new Scanner(System.in);
	        
	        int n=ip.nextInt(); //Array size
	        int arr[]=new int[n]; 
	        
	        for(int i=0;i<n;i++) {
	        	arr[i]=ip.nextInt();  //User input
	        }
	      
	        shuffleArray(arr);

	        
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        for (int i = n - 1; i > 0; i--) {
	            // Generate a deterministic index based on the current index
	            int j = i - (i + 1) % 2 * i / 2;

	            // Swap elements at indices i and j
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	


}
