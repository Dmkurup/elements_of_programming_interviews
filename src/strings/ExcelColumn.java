package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelColumn {
    public static int convertColumn(String s){
        if(s==null || s.length()==0) return 0;
        int base =26;
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*base+ s.charAt(i)-'A'+1;
        }
     return res;
}
@Test
public void testconvertColum(){
    assertEquals(702,convertColumn("ZZ"));
    assertEquals(1,convertColumn("A"));
    assertEquals(26,convertColumn("Z"));
    assertEquals(2109,convertColumn("CCC"));
    }
}