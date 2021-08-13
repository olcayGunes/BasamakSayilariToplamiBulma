import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, tempNumber, basValue, basNumber = 0, total = 0;
        System.out.print("Sayı: ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        for (int i = 1; i <= basNumber; i++) {
            basValue = tempNumber % 10;
            tempNumber /= 10;
            total += basValue;
        }
        System.out.println(number + " sayısının basamakları toplamı: " + total);
    }
}
