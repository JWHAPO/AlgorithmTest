package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * AlgorithmTest
 * Class: Question17
 * Created by hapo on 2019-03-02.
 * Description: 출처 -> 프로그래머스 ( https://programmers.co.kr )
 *
 * 소수 찾기
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 *
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 *
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 * 입출력 예
 * n	result
 * 10	4
 * 5	3
 * 입출력 예 설명
 *
 */
public class Question17 {
    public int solution(int n) {
        int answer = 0;
        Long starttime = System.currentTimeMillis();

        int[] arr = new int[n];
        for(int i=1; i<=arr.length; i++){
            arr[i-1] = i;
        }

        for(int i=1; i<=n; i++){
            if(arr[i-1] == 0 || i==1) continue;
            for (int j = arr[i-1] + arr[i-1]; j <= n; j+=arr[i-1]) {
                arr[j-1] = 0;
            }
            if(arr[i-1] != 0) answer++;
        }

        Long endtime = System.currentTimeMillis();

        System.out.println((endtime - starttime) + "mill seconds");

        return answer;
    }
}
