import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String string = "";
        String[] stringArray = s.split(" ");
        for (String value : stringArray) {
            if (value.length() > string.length()) {
                string = value;
            }
        }
        System.out.println(string);
    }
}