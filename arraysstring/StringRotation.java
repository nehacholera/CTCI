package clrs.arraysstring;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(rotateStringCheck(str1,str2));
    }

    public static boolean rotateStringCheck(String str1, String str2){
        String str3 = str1 + str1;
        int res = isSubstring(str2, str3);
        return res != -1;
    }

    public static int isSubstring(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;

            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                        != s1.charAt(j))
                    break;

            if (j == M)
                return i;
        }

        return -1;
    }
}
