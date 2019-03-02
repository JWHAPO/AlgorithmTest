package questions;

/**
 * AlgorithmTest
 * Class: SortedSearch
 * Created by hapo on 2019-03-02.
 * Description: 출처 testdome (https://www.testdome.com )
 *
 * Implement function countNumbers that accepts a sorted array of unique integers and, efficiently with respect to time used, counts the number of array elements that are less than the parameter lessThan.
 *
 * For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.
 *
 */
public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan){

        int start = 0;
        int end = sortedArray.length -1;
        int mid = 0;

        while (start <= end){
            mid = (start + end) / 2;
            if(sortedArray[mid] < lessThan) {
                if (mid < sortedArray.length - 1 && sortedArray[mid + 1] < lessThan) {
                    start = mid + 1;
                    continue;
                } else {
                    return mid + 1;
                }
            }

            if(sortedArray[mid] >= lessThan){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return 0;
    }

}
