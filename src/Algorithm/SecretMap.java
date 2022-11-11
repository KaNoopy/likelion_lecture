package Algorithm;

/*암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열
 1-># , 0 -> ""
지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류
지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백*/

//Integer.parseInt(arr[i], 2); 2진수로 변환
//Integer.toBinaryString(i); 2진수
//1 -> #으로 출력

import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        //2진수로 변환해서 2차원 배열 만들기
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);

        //1을 #로 변환
            answer[i] = answer[i].replace('0', ' ');
            answer[i] = answer[i].replace('1', '#');
        }
        return answer;

        //출력은 되는데 통과를 못함... 왜지?
    }

    public static void main(String[] args) {
        int[] arr1 ={9, 20, 28, 18, 11};
        int[] arr2 ={30, 1, 21, 17, 28};

        SecretMap secretMap = new SecretMap();
        System.out.println(Arrays.toString(secretMap.solution(5,arr1,arr2)));

    }

}
