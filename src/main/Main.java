package main;/*
 * Created by hapo
 * Date : 19. 1. 2 오후 9:50
 * Description :
 */

import questions.Question11;
import questions.alert_service.AlertService;
import questions.alert_service.MapAlertDAO;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        //Question11
        Question11 question11 = new Question11();
        System.out.println("result:"+question11.solution(new int[]{6, 10, 2}));




        //UserInput
//        String[] names1 = new String[] {"Ava", "Emma", "Olivia","Mr.Kim"};
//        String[] names2 = new String[] {"Olivia", "Sophia", "Emma","Mr.Kim"};
//
//        System.out.println(String.join(",", MergeNames.uniqueNames(names1,names2)));


        //questions\alert_service
//        AlertService alertService = new AlertService(new MapAlertDAO());
//        System.out.println(alertService.raiseAlert());
//        System.out.println(alertService.getAlertTime(alertService.raiseAlert()));

    }



}
