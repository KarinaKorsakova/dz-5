public class Main {
    public static void main(String [] args) {
        int a = 25;
        int b = 10;
        int c = 5;
        int d = 20;

        int result1 = a + b;
        int result2 = c + d;
        System.out.println(result1 > result2);

        int e = ++result1;
        int f = result2--;
        System.out.println(e > f);

        if (e % 2 | f % 2)
            System.out.println("true");
        else
            System.out.println("falce");
    }

}
