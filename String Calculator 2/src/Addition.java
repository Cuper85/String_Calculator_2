public class Addition {
    public String a;
    public String b;

    public String getAddition (String a, String b) {
        this.a = a;
        this.b = b;

        String one = a.trim();
        String two = b.trim();

        String result = one + two;
        return result;
    }
}