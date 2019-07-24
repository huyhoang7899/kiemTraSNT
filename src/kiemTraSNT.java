import java.util.Scanner;

public class kiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number : ");
        int number = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < number; i ++){
            if (number % i == 0){
                check = false;
            }
        }
        if (check){
            System.out.println(number + " la so nguyen to");
        }else {
            System.out.println(number + " khong la so nguyen to");
        }
    }
}
