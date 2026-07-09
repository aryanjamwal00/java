import java.util.Scanner;

public class PartTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            System.out.print("Invalid input");
            return;
        }

        String secretCode = sc.nextLine();

        // 6. If the input string has less than 9 characters, print Invalid input
        if (secretCode.length() < 9) {
            System.out.print("Invalid input");
            return;
        }

        // 1. Divide the string into three parts, having three characters each
        String firstPart = secretCode.substring(0, 3);
        String secondPart = secretCode.substring(3, 6);
        String thirdPart = secretCode.substring(6, 9);

        // 2. Process FirstPart: convert 1st and 3rd letters to numbers (a=1, b=2...), leave 2nd as alphabet
        int num1 = firstPart.charAt(0) - 'a' + 1;
        char char2 = firstPart.charAt(1);
        int num3 = firstPart.charAt(2) - 'a' + 1;
        String processedFirst = "" + num1 + char2 + num3;

        // 3. Process SecondPart: Reverse it
        String processedSecond = new StringBuilder(secondPart).reverse().toString();

        // 4. Process ThirdPart: Replace characters with the next letter (a->b, z->a)
        StringBuilder processedThird = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = thirdPart.charAt(i);
            if (ch == 'z') {
                processedThird.append('a');
            } else {
                processedThird.append((char) (ch + 1));
            }
        }

        // 5. Print the string in the order: ThirdPart + FirstPart + SecondPart
        System.out.print(processedThird.toString() + processedFirst + processedSecond);
    }
}
