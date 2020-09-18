import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder stringBuilder = new StringBuilder();
        //uppercase
        char charA = 65;
        //lowercase
        char charB = 97;
        //numbers
        char charC = 48;
        for (int i = 0; i < a; i++) {
            stringBuilder.append((char) (charA + i));
            if (charA + i > 90) {
                i = 0;
            }
        }
        for (int i = 0; i < b; i++) {
            stringBuilder.append((char) (charB + i));
            if (charB + i > 122) {
                i = 0;
            }
        }
        for (int i = 0; i < c; i++) {
            stringBuilder.append((char) (charC + i));
            if (charC + i > 57) {
                i = 0;
            }
        }

        if (stringBuilder.length() == n) {
            System.out.println(stringBuilder);
        } else {
            int requiredChar = n - stringBuilder.toString().length();
            String reverse = stringBuilder.substring(0, requiredChar);
            stringBuilder.append(reverse);
            System.out.println(stringBuilder);
        }
    }
}