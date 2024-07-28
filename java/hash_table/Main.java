package hash_table;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int op, value, key;
		Hashtable ht = new Hashtable();
		Scanner s = new Scanner(System.in);
		do {
			System.out.printf("\n0 - Leave\n1 - Add\n2 - Search\n3 - Print table");
			op = s.nextInt();
			switch(op) {
				case 0: 
					System.out.printf("Execution finished\n");
					break;
				case 1:
					System.out.printf("Which value do you want to add?\n");
					value = s.nextInt();
					ht.add(value);
					break;
				case 2: 
					System.out.printf("Which value do you want to search?\n");
					key = s.nextInt();
					int ret = ht.search(key);
					if(ret != 0) 
						System.out.printf("Value found: %d\n", ret);
					else
						System.out.printf("Value not found\n");
					break;
				case 3:
					ht.print();
					break;
				default: 
					System.out.printf("Invalid option\n");
			}	
		}while(op != 0);
		
		s.close();
	}
}
