import java.util.Scanner;

public class Caesar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char x = sc.next().charAt(0);
        int position = x - 'A';
        int neuePosition = (position + k) % 26;
        char neuerChar = (char) ('A' + neuePosition);
        System.out.println(neuerChar);
    }
}
