public class Main {
    public static void main(String[] args) {
        string(2.2,3.2);
    }

    public static void string(double ...num){
        double result = 0;
        for(double n:num) {
            result += n;
        }
        System.out.println(result);
    }
    public static void string(int ...num){
        double result = 0;
        for(double n:num) {
            result += n;
        }
        System.out.println(result);
    }
}