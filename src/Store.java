import java.util.Scanner;
// Update: Aducem imbunatatiri cu orele, sa nu fie >24 && <0

public class Store {
    public static void main(String[] args) {
        System.out.println("Imput an hour: ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if (hour >= 9 && hour <= 22) {
            System.out.println("It's open!");
        } else if (hour <= 9 && hour >= 0 || hour >= 22 && hour <= 24) {
            System.out.println("It's closed!");
        }else {
            System.out.println("Error!");
        }
    }
}