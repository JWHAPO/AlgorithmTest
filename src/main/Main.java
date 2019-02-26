package main;/*
 * Created by hapo
 * Date : 19. 1. 2 오후 9:50
 * Description :
 */

import questions.MergeNames;
import questions.Question10;
import questions.Question9;

public class Main {

    public static void main(String[] args){


        String[] names1 = new String[] {"Ava", "Emma", "Olivia","Mr.Kim"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma","Mr.Kim"};

        System.out.println(String.join(",", MergeNames.uniqueNames(names1,names2)));

    }



}
