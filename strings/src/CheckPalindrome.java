class Solution {
    int isPalindrome(String S) {
        // code here
        int p1=0,p2=S.length()-1;
        while(p1<p2){
            if(S.charAt(p1)!=S.charAt(p2))
                return 0;
            p1++;
            p2--;
        }
        return 1;
    }
};