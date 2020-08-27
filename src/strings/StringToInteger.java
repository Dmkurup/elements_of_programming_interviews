package strings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringToInteger {
    public static int stringToInt(String s){
        boolean signed= false;
        if(s.charAt(0)=='-') signed=true;
        int res=0;
        for(int i =signed?1:0;i<s.length();i++){
            int digit = s.charAt(i)-'0';
            res=res*10+digit;
        }
        return signed? - res:res;
    }
    @Test
    public void testStringTonInt(){
        assertEquals(stringToInt("0"),0);
        assertEquals(stringToInt("123"),123);
        assertEquals(stringToInt("-123"),-123);
        assertEquals(stringToInt("4"),4);
    }
}
