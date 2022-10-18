import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, total =0;
        Scanner scan = new Scanner(System.in);
// here, teh codding is continues until the number is odd
        do {
            System.out.print("Enter Numbers: ");
            n = scan.nextInt();
            if ((n%2==0) && (n%4==0)) {
                total += n;



            }
        } while (n%2==0);
        System.out.print("Total: " + total);

        }

}