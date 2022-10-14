import java.util.Scanner;

public class Main {
        public static void main (String[]args) throws IllegalTringleException {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap canh a: ");
                int a = scanner.nextInt();
                System.out.println("Nhap canh b: ");
                int b = scanner.nextInt();
                System.out.println("Nhap canh c: ");
                int c = scanner.nextInt();
                if (a + b < c || a + c < b || b + c < a) {
                    throw new IllegalTringleException("Day khong phai 3 canh cua 1 tam giac");
                } else {
                    System.out.println("Day la 3 canh cua 1 tam giac");
                }
            } catch (NumberFormatException ex) {
                throw new IllegalTringleException("Day khong phai 3 canh cua tam giac");
            }

        }
    }