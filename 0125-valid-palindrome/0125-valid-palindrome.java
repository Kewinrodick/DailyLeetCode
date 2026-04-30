class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String s1 = s.toLowerCase();
        while(i<=j){
            char l1 = s1.charAt(i);
            char l2 = s1.charAt(j);

            if(Character.isLetterOrDigit(l1) && Character.isLetterOrDigit(l2)){
                if(l1 != l2){
                    return false;
                }
                i++;j--;
            }
            else if(!Character.isLetterOrDigit(l1)){
                i++;
            }
            else if(!Character.isLetterOrDigit(l2)){
                j--;
            }
        }
        return true;
    }
}