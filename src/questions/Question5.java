package questions;/*
 * Created by hapo
 * Date : 19. 1. 3 오전 12:35
 * Description :
 * 가운데 글자 가져오기 (from Programmers.co.kr)
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 입출력 예
 * s	return
 * abcde	c
 * qwer

 */

public class Question5 {
    public String solution(String s) {
        String answer = "";
        int length = s.length();

        if(length == 0) return "";
        else if(length == 1) return s;

        int center = (int)length/2;

        if(length%2==0) answer = s.substring(center-1,center+1);
        else answer = s.substring(center,center+1);

        return answer;
    }
}
