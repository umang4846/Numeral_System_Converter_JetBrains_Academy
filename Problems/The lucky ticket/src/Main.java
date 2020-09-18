import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.next();
        scanner.close();

        char[] ticketNumberInArray = ticketNumber.toCharArray();
        int f1 = Character.getNumericValue(ticketNumberInArray[0]);
        int f2 = Character.getNumericValue(ticketNumberInArray[1]);
        int f3 = Character.getNumericValue(ticketNumberInArray[2]);

        int sumOfFirst3Nums = f1 + f2 + f3;

        int l1 = Character.getNumericValue(ticketNumberInArray[3]);
        int l2 = Character.getNumericValue(ticketNumberInArray[4]);
        int l3 = Character.getNumericValue(ticketNumberInArray[5]);

        int sumOfFLast3Nums = l1 + l2 + l3;

        System.out.println(sumOfFirst3Nums == sumOfFLast3Nums ? "Lucky" : "Regular");
    }
}