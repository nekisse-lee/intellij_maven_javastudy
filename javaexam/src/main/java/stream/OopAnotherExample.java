package stream;

public class OopAnotherExample {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        int additionResult = calculatorService.calculate('+', 1, 1);
        System.out.println(additionResult);

        int subtractionResult = calculatorService.calculate('-', 1, 1);
        System.out.println(subtractionResult);

        int multiplicationResult = calculatorService.calculate('*', 1, 1);
        System.out.println(multiplicationResult);

        int divistionResult = calculatorService.calculate('/', 8, 4);
        System.out.println(divistionResult);

    }
}


class CalculatorService {

    public int calculate(char calculation, int num1, int num2) {
        if (calculation == '+') {
            return num1 + num2;
        } else if (calculation == '-') {
            return num1 - num2;
        } else if (calculation == '*') {
            return num1 * num2;
        } else if (calculation == '/') {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Unknown calculation: " + calculation);
        }

    }


}
