import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempInC = scanner.nextDouble();
        scanner.close();
        System.out.println(tempInC * 1.8 + 32);
    }
}