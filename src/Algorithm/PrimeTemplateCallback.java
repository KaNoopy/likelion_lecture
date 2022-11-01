package Algorithm;

//소수 : 1, 자기 자신으로만 나눠지는 수
//방법 1. n의 수를 2~n-1수로 나눠서 remainder가 0이 아니면 소수
//방법 2. n의 수를 n/2미만의 수로 나누어 보는 방법
//방법 3. n의 수를 루트 n까지로 나누어 보는 방법
public class PrimeTemplateCallback { //templateCallback 적용 1단계
    boolean someOperation(int a,int b){
        return a<b;
    }
    public boolean solution(int n) { //n사이의 있는 소수 출력
        for (int i = 2; someOperation(i,n); i++) {
            if (n%i!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeTemplateCallback prime = new PrimeTemplateCallback();
        System.out.println(prime.solution(13));
    }

}
