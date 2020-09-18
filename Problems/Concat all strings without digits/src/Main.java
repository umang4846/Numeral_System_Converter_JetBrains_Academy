import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            sb.append(s);
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' || sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                result.append(sb.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}