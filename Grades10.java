import java.util.Scanner;

public class Grades10 {

    public static void main(String[] args){

        String names[] = new String[10];
        float grades[] = new float[10];
        float sum = 0;
        float res = 0;
        int i = 0;

        for(i = 0; i < 10; i++){
            System.out.println("Enter student " + (i+1) + " name: ");
            names[i] = new Scanner(System.in).nextLine();
            System.out.println("Enter student " + (i+1) + " grade: ");
            grades[i] = Float.parseFloat(new Scanner(System.in).nextLine());
            sum = sum + grades[i];
        }
        res = sum/i;
        System.out.printf("The average of the students is: " + res);
    }
}
