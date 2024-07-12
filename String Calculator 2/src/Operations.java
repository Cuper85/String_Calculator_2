public class Operations {
    public String input;

    public static String detectedOperation(String input) throws Exception {


        if (input.contains("+")) {
            return "+";
        } else if (input.contains("-")) {
            return "-";
        } else if (input.contains("*")) {
            return "*";
        } else if (input.contains("/")) {
            return "/";
        } else {
            throw new Exception("Некорректный знак действия");
        }
    }
}