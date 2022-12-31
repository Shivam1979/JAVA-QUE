import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        // we know that area of triangle A = 1/2(l)*(b); it is half of base times hieght
        System.out.println("FIND THE AREA OF TRIAGLE ");
        System.out.println("Please Enter the Length of Base and Height ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        double tri = (b)*(h)*0.5;
        System.out.println("Area of triangle is "+tri);
    }
}
