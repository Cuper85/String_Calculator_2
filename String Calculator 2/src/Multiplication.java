public class Multiplication {
    public String a;
    public String b;

    public String getMultiplication (String a, String b) throws Exception {
        this.a = a;
        this.b = b;

        b = b.replace("\"", "");

        int multi = Integer.parseInt(b);
        if (multi < 1 || multi > 10) {
            throw new IllegalArgumentException("Число должно быть от 1 до 10");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < multi; i++) {
            stringBuilder.append(a);
        }
        String result = stringBuilder.toString();

        if (result.length() > 40) {
            result = result.substring(0, 40) + "...";
        }

        return result;
    }
}