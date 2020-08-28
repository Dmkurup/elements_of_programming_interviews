package strings;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RomanToInteger {
   private static final Map<Character,Integer> map = new HashMap<>(){{
       put('I',1);
       put('V',5);
       put('X',10);
       put('L',50);
       put('C',100);
       put('D',500);
       put('M',1000);
   }
    };
 //IV
    public static int convertRomanToInteger(String s){
        int sum=map.get(s.charAt(s.length()-1));
      for(int i =s.length()-2;i>=0;--i){
         if(map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
             sum-=map.get(s.charAt(i));
         }else{
             sum+=map.get(s.charAt(i));
         }
      }
      return sum;
    }
    @Test
    public void testRoman(){
        assertEquals(4,convertRomanToInteger("IV"));
    }
}
