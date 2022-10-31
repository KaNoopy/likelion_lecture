package Algorithm;
/*
 * 문제 1.정답  1, 2, 3, 4, 5
 * 문제 2.정답  1, 3, 2, 4, 2
 *
 * 학생1 찍는방식  1, 2, 3, 4, 5
 * 학생2 찍는방식  2, 1, 2, 3, 2, 4, 2, 5
 * 학생3 찍는방식  3, 3, 1, 1, 2, 2, 4, 4, 5, 5
 *
 * 풀이
 * 1. 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성
 * 2. 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬
 * */

import java.util.Arrays;

public class Test {
    public int[] solution(int[] answers) {
        int firstStudentAnswerCnt = 0;
        int[] firstStudentAnswerArr = {1, 2, 3, 4, 5};
        for (int i = 0; i < firstStudentAnswerArr.length; i++) {
            for (int j = 0; j < answers.length; j++) {

            }
        }

        return new int[0];
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {1, 3, 2, 4, 2};
        Test test = new Test();
        System.out.println();

    }
}
