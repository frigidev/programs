/*
    Programa desenvolvido para demonstrar conceitos das operações bit a bit envolvendo operandos de tipo booleano e
    inteiros. Para os inteiros, insira os valores de cada um deles e será exibida a sua conversão em binário e em
    seguida feitas as operações AND, OR e XOR com esses números.
*/

package programs.java;

import javax.swing.*;

public class OperacoesBitBitBoolEInt {
    public static void inteirosOperacoesBinarias() {

        String msg1 = "A seguir entre com dois números inteiros para serem realizadas as operações bit a bit AND, OR e XOR com esses números.";

        String representacaoBinaria1 = "Representação binária do primeiro número: ";
        String representacaoBinaria2 = "\nRepresentação binária do segundo número: ";

        String operacaoAND = "A operação bit a bit AND do primeiro e do segundo número possui resultado de: ";
        String operacaoOR = "\nA operação bit a bit OR do primeiro e do segundo número possui resultado de: ";
        String operacaoXOR = "\nA operação bit a bit XOR do primeiro e do segundo número possui resultado de: ";

        StringBuffer buffer1 = new StringBuffer();

        JOptionPane.showMessageDialog(null, msg1);

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

        buffer1.append(representacaoBinaria1);
        buffer1.append(binario1);
        buffer1.append(representacaoBinaria2);
        buffer1.append(binario2);

        String strings1 = buffer1.toString();

        JOptionPane.showMessageDialog(null, strings1);

        StringBuffer buffer2 = new StringBuffer();

        int resultado1 = n1 & n2;
        String resultadoBinario1 = Integer.toBinaryString(resultado1);

        int resultado2 = n1 | n2;
        String resultadoBinario2 = Integer.toBinaryString(resultado2);

        int resultado3 = n1 ^ n2;
        String resultadoBinario3 = Integer.toBinaryString(resultado3);

        buffer2.append(operacaoAND);
        buffer2.append(resultadoBinario1);
        buffer2.append(operacaoOR);
        buffer2.append(resultadoBinario2);
        buffer2.append(operacaoXOR);
        buffer2.append(resultadoBinario3);

        String strings2 = buffer2.toString();

        JOptionPane.showMessageDialog(null, strings2);
    }

    public static void main(String[] args){

        StringBuffer buffer1 = new StringBuffer();

        String msg1 = "Para realizar as operações a seguir, levo em consideração que: \n\n 0 = false = ausência de energia e que \n 1 = true = presença de energia.";

        String msg2 = "O valor de x é: true, e o de y é false. \n\n Levando em conta seus valores booleanos, realizadas as operações bit a bit temos como resultados: \n\n O valor de NOT x é: ";

        String valorAND = "\n O valor de x AND y é: ";
        String valorOR = "\n O valor de x OR y é: ";
        String valorXOR = "\n O valor de x XOR y é: ";

        JOptionPane.showMessageDialog(null, msg1);

        //Operações booleanas com operadores bit a bit

        boolean x = true;
        boolean y =! x; // x NOT y = false

        boolean a = x & y; // x AND y em nível lógico
        boolean b = x | y; // x OR y em nível lógico
        boolean c = x ^ y; // x XOR y em nível lógico

        buffer1.append(msg2);
        buffer1.append(y);
        buffer1.append(valorAND);
        buffer1.append(a);
        buffer1.append(valorOR);
        buffer1.append(b);
        buffer1.append(valorXOR);
        buffer1.append(c);
        buffer1.append("\n");

        String strings1 = buffer1.toString();

        JOptionPane.showMessageDialog(null, strings1);

        inteirosOperacoesBinarias();
    }
}
