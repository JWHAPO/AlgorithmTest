package questions;/*
 * Created by hapo
 * Date : 19. 1. 6 오후 11:15
 * Description : factorial
 */

public class Question7 {
    public static int factorial(int n){
        if(n<=1) return n;
        else return factorial(n-1) * n;
    }
}
