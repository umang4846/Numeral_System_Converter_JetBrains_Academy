import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toLowerCase().toCharArray();
        scanner.close();

        int cAndGCounter = 0;
        for (char c : charArray) {
            if (c == 'c' || c == 'g') {
                cAndGCounter++;
            }
        }
        double cAndGPercentage = (double) cAndGCounter / charArray.length * 100;
        System.out.println(cAndGPercentage);
    }
}