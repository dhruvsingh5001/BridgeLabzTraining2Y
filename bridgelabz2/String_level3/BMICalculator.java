import java.util.Scanner;

class BMICalculator {
    static String[] calculateBMI(double weight, double height) {
        double heightMeter = height / 100;
        double bmi = weight / (heightMeter * heightMeter);
        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    static String[][] getBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            String[] bmi = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = bmi[0];
            result[i][3] = bmi[1];
        }

        return result;
    }

    static void display(String[][] data) {
        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" +
                    data[i][2] + "\t" + data[i][3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = getBMI(data);
        display(result);
    }
}