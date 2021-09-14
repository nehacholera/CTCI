package clrs.arraysstring;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String str = "abccccccddddddddaaaaaa";
        System.out.println(compression(str));
    }

    public static String compression(String str) {
        StringBuilder newStr= new StringBuilder();
        int totalLetter=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                totalLetter ++;
            }else{
                newStr.append(Character.toString(str.charAt(i))).append(totalLetter);
                totalLetter=1;
            }
        }
        if(totalLetter==1){
            newStr.append(str.charAt(str.length()-1)).append(totalLetter);
        }else{
            newStr.append(str.charAt(str.length()-1)).append(totalLetter);
        }

        if(newStr.length()>str.length()){
            return str;
        }else{
            return newStr.toString();
        }

    }
}
