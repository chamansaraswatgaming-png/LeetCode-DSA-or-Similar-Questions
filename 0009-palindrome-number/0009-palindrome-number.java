class Solution {
    public boolean isPalindrome(int x) {
        int p=0 ;
        int o=x;
        int k=0;
        for (int i =0; x>0; i++){
            k = x % 10  ;
            x=x/10;
            p=p*10+k;
 
        }
        if (p==o) return true ;
        return false;
    }
}