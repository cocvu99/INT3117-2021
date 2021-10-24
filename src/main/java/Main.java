import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HappyNumber happyNum = new HappyNumber();

        int number1 = input.nextInt(), number2 = input.nextInt();

        happyNum.TongHaiSo(number1, number2);

    }
}
