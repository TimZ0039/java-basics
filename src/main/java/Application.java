public class Application {
    public static void main(String[] args){
        int a = 10;
        int b = square(a);
        System.out.println(b);
    }

    public static int square(int a) {
        return a * a;
    }
}
