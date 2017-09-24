package a1pack;

import java.lang.reflect.Array;
import java.util.*;

public class Utilities {

	public static void fillArray2d(char[][] array2d){
		
		System.out.println("");
		
		if(array2d.length<=10){
			System.out.println("Unsorted array");
			for(int i=0; i < array2d.length; i++){
				for(int j=0; j < array2d.length; j++){
					
					Random r 		 = new Random();
					array2d[i][j]	 = (char)(r.nextInt(26) + 'a');
					
					System.out.print(array2d[i][j] + " ");
					
				}
				
				System.out.println("");
				
			}
		}else{
			
		for(int i=0; i < array2d.length; i++){
			for(int j=0; j < array2d.length; j++){
				
				Random r 		 = new Random();
				array2d[i][j]	 = (char)(r.nextInt(26) + 'a');
								
			}
		}
	}
}
	
	
	public static void linearSearch(char[][] array2d, String name){
		
		int nString		= 0;
		
			for(int i=0; i < array2d.length; i++){
				for(int j=0; j < array2d.length; j++){
					
					if(nString<name.length()){
						if(name.charAt(nString)==array2d[i][j]){
						
						System.out.println(name.charAt(nString)+":["+i+","+j+"]");
						
						}else{
							System.out.println(name.charAt(nString)+":[-1,-1]");
						}
						
						if(nString<name.length()+1){
							i=0;
							j=0;
							nString++;
						
						}else{
							i		= array2d.length;
							j		= array2d.length;
						}
						
					}
				
				}
			}
			
		System.out.println("");
		
	}
	
	
	public static void sort(char[][] array2d, int arraySize){
		
		char[] array1d		= new char[arraySize*arraySize];
		int n1d				= 0;

		for(int i=0; i < array2d.length; i++){
			for(int j=0; j < array2d.length; j++){
				array1d[n1d++]	= array2d[i][j];
			}
		}
		
		Arrays.sort(array1d);
		
		n1d					= 0;
		
		System.out.println("Sorted Array");
		
		for(int i=0; i < array2d.length; i++){
			for(int j=0; j < array2d.length; j++){
				array2d[i][j]	=array1d[n1d++];
				System.out.print(array2d[i][j] + " ");
				
			}
			System.out.println("");
		}
		
	}
	
	public static int binarySearch(){
		return 0;
	}
	
}
