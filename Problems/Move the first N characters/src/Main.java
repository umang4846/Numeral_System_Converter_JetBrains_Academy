import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toCharArray();
        int a = scanner.nextInt();

        if (charArray.length < a) {
            System.out.println(charArray);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = a; i < charArray.length; i++) {
                stringBuilder.append(charArray[i]);
            }

            for (int i = 0; i < a; i++) {
                stringBuilder.append(charArray[i]);
            }

            System.out.println(stringBuilder);
        }
    }
}