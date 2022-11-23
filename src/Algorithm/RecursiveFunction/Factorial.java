package Algorithm.RecursiveFunction;

//5
//5*4*3*2*1
public class Factorial {
    public int Sum(int n) {
        if (n == 1) return n; // n=1일때 , 탈출
        return n * Sum(n-1);
    }

    public static void main(String[] args) {
        Factorial pn = new Factorial();
        System.out.println(pn.Sum(5));
    }

}
