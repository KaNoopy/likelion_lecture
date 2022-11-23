package Algorithm.RecursiveFunction;

public class PrintStar {
    public void makeStar(int n){
        if (n <= 0) return;
        System.out.print("*");
        makeStar(n-1);
    }

    public static void main(String[] args) {
        PrintStar ps =new PrintStar();
        ps.makeStar(5);
    }

}
