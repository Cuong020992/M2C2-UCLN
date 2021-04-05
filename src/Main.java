import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("nhập vào số nguyên b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b == 0){
            System.out.println("Không có số nguyên lớn nhất");
        }

        while (a!=b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất là: "+a);
    }
}
