public class Subtraction {
    public String a;
    public String b;

    public String getSubtraction (String a, String b) {
        this.a = a;
        this.b = b;

        String result = null;
        if(a.contains(b)) {
            return a.replace(b, "");
        } else {
            return a;
        }
    }
}