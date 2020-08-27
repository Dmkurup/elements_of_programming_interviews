package strings;

public class ReplaceRemove {
    public static char[] replaceRemove(char[]arr,int size){
//        {a,b,c,a,a} => { d,d,c,d,d,d,d} replace a with d,d and remove b
        int i =0;
        int aCount=0;
        for(int j=0;j<4;j++){
            if(arr[j]!='b'){
                arr[i]=arr[j];
                i++;
            }
            if(arr[j]=='a'){
                ++aCount;
            }
        }
      int currIdx = i-1;
        i=i+aCount-1;
        while(currIdx>=0){
            if(arr[currIdx]=='a'){
                arr[i--]='d';
                arr[i--]='d';
            }else{
                arr[i--]=arr[currIdx];
            }
           --currIdx;
        }
        System.out.println(arr);
      return arr;
    }

    public static void main(String[] args) {
        replaceRemove(new char[]{'a', 'b', 'c', 'a', 'a'},5);
    }
}
