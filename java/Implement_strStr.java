class Solution5 {
    public int strStr(String haystack, String needle) {
        if(haystack==""){
            return 0;
        }
        else{
            if(haystack.indexOf(needle) !=-1 ){
                return haystack.indexOf(needle);
            }
            else{
                return -1;
            }
        }

    }
}


public class Implement_strStr {
}
