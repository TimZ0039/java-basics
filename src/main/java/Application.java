public class Application {
    public static void main(String[] args){
       int x = 1;
       int y = polynomial(x);
       System.out.println(y);
    }

    public static void welcome(String name) {
        // print out "Hello" and the name
    }

    public static int polynomial(int x){
        int y = square(x)+2*x+1;
        return y;
    }


}
