public class Factorial {
    public static void main(String[] args) {
       int i=1;
       int n = 5;
       int fact=1;
       while(i<=n) {
        fact=fact*i;
        i++;
       }
       System.out.println(fact);
    }
}
