/*
    Programa desenvolvido para demonstrar conceitos das operações bit a bit envolvendo operandos de tipo booleano e
    inteiros. Para os inteiros, insira os valores de cada um deles e será exibida a sua conversão em binário e em
    seguida feitas as operações AND, OR e XOR com esses números.
*/

import javax.swing.*;

public class OperacoesBitBitBoolEInt {
    public static void inteirosConvertidosBinario() {

        JOptionPane.showMessageDialog(null, "A seguir entre com dois números inteiros para" +
                " serem realizadas as operações bit a bit AND, OR e XOR com esses números.");

        String entrada1 = JOptionPane.showInputDialog("Digite o valor do primeiro número: ");
        int n1;

        try {
            n1 = Integer.parseInt(entrada1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro.");
            return;
        }

        String binario1 = Integer.toBinaryString(n1);

        String entrada2 = JOptionPane.showInputDialog("Digite o valor do primeiro número: ");
        int n2;

        try {
            n2 = Integer.parseInt(entrada2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro.");
            return;
        }

        String binario2 = Integer.toBinaryString(n2);

        JOptionPane.showMessageDialog(null,
                "Representação binária do primeiro número: " + binario1
                        + "\nRepresentação binária do segundo número: " + binario2);

        int resultado1 = n1 & n2;
        String resultadoBinario1 = Integer.toBinaryString(resultado1);

        int resultado2 = n1 | n2;
        String resultadoBinario2 = Integer.toBinaryString(resultado2);

        int resultado3 = n1 ^ n2;
        String resultadoBinario3 = Integer.toBinaryString(resultado3);

        JOptionPane.showMessageDialog(null,
                "A operação bit a bit AND do primeiro e do segundo numero possui resultado de: "
                        + resultadoBinario1 + " em binário.\n" +
                        "A operação bit a bit OR do primeiro e do segundo numero possui resultado de: "
                        + resultadoBinario2 + " em binário.\n" +
                        "A operação bit a bit XOR do primeiro e do segundo numero possui resultado de: "
                        + resultadoBinario3 + " em binário.");
    }

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
            "\n" + "Para realizar as operações a seguir, levo" +
            " em consideração que:" + "\n\n" +
            "0 = false = ausência de energia e que" + "\n" +
            "1 = true = presença de energia.");

        //Operações booleanas com operadores bit a bit

        boolean x = true;
        boolean y =! x; // x NOT / y = false

        boolean a = x & y; // x AND y em nível lógico
        boolean b = x | y; // x OR y em nível lógico
        boolean c = x ^ y; // x XOR y em nível lógico

        JOptionPane.showMessageDialog(null,
        "O valor de x é: true, e o de y é false." + "\n\n" +
                "Levando em conta seus valores booleanos, realizadas as operações bit a bit temos como resultados:" +
                " \n\n" +
                "O valor de NOT x é: " + y + "\n" +
                "O valor de x AND y é: " + a + "\n" +
                "O valor de x OR y é: " + b + "\n" +
                "O valor de x XOR y é: " + c + "\n");

        inteirosConvertidosBinario();
    }
}
