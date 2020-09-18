import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toCharArray();
        scanner.close();

        char charValue = charArray[0];
        boolean isAlphbeticalOrder = true;
        for (int i = 1; i < charArray.length; i++) {
            if (charValue < charArray[i] && charValue == charArray[i] - 1) {
                charValue = charArray[i];
            } else {
                isAlphbeticalOrder = false;
                break;
            }
        }
        System.out.println(isAlphbeticalOrder);
    }
}