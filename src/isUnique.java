import java.util.HashMap;

/**
 * Created by Ali on 2016-10-16.
 */
public class isUnique {

    public static void main (String [] args){
        HashMap<Character,Integer> hash=new HashMap<>();
        Boolean isUnique=true;
        String input="helo";
        for(int i=0;i<input.length();i++){
            if ( (hash.get(input.charAt(i))!=null)&& hash.get(input.charAt(i))>=1){
                hash.put(input.charAt(i),hash.get(input.charAt(i))+1);
                isUnique=false;
            }
            else{
                hash.put(input.charAt(i),1);
            }
        }
        for(char i:hash.keySet())System.out.println("key: "+ i+" value:"+hash.get(i));
            System.out.println(isUnique);


    }
}
