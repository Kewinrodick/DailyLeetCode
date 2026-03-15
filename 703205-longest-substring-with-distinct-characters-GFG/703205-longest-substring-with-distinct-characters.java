class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
	    	int ans = 0,i,j=0;
	    	for(i=0;i<s.length();i++) {
	    		char curr = s.charAt(i);
	    		
	    		while(set.contains(s.charAt(i))){
	    			set.remove(s.charAt(j));
	    			j++;
	    		}
	    		
	    		set.add(s.charAt(i));
	    		ans = Math.max(ans, i-j+1);
	    	
	    		
	    	}
	    	ans = Math.max(ans, i-j);
	    	return ans;
    }
}