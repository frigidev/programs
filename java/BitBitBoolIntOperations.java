/*
    Program developed to demonstrate concepts of the bit-bit operations involving operands of the boolean type and integers. 
    For the integers, type the values of each one of them e the convertion will be displayed in binary and then made the
    operations AND, OR and XOR with these numbers.
*/

package programs.java;

import javax.swing.*;

public class BitBitBoolIntOperations {
    
    public static void integersBinaryOperations() {

        String msg1 = "Following type two integers numbers to be performed the bit-bit operations AND, OR and XOR with these numbers.";

        String binaryRepresentation1 = "Binary representation of the first number: ";
        String binaryRepresentation2 = "\nBinary representation of the second number: ";

        String ANDOperation = "The bit-bit operation AND of the first and the second number has the result: ";
        String OROperation = "\nThe bit-bit operation OR of the first and the second number has the result:  ";
        String XOROperation = "\nThe bit-bit operation XOR of the first and the second number has the result:  ";

        StringBuffer buffer1 = new StringBuffer();

        JOptionPane.showMessageDialog(null, msg1);

        String input1 = JOptionPane.showInputDialog("Type the first number value: ");
        int n1;

        try {
            n1 = Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The value entered is not an integer.");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred.");
            return;
        }

        String binary1 = Integer.toBinaryString(n1);

        String intput2 = JOptionPane.showInputDialog("Type the second number value: ");
        int n2;

        try {
            n2 = Integer.parseInt(intput2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The value entered is not an integer.");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred.");
            return;
        }

        String binary2 = Integer.toBinaryString(n2);

        buffer1.append(binaryRepresentation1);
        buffer1.append(binary1);
        buffer1.append(binaryRepresentation2);
        buffer1.append(binary2);

        String strings1 = buffer1.toString();

        JOptionPane.showMessageDialog(null, strings1);

        StringBuffer buffer2 = new StringBuffer();

        int result1 = n1 & n2;
        String binaryResult1 = Integer.toBinaryString(result1);

        int result2 = n1 | n2;
        String binaryResult2 = Integer.toBinaryString(result2);

        int result3 = n1 ^ n2;
        String binaryResult3 = Integer.toBinaryString(result3);

        buffer2.append(ANDOperation);
        buffer2.append(binaryResult1);
        buffer2.append(OROperation);
        buffer2.append(binaryResult2);
        buffer2.append(XOROperation);
        buffer2.append(binaryResult3);

        String strings2 = buffer2.toString();

        JOptionPane.showMessageDialog(null, strings2);
    }

    public static void main(String[] args){

        StringBuffer buffer1 = new StringBuffer();

        String msg1 = "To perform the following operations, I consider that: \n\n 0 = false = energy absense and that \n 1 = true = energy presence.";

        String msg2 = "The value of x is true, and of y is false. \n\n Considering your boolean values, performed the bit-bit operations we have as results: \n\n The value of NOT x is: ";

        String ANDvalue = "\n The value of x AND y is: ";
        String ORvalue = "\n The value of x OR y is: ";
        String XORvalue = "\n The value of x XOR y is: ";

        JOptionPane.showMessageDialog(null, msg1);

        //Boolean operations with bit-bit operands

        boolean x = true;
        boolean y =! x; // x NOT y = false

        boolean a = x & y;
        boolean b = x | y;
        boolean c = x ^ y;

        buffer1.append(msg2);
        buffer1.append(y);
        buffer1.append(ANDvalue);
        buffer1.append(a);
        buffer1.append(ORvalue);
        buffer1.append(b);
        buffer1.append(XORvalue);
        buffer1.append(c);
        buffer1.append("\n");

        String strings1 = buffer1.toString();

        JOptionPane.showMessageDialog(null, strings1);

        integersBinaryOperations();
    }
}
