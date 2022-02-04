// Write a program in java to convert Number into words.
public class Q5 {
        // ANUPAM MOHARANA, CSE - 05, 20051130
    public static void main(String[] args) {
        int number = 1234;
        try {
            if (number == 0) {
                System.out.print("Number in words: Zero");
            } else {
                System.out.print(number + " : " + numberToWord(number));
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
    }

    public static String numberToWord(int number) {
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine" };
        String tensArray[] = { "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine" };

        if (number == 0) {
            return "zero";
        }
        if (number < 0) {
            String numberStr = " " + number;
            numberStr = numberStr.substring(1);
            return "minus " + numberToWord(Integer.parseInt(numberStr));
        }
        if ((number / 1000) > 0) {
            words += numberToWord(number / 1000) + " ";
            number %= 1000;
        }
        if ((number / 100) > 0) {
            words += numberToWord(number / 100) + " ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words += unitsArray[number];
            } else {
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += " " + unitsArray[number % 10];
                }
            }
        }
        return words;
    }
}