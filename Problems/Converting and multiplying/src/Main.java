import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];
        int i = 0;
        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.matches("\\d+")) {
                if (Integer.parseInt(input) == 0) {
                    break;
                }
                strings[i] = String.valueOf(Integer.parseInt(input) * 10);
            } else {
                strings[i] = "Invalid user input: " + input;
            }
            i++;
        }
        for (int j = 0; j < 10; j++) {
            if (strings[j] != null) {
                System.out.println(strings[j]);
            }
        }

    }
}