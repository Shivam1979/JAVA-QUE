import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.println("Enter the height and width of reactangle ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ans = h*w;
        System.out.println("Area of reactangle is ::"+ ans);
    }
}
