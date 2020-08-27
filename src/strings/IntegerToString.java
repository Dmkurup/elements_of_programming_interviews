package strings;

import jdk.jfr.StackTrace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToString {
    public static String intToString(int num){
        boolean sign = num<0? true:false;
        if(num==0) return "0";
        num = Math.abs(num);
        StringBuilder result = new StringBuilder();
        while(num>0){
            int digit =(num%10);
            result.append(digit);
            num/=10;
        }
        if(sign) result.append('-');
        result.reverse();
        return result.toString();
        }
    @Test
    public  void testIntToString(){
        String expected = "-432";
        assertEquals(intToString(-432),expected);
        assertEquals(intToString(432),"432");
        assertEquals(intToString(0),"0");
    }
}
