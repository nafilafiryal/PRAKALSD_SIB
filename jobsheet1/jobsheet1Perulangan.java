import java.util.Scanner;

public class jobsheet1Perulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nim :");
        String nim = input.nextLine();
        System.out.println("====================");
        
        int n = Integer.parseInt(nim.substring(nim.length() -2));
        if (n<10) {
            n += 10;
            System.out.println("n : " + n);
        }
         for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
         System.out.println();
    }
}