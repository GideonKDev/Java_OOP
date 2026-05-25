package Java_OOP.tutorials.Exam_Revision;

import javax.swing.JOptionPane;

public class TaxCalculator {

    public void computeTax() {
        // i) Read the user's name
        String name = JOptionPane.showInputDialog("Enter your name:");

        // ii) Read monthly income (may have decimals)
        String incomeStr = JOptionPane.showInputDialog("Enter your monthly income:");
        double income = Double.parseDouble(incomeStr);

        // iii) Compute tax (30% of income)
        double tax = income * 0.30;

        // iv) Output the tax payable
        JOptionPane.showMessageDialog(null,
                "Hello " + name + ", your tax payable is: " + tax);
    }

    public static void main(String[] args) {
        // Instantiate the class and invoke the method
        TaxCalculator tc = new TaxCalculator();
        tc.computeTax();
    }
}
