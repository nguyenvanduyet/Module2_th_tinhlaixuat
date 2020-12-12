import java.util.Scanner;

public class Tinhlai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        double money = input.nextDouble();
        System.out.println("Enter number of months:");
        int month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        double interest_rate = input.nextDouble();
        double Profit_amount = 0;
        for (int i = 0; i < month; i++) {
            Profit_amount += money * (interest_rate / 100) / 12 * month;
        }
        System.out.println("lãi xuất nhận được là:" + Profit_amount);

    }
}
