//package strings;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class BaseConversion {
//    public static String convertStringToBase(String s, int b1){
//        boolean signed= s.charAt(0)=='-'?true:false;
//            int res=0;
//        for(int i = signed?1:0;i<s.length();i++){
//             res=res*b1;
//             res+=Character.isDigit(s.charAt(i))
//                     ?s.charAt(i)-'0'
//                     :s.charAt(i)-'A'+10;
//        }
//        return signed? -res:res;
//
//    }
//    @Test
//    public void testStringTonInt(){
//        assertEquals(convertStringToBase("0",2),0);
//        assertEquals(convertStringToBase("123",10),123);
//        assertEquals(convertStringToBase("306",13),                                                                                                                                                                                                                                                                            );
//        assertEquals(convertStringToBase("4"),4);
//    }
//}
