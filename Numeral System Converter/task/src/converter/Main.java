package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceBase = 0;
        int targetBase = 0;
        try {
            String radixRegex = "([1-9]|1[0-9]|2[0-9]|3[0-6])";
            String validNum = "^([a-zA-Z0-9]+|([a-zA-Z0-9]+\\.[a-zA-Z0-9]+))$";

            String srcInput = scanner.nextLine().trim();
            if (srcInput.matches(radixRegex) && scanner.hasNextLine()) {
                sourceBase = Integer.parseInt(srcInput);
            } else {
                error();
                return;
            }

            String number = scanner.nextLine().trim();
            if (!number.matches(validNum) || !scanner.hasNextLine()) {
                error();
                return;
            }
            String[] intFractionArray = number.split("\\.");

            String targetInput = scanner.nextLine().trim();
            if (targetInput.matches(radixRegex)) {
                targetBase = Integer.parseInt(targetInput);
            } else {
                error();
                return;
            }
            scanner.close();

            StringBuilder stringBuilder = new StringBuilder();
            //Convert Integer part to target base
            stringBuilder.append(convertIntegerPart(sourceBase, intFractionArray[0], targetBase));
            //Convert Fraction part to target base
            if (intFractionArray.length == 2) {
                if (sourceBase != 10) {
                    intFractionArray[1] = convertFractionPartToDecimal(sourceBase, intFractionArray[1]);
                }
                stringBuilder.append(".").append(convertFractionPart(sourceBase, "0." + intFractionArray[1], targetBase));
            }
            System.out.println(stringBuilder.toString());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String convertFractionPartToDecimal(int sourceBase, String stringNum) {

        double decimalValue = 0;

        for (int i = 1; i <= stringNum.length(); i++) {
            if (stringNum.charAt(i - 1) > 9) {
                String num = Integer.toString(stringNum.charAt(i - 1), 10);
                decimalValue += Integer.parseInt(String.valueOf(stringNum.charAt(i - 1)), 36) / Math.pow(sourceBase, i);
            } else {
                decimalValue += stringNum.charAt(i - 1) / Math.pow(sourceBase, i);
            }
        }

        String[] strings = String.valueOf(decimalValue).split("\\.");
        return strings[1];

    }

    static String convertIntegerPart(int sourceBase, String stringNum, int targetBase) {
        StringBuilder stringBuilder = new StringBuilder();
        if (sourceBase == 1 || targetBase == 1) {
            if (sourceBase == 1) {
                String strNum = String.valueOf(stringNum);
                stringBuilder.append(Integer.toString(strNum.length(), targetBase));

            }
            if (targetBase == 1) {
                StringBuilder strNum = new StringBuilder();
                for (int i = 0; i < Integer.parseInt(stringNum); i++) {
                    strNum.append("1");
                }
                stringBuilder.append(strNum);

            }
        } else {
            if (sourceBase != 10) {
                stringNum = String.valueOf(Integer.parseInt(stringNum, sourceBase));
            }
            stringBuilder.append(Integer.toString(Integer.parseInt(stringNum), targetBase));
            //  System.out.println(stringBuilder);
        }
        return stringBuilder.toString();
    }

    static String convertFractionPart(int sourceBase, String stringNum, int targetBase) {
        StringBuilder stringBuilder = new StringBuilder();

       /* if (sourceBase == 1 || targetBase == 1) {
            if (sourceBase == 1) {
                String strNum = String.valueOf(stringNum);
                stringBuilder.append(Integer.toString(strNum.length(), targetBase));

            }
            if (targetBase == 1) {
                StringBuilder strNum = new StringBuilder();
                for (int i = 0; i < Integer.parseInt(stringNum); i++) {
                    strNum.append("1");
                }
                stringBuilder.append(strNum);

            }
        } else {
            if (sourceBase != 10) {
                stringNum = String.valueOf(Integer.parseInt(stringNum, sourceBase));
            }
            stringBuilder.append(Integer.toString(Integer.parseInt(stringNum), targetBase));
            System.out.println(stringBuilder);
        }*/
        stringBuilder.append(convertDecimalFraction(stringNum, targetBase));
        return stringBuilder.toString();
    }

    static String convertDecimalFraction(String stringFraction, int targetBase) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = new String[2];
        strings[1] = stringFraction;
        for (int i = 1; i <= 5; i++) {
            strings = String.valueOf(Double.parseDouble(strings[1]) * targetBase).split("\\.");
            strings[1] = "0." + strings[1];
            if (Integer.parseInt(strings[0]) > 9) {
                // stringBuilder.append(Integer.toHexString(Integer.parseInt(strings[0])));
                stringBuilder.append(Integer.toString(Integer.parseInt(strings[0]), 36));
            } else {
                stringBuilder.append(strings[0]);
            }
        }
        return stringBuilder.toString();
    }

    private static void error() {
        System.out.println("error");
    }

}
