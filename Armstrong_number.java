public class Armstrong_number {

    public static void main(String[] args) {
        // 153--> 1   5   5
        //Armstrong number means , if we qube of each digit from once to  n
        // place then the sum of each is equal to the original digit
        //9--To find Armstrong Number between two given number.
        // 1*1*1 +5*5*5 + 3*3*3= 153
        int n = 120;
        int temp = n;
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("Its armstrong the number ");
        } else {
            System.out.println("Its armstrong the number");
        }
    }
}
