package hillel;

public class Amount {

    public static void main(String[] args) {
        int num = 6437;
        int a = num / 1000;
        int b = (num - (a * 1000)) / 100;
        int c = (num - (a * 1000) - (b * 100)) / 10;
        int d = (num - (a * 1000) - (b * 100)) - c * 10;
        int sum = a + b + c + d;
        System.out.println(sum);
    }
}
