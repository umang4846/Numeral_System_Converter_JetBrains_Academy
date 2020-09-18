import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();

        if (string.length() % 2 != 0) {
            System.out.print(string.substring(0, string.length() / 2));
            System.out.print(string.substring(string.length() / 2 + 1));
        } else {
            System.out.print(string.substring(0, string.length() / 2 - 1));
            System.out.print(string.substring(string.length() / 2 + 1));
        }
    }
}