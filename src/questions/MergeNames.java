package questions;/*
 * Created by hapo
 * Date : 19. 2. 25 오후 11:14
 * Description :  두 배열의 중복제거 출처 testdome (https://www.testdome.com)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2){

        List<String> temp = new ArrayList<>(Arrays.asList(names1));
        temp.addAll(Arrays.asList(names2));

        temp = temp.stream().distinct().collect(Collectors.toList());

        return temp.stream().toArray(String[]::new);

    }

//    public static void main(String[] args) {
//        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
//        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
//
//        System.out.println(String.join(",", MergeNames.uniqueNames(names1,names2)));
//    }
}
