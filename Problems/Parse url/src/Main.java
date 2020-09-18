import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringUrl = scanner.next().split("\\?");
        scanner.close();

        String password = "";
        String[] parameterArray = stringUrl[1].split("&");
        for (String s : parameterArray) {
            String[] keyValueArray = s.split("=");
            if (keyValueArray[0].equalsIgnoreCase("pass")) {
                password = keyValueArray[1];
            }
            if (!keyValueArray[0].isEmpty() && keyValueArray.length == 1) {
                System.out.println(keyValueArray[0] + " : not found");
            } else {
                System.out.println(keyValueArray[0] + " : " + keyValueArray[1]);
            }
        }
        if (!password.isEmpty()) {
            System.out.println("password : " + password);
        }
    }
}