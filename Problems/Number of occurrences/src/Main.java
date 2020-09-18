import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringLine = scanner.nextLine().split(" ");
        String subString = scanner.next();
        scanner.close();

        int count = 0;
        for (String string : stringLine) {
            if (subString.length() > 1 && string.contains(subString)) {
                count++;
            }
            if (subString.length() <= 1) {
                char[] chars = string.toCharArray();
                for (char c : chars) {
                    if (c == subString.toCharArray()[0]) {
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }
}