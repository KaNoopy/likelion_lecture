package Algorithm.RecursiveFunction;


// 두수 a,b
//수중에 가장큰 한개가 최대공약수
//a>b , gcd(a-b,b)
//a<b , gcd(a, b-a)
//a==b , a,b가 최대 공약수
public class GreatestCommonDivisor {
    public int gcd(int a, int b) {
        if (a > b) return gcd(a - b, b);
        else if (a < b) return gcd(a, b - a);
        else if (a == b) return a;
        return 1;
    }


    public static void main(String[] args) {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();
        System.out.println(divisor.gcd(196, 42));
    }
}
