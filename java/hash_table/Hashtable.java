/*
 * created to practice concepts of the hashtable data structure
 * in arrays, very efficient for search in a static amount of
 * elements, is hashtables keys can't be duplicated, and in this
 * example of hashtable the amount of elements is 10, then the
 * size of the array is defined following the formula -> closest prime number
 * of: amount of elements * 2
*/

package hash_table;

public class Hashtable {
	
	/*
	 * size for a hashtable to 10 elements,
	 * prime number closer to 10 * 2
	*/
	private final int size = 21;

	private int hashTable[] = new int[this.size];
	
	private int hashFunc (int key) {
		return key % this.size;
	}

	public void add(int value) {
		int t[] = this.hashTable;
		int index = hashFunc(value); 
		while(t[index] != 0) {
			index = hashFunc(index + 1);
		}
		t[index] = value;
	}
	
	public int search(int key) {
		int t[] = this.hashTable;
		int index = hashFunc(key);
		System.out.printf("Index generated: %d\n", index);
		while(t[index] != 0) {
			if(t[index] == key)
				return t[index];
			else 
				index = hashFunc(index + 1);
		}	
		return 0;
	}
	
	public void print() {
		int t[] = this.hashTable;
		for(int i=0; i < this.size; i++) {
			System.out.printf("%d = %d\n", i, t[i]);
		}
	}
	
}
