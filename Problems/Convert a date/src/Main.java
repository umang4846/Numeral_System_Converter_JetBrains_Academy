import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();

        String[] stringArray = string.split("-");

        System.out.printf("%s/%s/%s", stringArray[1], stringArray[2], stringArray[0]);
    }
}