/*
 * 
 * A guessing game. The program was developed to practice and demosntrate concepts of arrays and the binary search algorithm.
 * 
 */

package programs.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		BinarySearch binarySearch = new BinarySearch();
		
		System.out.println("Type the numbers amount of your list:\n");
		int number = read.nextInt();
		var arrayCreated = binarySearch.createArray(number);
		
		var sumElement = binarySearch.sumArray(arrayCreated);

		var filledArray = binarySearch.fillDinamically(arrayCreated, sumElement);
		
		System.out.println("\nTry to find a number generated in the list, typing him below:\n");
		int searched = read.nextInt();
		binarySearch.binarySearch(filledArray, searched);
		
		System.out.println("\nThe list numbers was:\n");
		binarySearch.printArray(filledArray);
		
		read.close();
		
	}		
}

class BinarySearch implements ArrayMethods{
	
	//method create an empty array of the size which the user type and return this array
	@Override
	public int[] createArray(int number) {
		int array[] = new int[number];
		System.out.println("\nThe list with " + array.length + " numbers was created.");
		return array;
	}
	
	//method fill the spaces of the array created by the user multiplying for pairs integers and after sum the values 
	//of the elements and return this sum
	@Override
	public int sumArray(int[] array){
		int element = 0;
		int pairs = 0;
		for(int i=0; i<array.length; i++) {
			array[i] = i * pairs;
			element = element + array[i];
			pairs += 2;
		}
		return element;
	}
	
	//method fill the spaces of the array created by the user, taking the sum of the method sumArray() and multiplying this
	//sum for odd numbers according to the size of the array and return this array filled
	@Override
	public int[] fillDinamically(int[] array, int elementSum) {
		int j = 1;
		for(int i=0; i<array.length; i++) {
			array[i] = elementSum*j;
			j += 2;
		}
		return array;
	}
	
	//method prints the elements of the array which the user created
	@Override
	public void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	//method realize the search of elements in the array, that was created in a sorted form, so, the binary search, 
	//an algorithm with complexity O(log n) works perfectly good in this situation, no matter the size of the array
	//which the user create, searching the information efficiently
	@Override
	public void binarySearch(int array[], int searched) {
		int begin = 0, mid, end = array.length - 1;
		boolean found = false;
		while(begin <= end) {
			mid = ((int) (begin + end) / 2);
			if(array[mid] == searched) {
				found = true;
				break;
			}else if(searched > array[mid]) {
				begin = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		if(found) {
			System.out.println("\nThe number was found in the list.");
		}else {
			System.out.println("\nThe number doesn't exist in the list.");
		}
	}
}
	
interface ArrayMethods {
	
	public int[] createArray(int number);
	
	public int sumArray(int[] array);
	
	public int[] fillDinamically(int array[], int elementSum);
	
	public void printArray(int[] array);
	
	public void binarySearch(int array[], int searched);
	
}
