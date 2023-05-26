public class ArrayPlusFour {

    public static void main(String[] args){
        //Declaration of variables
        int numbers[][] = new int[3][2];
        int sum = 1;

        //Loops to add values in the array
        //Loops for traversing lines
        for(int i = 0; i < 3; i++){
            //Loops for traversing columns
            for(int j = 0; j < 2; j++){
                sum = sum + 4;
                numbers[i][j] = sum;
            }
        }
        //Loops to display values stored in the array
        //Loops for traversing lines
        for(int i = 0; i < 3; i++){
            //Loops for traversing columns
            for(int j = 0; j < 2; j++){
                System.out.println("Values for the line: " + (i+1) + " and column: " + (j+1) + ": ");
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println("End of execution");
    }
}
