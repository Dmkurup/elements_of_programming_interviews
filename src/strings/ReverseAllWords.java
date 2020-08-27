package strings;

public class ReverseAllWords {
    public static void reverseAllWords(char[] input){
         int len =input.length;
         int end = len-1;
         int start=0;
         int stop;
         reverse(input, start,len);
         while((stop=(find(input,' ',start)))!=-1){
             reverse(input,start,stop);
             start=stop+1;
         }
         reverse(input,start,len);
        System.out.println(input);
    }

    public static void reverse(char[] arr,int start,int end){
        int last = end-1;
        for(int i =start;i<=start+(last-start)/2;i++){
            char tmp =arr[i];
            arr[i]=arr[last-i+start];
            arr[last-i+start]=tmp;
        }
    }

    public static int find(char[] arr, char c, int start){
        for(int i =start;i<arr.length;i++) {
            if (arr[i] == c) {
                return i;
            }
        }
            return -1;
        }


    public static void main(String[] args) {
        reverseAllWords(new char[]{'A','l','i','c','e',' ','l','i','k','e','s',' ','B','o','b'});
    }
}
