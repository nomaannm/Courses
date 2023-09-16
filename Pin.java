/* pCreate PIN using three given input numbers

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINS (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers. Assumptions: The three given input numbers will always consist of three digits each i.e. each of

them will be in the range >=100 and <=999

100 <= input1 <= 999

100 <= input2 <= 999

100 <= input3 <= 999

Below are the rules for generating the PIN-

-The PIN should be made up of 4 digits -The unit (ones) position of the PIN should be the least of the units position of the three input

numbers

-The tens position of the PIN should be the least of the tens position of the three input numbers -The hundreds position of the PIN should be the least of the hundreds position of the three input

numbers

-The thousands position of the PIN should be the maximum of all the digits in the three input

numbers

Example 1-

input1 = 123 input2-582

input3 - 175
Below are the rules for generating the PIN- -The PIN should be made up of 4 digits

-The unit (ones) position of the PIN should be the least of the units position of the three input

numbers

-The tens position of the PIN should be the least of the tens position of the three input numbers

-The hundreds position of the PIN should be the least of the hundreds position of the three input

numbers The thousands position of the PIN should be the maximum of all the digits in the three input

numbers

Example 1

- input1 = 123

input2 = 582

input3=175

then, PIN 8122

Example 2-

input1= 190

input2-267

Input3-853

then, PIN 9150

*/


import java.util.Scanner;
import java.util.Arrays;
class Pin 
{
    public static void main(String[] args){
        Scanner takeInput = new Scanner(System.in);
        int[] inputs = new int[3];
        System.out.print("Enter the input numbers : ");
        for(int i = 0 ; i < inputs.length ; i++)
        {
            int input = takeInput.nextInt();
            if(String.valueOf(input).length() == 3)
            {
                inputs[i] = input ;
            }
            else throw new RuntimeException("3 digit number needed !");
        }
        takeInput.close();

        System.out.println(Arrays.toString(inputs));
        System.out.println(createPin(inputs));
    }

        protected static int createPin(int[] inputs)
        {
            int pin = 0; 
            int unitPos; int tensPos ; int hundPos ; int thousPos ;
            thousPos = findMaxDigit(inputs[0], inputs[1],inputs[2]);
            int[] max = new int[3];
            max[0] = inputs[0];
            unitPos = Math.min(Math.min(inputs[0]%10 , inputs[1]%10), inputs[2]%10);
            inputs[0] /= 10 ; inputs[1] /= 10 ; inputs[2] /= 10;
            tensPos = Math.min(Math.min(inputs[0]%10 , inputs[1]%10), inputs[2]%10);
            inputs[0] /= 10 ; inputs[1] /= 10 ; inputs[2] /= 10;
            hundPos = Math.min(Math.min(inputs[0]%10 , inputs[1]%10), inputs[2]%10);
            pin = thousPos * 1000 + hundPos * 100 + tensPos * 10 + unitPos ;

            return pin;

        }
        static int findMaxDigit(int num1 , int num2 , int num3 )
        {
            int maxDigit = Math.max(Math.max(findMaxDigit(num1),findMaxDigit(num2)),findMaxDigit(num3));
            return maxDigit;
        }
        static int findMaxDigit(int number)
        {
            int maxDig = 0;
            while(number > 0)
            {
                int digit = number % 10;
                if(digit > maxDig)
                maxDig = digit ;
                number /= 10;
            }            
            return maxDig;
        }


}
