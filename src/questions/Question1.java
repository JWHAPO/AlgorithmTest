package questions;/*
 * Created by hapo
 * Date : 19. 1. 2 오후 10:20
 * Description :
 *
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 조건
 *
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 *
 * answers	return
 * [1,2,3,4,5]	[1]
 * [1,3,2,4,2]	[1,2,3]
 */

import java.util.ArrayList;

public class Question1 {

    class Person{
        int[] orders;
        int no;
        int point;

        public Person(int[] orders, int no, int point) {
            this.orders = orders;
            this.no = no;
            this.point = point;
        }

        public void addPoint(int point){
            this.point += point;
        }

        public int[] getOrders() {
            return orders;
        }

        public void setOrders(int[] orders) {
            this.orders = orders;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }
    }

    public int[] solution(int[] answers) {

        Person person1 = new Person(new int[]{1,2,3,4,5},1,0);
        Person person2 = new Person(new int[]{2,1,2,3,2,4,2,5},2,0);
        Person person3 = new Person(new int[]{3,3,1,1,2,2,4,4,5,5},3,0);

        for(int i=0; i<answers.length;i++){
            if(answers[i] == person1.getOrders()[i%person1.getOrders().length]) person1.addPoint(1);
            if(answers[i] == person2.getOrders()[i%person2.getOrders().length]) person2.addPoint(1);
            if(answers[i] == person3.getOrders()[i%person3.getOrders().length]) person3.addPoint(1);
        }

        int max = Math.max(person1.getPoint(),Math.max(person2.getPoint(),person3.getPoint()));

        ArrayList<Person> list = new ArrayList<>();

        if(person1.getPoint()==max) list.add(person1);
        if(person2.getPoint()==max) list.add(person2);
        if(person3.getPoint()==max) list.add(person3);

        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i).getNo();
            System.out.println(i+":"+answer[i]+", "+list.get(i).getPoint());
        }
        System.out.println();

        return answer;
    }


}
