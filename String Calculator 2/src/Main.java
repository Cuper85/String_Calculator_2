import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Введите значения для расчета");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //    ("[+\\-*/]")
        String[] data = input.split("\\s[+*/-]\\s");
        String one = data[0].trim().replace("\"", "");
        String two = data[1].trim().replace("\"", "");
        String operation = null;

        Operations operations = new Operations();
        operation = operations.detectedOperation(input);

        if(input.equals("*") || input.equals("/")) {
            if(two.contains("\"")) {
                throw new Exception("Строчку можно делить или умножать только на число");
            }
        }
        if (one.length() > 10 || two.length() > 10) {
            throw new Exception("Длина строк не должна превышать 10 символов");
        }

        String finish = "";
        if (operation.equals("+")) {
            Addition addition = new Addition();
            finish = addition.getAddition(one, two);
        } else if (operation.contains("-")) {
            Subtraction subtraction = new Subtraction();
            finish = subtraction.getSubtraction(one, two);
        } else if (operation.equals("*")) {
            Multiplication multiplication = new Multiplication();
            finish = multiplication.getMultiplication(one, two);
        } else {
            Division division = new Division();
            finish = division.getDivision(one, two);
        }
        System.out.println("\"" + finish + "\"");
    }
}
