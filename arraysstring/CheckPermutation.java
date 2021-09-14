package clrs.arraysstring;

import java.util.HashMap;


public class CheckPermutation {

    public static void main(String[] args) {
        String str1 = "Maathan";
        String str2 = "Manthan";
        //System.out.println(checkPermutation(str1,str2));
        System.out.println(checkPermutationArray(str1,str2));
    }

    public static boolean checkPermutation(String myStr1, String myStr2){
        if(myStr1.length()!=myStr2.length()){
            return false;
        }

        HashMap<Character,Integer> HashMap1 = new HashMap<>();
        HashMap<Character,Integer> HashMap2 = new HashMap<>();

        for(int i=0;i<myStr1.length();i++){
            if(HashMap1.containsKey(myStr1.charAt(i))){
                HashMap1.put(myStr1.charAt(i),HashMap1.get(myStr1.charAt(i)) + 1);
            }else{
                HashMap1.put(myStr1.charAt(i), 1);
            }
        }
        HashMap1.forEach((key,value) -> System.out.println(key + " = " + value));

        for(int i=0;i<myStr2.length();i++){
            if(HashMap2.containsKey(myStr1.charAt(i))){
                HashMap2.put(myStr1.charAt(i),HashMap2.get(myStr2.charAt(i)) + 1);
            }else{
                HashMap2.put(myStr1.charAt(i), 1);
            }
        }
        HashMap2.forEach((key,value) -> System.out.println(key + " = " + value));

        for(int i=0;i<HashMap1.size();i++){
           if(!(HashMap1.get(myStr1.charAt(i)).equals(HashMap2.get(myStr2.charAt(i))))){
               return false;
           }
        }
        return true;
    }

    public static boolean checkPermutationArray(String myStr1, String myStr2){
        if(myStr1.length()!=myStr2.length()){
            return false;
        }

        int[] asciiValues = new int[128];

        for(int i=0;i<myStr1.length();i++){
            int value = myStr1.charAt(i);
            if(asciiValues[value]!=0){
                asciiValues[value] = asciiValues[value]+1;
            }else{
                asciiValues[value]=1;
            }
            int value2 = myStr2.charAt(i);
            asciiValues[value2] = asciiValues[value2]-1;
        }

        for(int i: asciiValues){
            if(i!=0){
                return false;
            }
        }
       return true;
    }
}
