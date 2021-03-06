package questions;/*
 * Created by hapo
 * Date : 19. 1. 14 오후 8:55
 * Description : 출처 : 프로그래머스 (https://programmers.co.kr)
 *
 * 문자열 내 p와 y의 개수
 * 문제 설명
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
  * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *
 * 예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
 *
 * 제한사항
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.
 * 입출력 예
 * s	answer
 * pPoooyY	true
 * Pyy	false
 */

public class Question10 {

    public boolean solution(String s) {
        boolean answer = false;

        s= s.toUpperCase();
        int sLength = s.length();
        int pLength = 0;
        int yLength = 0;

        for (int i =0; i<sLength; i++){
            if("P".equals(s.substring(i,i+1))) pLength ++;
            if("Y".equals(s.substring(i,i+1))) yLength ++;
        }
        if(pLength == yLength) answer = true;

        // other solution
        // return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();

        return answer;
    }
}
