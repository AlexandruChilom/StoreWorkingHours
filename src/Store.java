import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        System.out.println("Imput an hour: ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if (hour >= 9 && hour <= 22) {
            System.out.println("It's open!");
        } else {
            System.out.println("It's closed!");
        }
    }
}