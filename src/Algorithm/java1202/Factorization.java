package Algorithm.java1202;

//인수 - 1* 12  = 12  -> 1과 12는 인수
//소인수 - 소수인 인수 (12읜 인수중 소수 2,3)
//소인수 분해 구하기1 - 자연수에서 소수가 나올때까지 계속 소수로 나누는것
//
public class Factorization {
    //n이 자연수
    private void  primeFactorization (int n){
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }

    public static void main(String[] args) {
        Factorization f = new Factorization();
        f.primeFactorization(72);
    }

}
