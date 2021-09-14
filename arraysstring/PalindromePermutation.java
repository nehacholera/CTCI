package clrs.arraysstring;

import java.util.HashSet;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "TactCoa";
        char[] arr = str.toCharArray();
        System.out.println(checkPermutation(arr));
    }

    public static boolean checkPermutation(char[] arr){
        HashSet<Character> palindrome = new HashSet<>();
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<=arr.length-1;i++){
            char ch1 = Character.toLowerCase(arr[i]);
            if(!palindrome.contains(ch1)){
                palindrome.add(ch1);
            }else
            palindrome.remove(ch1);
        }
        return palindrome.size() == 1 || palindrome.isEmpty();
    }
}
