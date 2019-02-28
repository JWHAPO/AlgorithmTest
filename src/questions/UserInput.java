package questions;

/**
 * AlgorithmTest
 * Class: UserInput
 * Created by hapo on 2019-02-26.
 * Description: 출처 testdome (https://www.testdome.com)
 *
 * User interface contains two types of user input controls:
 * TextInput, which accepts all characters and NumericInput, which accepts only digits.
 *
 * Implement the class TextInput that contains:
 *
 * Public method void add(char c) - adds the given character to the current value
 * Public method String getValue() - returns the current value
 * Implement the class NumericInput that:
 *
 * Inherits from TextInput
 * Overrides the add method so that each non-numeric character is ignored
 * For example, the following code should output "10":
 *-------------------------------------------
 * TextInput input = new NumericInput();
 * input.add('1');
 * input.add('a');
 * input.add('0');
 * System.out.println(input.getValue());
 *-------------------------------------------
 */
public class UserInput {

    public static class TextInput {
        private String value = "";
        public void add(char c){
            value+=c;
        }
        public String getValue() {
            return value;
        }
    }

    public static class NumericInput extends TextInput {
        public String getValue() {
            return super.getValue();
        }

        @Override
        public void add(char c) {
            if(Character.isDigit(c)) super.add(c);
//            if(String.valueOf(c).matches("^?\\d*$")) super.add(c);
        }
    }

    public static void main(String[] args) {

        TextInput textInput = new TextInput();
        textInput.add('1');
        textInput.add('a');
        textInput.add('0');
        System.out.println(textInput.getValue());

        System.out.println();

        TextInput input = new NumericInput();
        input.add('2');
        input.add('b');
        input.add('1');
        System.out.println(input.getValue());
    }
}
