package Java_OOP.tutorials.Exam_Revision;

import javax.swing.JOptionPane;

public class DB {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog(null, "Enter 1st number");
        float num1 = Float.parseFloat(input1);

        String input2 = JOptionPane.showInputDialog(null, "Enter 2nd number");
        float num2 = Float.parseFloat(input2);

        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;

        String divisionResult;
        if (num2 != 0) {
            divisionResult = String.format("%.2f", num1 / num2);
        } else {
            divisionResult = "Undefined (cannot divide by zero)";
        }

        String resultMessage = String.format(
            "First number: %.2f\n" +
            "Second number: %.2f\n\n" +
            "Results:\n" +
            "--------------------\n" +
            "Addition (+): %.2f\n" +
            "Subtraction (-): %.2f\n" +
            "Multiplication (*): %.2f\n" +
            "Division (/): %s",
            num1, num2, sum, difference, product, divisionResult
        );

        JOptionPane.showMessageDialog(
            null,
            resultMessage,
            "Calculation Results",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
