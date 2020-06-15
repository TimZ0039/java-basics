import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter two numbers:");
        double firstItem=in.nextDouble();
        double secondItem=in.nextDouble();
        System.out.println("The items I received:"+firstItem+","+secondItem);
    }
}

