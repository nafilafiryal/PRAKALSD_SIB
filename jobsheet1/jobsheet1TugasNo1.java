import java.util.Scanner;

public class jobsheet1TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kode[] = {
            'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
        };
        char kota[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        System.out.print("Masukkan kode plat huruf: ");
        char kodePlat = input.next().charAt(0);

        switch (kodePlat) {
            case 'A':
                for (int i = 0; i < 6; i++) {
                    System.out.print(kota[0][i]);
                }
                break;
            case 'B':
                for (int i = 0; i < 7; i++) {
                    System.out.print(kota[1][i]);
                }
                break;
            case 'D':
                for (int i = 0; i < 7; i++) {
                    System.out.print(kota[2][i]);
                }
                break;
            case 'E':
                for (int i = 0; i < 7; i++) {
                System.out.print(kota[3][i]);
            }
            break;
            case 'F':
            for (int i = 0; i < 5; i++) {
                System.out.print(kota[4][i]);
            }
            break;
            case 'G':
                for (int i = 0; i < 10; i++) {
                System.out.print(kota[5][i]);
            }
            break;
            case 'H':
                for (int i = 0; i < 8; i++) {
                System.out.print(kota[6][i]);  
                }
                break;
            case 'L':
                for (int i = 0; i < 8; i++) {
                System.out.print(kota[7][i]);  
                }
                break;
            case 'N':
                for (int i = 0; i < 6; i++) {
                System.out.print(kota[8][i]);  
                }
                break;
            case 'T':
                for (int i = 0; i < 5; i++) {
                System.out.print(kota[9][i]);  
                }
                break;
        }
    }
}
