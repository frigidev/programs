//Programa calcula a média de um aluno em três provas e exibe uma mensagem com a situação do aluno nessa disciplina

package programs.java;

import java.util.Scanner;

public class MediaParam {
    public static double calcularMedia(double x, double y, double z) {
        double aux = (x + y + z) / 3;

        return aux;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = input.nextDouble();

        if (nota1 > 10 || nota2 > 10 || nota3 > 10) {
            System.out.println("Insira uma nota valida");
            System.exit(0);
        } else if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Insira uma nota valida");
            System.exit(0);
        }

        double resultado = calcularMedia(nota1, nota2, nota3);
        System.out.println("A media eh: " + resultado);

        if (resultado >= 7) {
            System.out.println("Aprovado");
        } else {
            if (resultado < 4) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Prova Final");
            }
        }
    }
}
