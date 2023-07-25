import java.util.Scanner;

public class MediaNotasTurma {

    public static void main(String[] args){

        String nomes[] = new String[10];
        double notas[] = new double[10];
        double soma = 0;
        double res = 0;
        int i = 0;

        for(i = 0; i < 10; i++){
            System.out.println("Entre com o nome do aluno " + (i+1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do aluno " + (i+1));
            notas[i] = Double.parseDouble(new Scanner(System.in).nextLine());
            soma = soma + notas[i];
        }
        res = soma/i;
        System.out.printf("A media da turma eh: " + res);
    }
}
