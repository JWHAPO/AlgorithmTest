package questions

import java.lang.StringBuilder

/**
 * AlgorithmTest
 * Class: Question18
 * Created by hapo on 2020-02-28.
 * Description:
 *
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 4 이상, 20이하인 문자열입니다.
 * 입출력 예
 * phone_number	return
 * 01033334444	*******4444
 *
 */

class Question18 {

    fun secretPhoneNumber(phoneNumber: String) : String{
        val hiddenIndex : Int = 4
        var securityPhoneNumber : StringBuilder = StringBuilder()

        var numberArr = phoneNumber.toCharArray()
        for(i in numberArr.indices){
            if(i >= numberArr.size - hiddenIndex) numberArr[i] = "*".single()
            securityPhoneNumber.append(numberArr[i])
        }

        return securityPhoneNumber.toString()
    }

}


