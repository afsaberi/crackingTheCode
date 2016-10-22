import java.util.HashMap;

/**
 * Created by Ali on 2016-10-16.
 */
public class isUnique {
    public static void main (String [] args){
        HashMap<Character,Integer> hash=new HashMap<>();
        Boolean isUnique=true;
        //returns false
        String ww="These characters are not unique";
        //returns true;
        String input="This col man";
            for(int i=0;i<input.length();i++) {
                if (input.charAt(i)==' ');
                else if ((hash.get(input.charAt(i)) != null) && (hash.get(input.charAt(i))) >= 1) {
                    hash.put(input.charAt(i), hash.get(input.charAt(i)) + 1);
                    isUnique = false;
                 }
                else hash.put(input.charAt(i), 1);
            }
        for(char i:hash.keySet())System.out.println("key: "+ i+" value:"+hash.get(i));
        if(isUnique)System.out.println("\nThe characters in the string are unique");
        else System.out.println("\nThe characters in the string are NOT unique");


    }
}
