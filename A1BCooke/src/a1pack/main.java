package a1pack;

public class main {

	public static void main(String[] args) {
		// Declarations
	
		int arraySize 		= UserInterface.getSize();
		
		System.out.println("Array size is: " + arraySize + " X "+ arraySize);
	
		char[][] array2d	= new char[arraySize][arraySize];
		
		Utilities.fillArray2d(array2d);
		
		String name 		= UserInterface.getName().toLowerCase();
		
		System.out.println(name);
		
		Utilities.linearSearch(array2d, name);
		
		Utilities.sort(array2d, arraySize);
		
		
	}

}
