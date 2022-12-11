import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println(" N' in R'li kombinasyonunu hesaplamak için:");
        System.out.print("N:");
        int n = num.nextInt();
        while (n < 1) {
            System.out.println("lütfen geçerli bir sayı giriniz:");
            System.out.print("N:");
            n = num.nextInt();


        }
        System.out.print("R:");
        int r = num.nextInt();
        while (r < 1) {
            System.out.println("lütfen geçerli bir sayı giriniz.");
            System.out.println("R:");
            r = num.nextInt();
        }
        long hesap = n / r * (n - r);
        System.out.print("Sonuç:" + hesap);



         }


        static long calculateFactorial( int enteredNumber) {
            long result = 1;
            for (int i = 1 ; i <= enteredNumber ; i++) {
                result *= i;
            }
            return result;




        }





    }

