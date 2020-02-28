package questions

/**
 * AlgorithmTest
 * Class: Question19
 * Created by hapo on 2020-02-28.
 * Description: 입력 받은 정수를 2진수로 변환한 후 숫자 1과 1사이의 거리가 제일 긴 것을 구하시오.
 *
 */
class Question19 {
    fun distanceTwoNumber(n: Int) : Int{
        val binary: String = n.toString(2)

        val binaryArray = binary.toCharArray()
        var count = 0
        var max = 0

        for (char in binaryArray.indices){
            if(binaryArray[char] == "1".single()) {
                if (count > max) {
                    max = count
                }
                count = 0

            }
            else count++
        }
        return max
    }
}