package clrs.arraysstring;

public class OneAway {
    public static void main(String[] args) {
        String str1="palesw";
        String str2="bales";
        System.out.println(editsAway(str1,str2));
    }

    public static boolean editsAway(String str1, String str2){
        if(str1.isEmpty() || str2.isEmpty()){
            return false;
        }else if(str1.length()==str2.length()){
             return replace(str1,str2);
        }else{
            if(str1.length()<str2.length()){
                return removeOrInsert(str1, str2);
            }else{
                return removeOrInsert(str2,str1);
            }
        }
    }

    public static boolean removeOrInsert(String shortStr, String longStr){
        int count=0;
        for(int i=0;i<longStr.length()-1;i++){
            if(shortStr.charAt(i)!=longStr.charAt(i)){
                count ++;
            }else if(shortStr.charAt(i)!=longStr.charAt(i+1)){
                count ++;
            }
        }
        return count <=1;
    }

    public static boolean replace(String str1, String str2){
        int count =0;
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                count ++;
            }
        }
        return count <= 1;
    }
}
