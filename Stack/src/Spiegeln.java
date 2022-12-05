public class Spiegeln {

    public static void main(String[] args) {
        String s = "hallo";
        System.out.println(s + " gespiegelt ist " + spiegeln(s));
    }

    public static String spiegeln(String s) {
        if (s.length() == 0) {
            return "";
        }
        Stack st = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        String out = "";
        while (!st.isEmpty()) {
            out += st.pop();
            System.out.println(out);
        }
        return out;
    }
}
