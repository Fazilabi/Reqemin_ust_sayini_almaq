import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner((System.in));
        int a, b;
        System.out.println("reqemi daxil edin : ");
        a= input.nextInt();
        System.out.println("ust daxil edin : ");
        b = input.nextInt();
        int total = 1;
        // a^3 = a*a*a;
        for (int i = 1; i<=b; i++){
            total*=a;

        }
        System.out.println(total);
    }
}