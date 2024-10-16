import java.util.Scanner;

public class BMICalculator {

    public void printIntroduction(){
        System.out.println("Програма за изчисляване на Body Mass Index.");
    }

    public double getBMI(Scanner scanner) {
        System.out.print("Височина в см: ");
        double heightCm = scanner.nextDouble();
        System.out.print("Тегло в кг: ");
        double weightKg = scanner.nextDouble();

        double heightInches = heightCm * 0.3937;
        double weightPounds = weightKg * 2.2046;

        return bmiFor(weightPounds, heightInches);
    }

    public double bmiFor(double weight, double height){
        return weight * 703 / (weight * height);
    }

    public String getStatus(double bmi) {
        if (bmi <= 18.5) {
            return "underweight";
        } else if (bmi <= 25) {
            return "normal";
        } else if (bmi <= 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }

    public void reportResults(int resultNum, double bmi, String status){
        System.out.println("Човек номер " + resultNum + " има BMI = " + Math.round(bmi * 100.0) / 100.0);
        System.out.println("Той попада в категория: " + status);
    }

    public static void main(String[] args) {
        BMICalculator calculator = new BMICalculator();
        calculator.printIntroduction();

        Scanner scanner = new Scanner(System.in);

        double bmi = calculator.getBMI(scanner);
        String status = calculator.getStatus(bmi);

        calculator.reportResults(1, bmi, status);

    }

}