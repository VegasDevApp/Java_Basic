package stam;

public class Taxes {
    public static void main(String[] args) {

        double salary = Math.random() * 120_001;

        // Structure for taxes
        double[][] taxes = new double[4][2];

        // Structure for result
        // [0] = tax total
        // [1] = counted salary
        double[] result = new double[2];
        /*
         * We are using array to wrap results,
         * so we can pass this array to method
         * by reference because methods can return
         * only one value. Here we will work with two;
         * */

        // Step 1
        taxes[0][0] = 23_000;
        taxes[0][1] = 0.1;

        // Step 2
        taxes[1][0] = 50_000;
        taxes[1][1] = 0.2;

        // Step 3
        taxes[2][0] = 100_000;
        taxes[2][1] = 0.3;

        // Step 4
        taxes[3][0] = Double.MAX_VALUE;
        taxes[3][1] = 0.4;

        for (int i = 0; i < taxes.length - 1; i++) {
            calculateTaxStep(result, taxes[i], salary);
        }

        System.out.printf("Tax: %.2f\n\r", result[0]);
        System.out.printf("Salary: %.2f\n\r", salary);
        System.out.printf("Salary nett: %.2f\n\r", salary - result[0]);
    }

    public static void calculateTaxStep(double[] result, double[] taxStep, double salary) {
        if (salary - result[1] >= taxStep[0]) {
            // Update counted salary
            result[1] += taxStep[0];
            // Update total tax
            result[0] += taxStep[0] * taxStep[1];
        } else {
            // Update total tax
            result[0] += (salary - result[1]) * taxStep[1];
            // Update counted salary
            result[1] = salary;
        }
    }
}
