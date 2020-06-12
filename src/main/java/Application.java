public class Application {
    public static void main(String[] args){
       int x = 1;
       int y = polynomial(x);
       System.out.println(y);
    }

    public static int square(int a) {
        return a * a;
    }

    public static int polynomial(int x){
        int y = square(x)+2*x+1;
        return y;
    }


}
