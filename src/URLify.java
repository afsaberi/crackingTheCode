/**
 * Created by Ali on 2016-10-22.
 */
public class URLify {
    public static void main(String[] args){
       System.out.println( uRL("hello my name is      ",13));
    }
    public static   String uRL(String input,int length) {
        String temp="";
        int count=0;
        char[]inputArray=input.toCharArray();
        for (int i=0;i<inputArray.length;i++){
            if (inputArray[i]!=' '){
                temp+=inputArray[i];
                count++;
            }
            else if(count<length)  temp+="%20";
        }
    return temp;
    }
}
