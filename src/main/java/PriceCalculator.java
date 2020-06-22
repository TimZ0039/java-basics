import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        double firstItem=in.nextDouble();
        double secondItem=in.nextDouble();
        double price=firstItem+secondItem;
        System.out.println("The items I received:"+firstItem+","+secondItem);
        if (price > 50){
            System.out.println("$" + price + "That is too expensive");
        }
        else if (price < 10){
            System.out.println("$" + price + "That is a great deal.");
        }
        else
            System.out.println("$" + price);
    }
}

