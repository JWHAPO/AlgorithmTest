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

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        for(int i=2; i<=n; i++){
            list.add(i);
        }

        for(int i=2; i<=n; i++){
            if(list.get(i) == 0) continue;
            for (int j = i+i; j <= n; j+=i) {
                list.set(j,0);
            }
            if(list.get(i) != 0)answer++;
        }
        return answer;
    }
}
