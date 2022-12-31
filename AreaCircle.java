import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("FIND THE AREA OF CIRCLE ");
        System.out.println("Enter the radius of crcle ");
        int r = sc.nextInt();

        double f = Math.PI *r*r;
        System.out.println("Area of circle is "+f);

    }
}
