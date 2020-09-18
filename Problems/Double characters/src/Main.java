import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toCharArray();
        scanner.close();

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : charArray) {
            stringBuilder.append(c).append(c);
        }
        System.out.println(stringBuilder);
    }
}