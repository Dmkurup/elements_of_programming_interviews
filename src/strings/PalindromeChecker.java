package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeChecker {

    public static boolean isPalindrome(String s){
        int i =0; int j =s.length()-1;
        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i)) &&i<j)
                i++;
            while(!Character.isLetterOrDigit(s.charAt(j)) &&i<j)
                j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
 return true;

    }
    @Test
    public  void testPalindrome(){
        assertEquals(isPalindrome("malayalam"),true);
    }
}
