/*
 Programa possui uma simples logica que calcula a média de um aluno em três provas e exibe uma mensagem com a
 situação do aluno nessa disciplina.P
*/

package programs.java;

import java.util.Scanner;

public class ArithmeticAverage {
    public static double calculate(double x, double y, double z) {
        double aux = (x + y + z) / 3;

        return aux;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;

        try {
            System.out.println("Type the first grade: ");
            grade1 = input.nextDouble();

            System.out.println("Type the second grade: ");
            grade2 = input.nextDouble();

            System.out.println("Type the third grade: ");
            grade3 = input.nextDouble();
        }catch(Exception e) {
            System.out.println("An error occurred.");
            return;
        }

        if(grade1 < 0 || grade2 < 0 || grade3 < 0) {
            System.out.println("You entered an invalid grade.");
            return;
        }else if(grade1 > 10 || grade2 > 10 || grade3 > 10){
            System.out.println("You entered an invalid grade.");
            return;
        }

        double result = calculateMedia(grade1, grade2, grade3);
        System.out.println("The average is: " + result);

        if (result >= 7) {
            System.out.println("Approved");
        } else {
            if (result < 4) {
                System.out.println("Disapproved");
            } else {
                System.out.println("Final Test");
            }
        }
    }
}
