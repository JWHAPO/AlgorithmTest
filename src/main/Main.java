package main;/*
 * Created by hapo
 * Date : 19. 1. 2 오후 9:50
 * Description :
 */

import questions.Question1;

public class Main {

    public static void main(String[] args){

        //Question1
        Question1 question1 = new Question1();
        question1.solution(new int[]{1,2,3,4,5});
        question1.solution(new int[]{1,3,2,4,2});
        question1.solution(new int[]{1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,2,3,4,5,5,5,4,3,3,2,1,1});

    }

}
