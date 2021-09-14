package clrs.arraysstring;

import java.lang.reflect.Array;
import java.util.HashSet;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Manthan";
        //System.out.println(unique(name));
        //System.out.println(uniqueHashSet(name));
        System.out.println(uniqueAscii(name));
    }

    public static boolean unique(String myStr) {
        for(int i=0; i<myStr.length();i++){
            char a = myStr.charAt(i);
            for(int j=i+1; j<myStr.length();j++){
                char b=myStr.charAt(j);
                if(a==b){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean uniqueHashSet(String myStr){
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<myStr.length();i++){
            char a = myStr.charAt(i);
            if(!set.contains(a)){
                set.add(a);
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean uniqueAscii(String myStr){
        boolean arr[] = new boolean[128];
        for(int i=0; i<myStr.length(); i++) {
            int a = myStr.charAt(i);
            if (arr[a] == false) {
                arr[a] = true;
            } else{
                return false;
        }
        }
        return true;
    }

}
