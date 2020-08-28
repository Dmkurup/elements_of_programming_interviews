package strings;
//1,11,21,1211
public class CountAndSay {
    public static void countSay(int n){
        String prev="1";

         for(int i =1;i<=n;i++){
            int count =1;
            StringBuilder sb = new StringBuilder();
            for(int j =1;j<prev.length();j++){
                if(prev.charAt(j)== prev.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(prev.charAt(j-1));
                    count=1;
                }
            }
             sb.append(count);
             sb.append(prev.charAt(prev.length()-1));
             prev=sb.toString();

             System.out.println(prev);
         }

    }

    public static void main(String[] args) {
        countSay(4);
    }
}
