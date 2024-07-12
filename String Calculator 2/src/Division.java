public class Division {
    public String a;
    public String b;

    public String getDivision (String a, String b) {
        this.a = a;
        this.b = b;

        int delenie = a.length() / Integer.parseInt(b);
        String result = a.substring(0, delenie);
        return result;
    }
}