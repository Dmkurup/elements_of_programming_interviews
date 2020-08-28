package strings;

import java.util.ArrayList;
import java.util.List;

public class LettersOfPhoneNumber {
    private static final String [] dict = {"0","1","abc","def"};
    public static List<String> phoneNumber(String phoneNum){
       List<String> result = new ArrayList<>();
       comboCreator(phoneNum,0,"",result);
        return result;
    }
    private static void comboCreator(String phoneNum, int k ,String curr,List<String> result){
        if(k==phoneNum.length()){
            result.add(curr);
            return;
        }
        String combo = dict[phoneNum.charAt(k)-'0']; //abc
        for(Character c:combo.toCharArray()){
            comboCreator(phoneNum,k+1,curr+c,result);
        }
    }

    public static void main(String[] args) {
        List<String> combo =phoneNumber("23");
        System.out.println(combo);
    }
}
