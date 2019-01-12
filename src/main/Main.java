package main;/*
 * Created by hapo
 * Date : 19. 1. 2 오후 9:50
 * Description :
 */

import questions.Question9;

public class Main {

    public static void main(String[] args){

        Question9 question9 = new Question9();

        Long sum = question9.solution(1,100);
        System.out.println("sum -> "+sum);

    }



}
