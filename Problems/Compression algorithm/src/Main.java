import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        char[] charArray = s.toCharArray();
        char currentChar = 0;
        int currentCharCount = 0;
        StringBuilder algo = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (currentChar == charArray[i]) {
                currentCharCount++;
            } else {
                if (currentChar != 0) {
                    algo.append(currentChar).append(currentCharCount);
                }
                currentChar = charArray[i];
                currentCharCount = 0;
                currentCharCount++;
            }
            if (i == charArray.length - 1 && currentChar != 0) {
                algo.append(currentChar).append(currentCharCount);
            }

        }
        System.out.println(algo);

    }
}