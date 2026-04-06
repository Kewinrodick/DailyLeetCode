class Solution {
    public Integer dp[] = new Integer[50001];
    public int findProfit(ArrayList<ArrayList<Integer>> jobs , int[]st , int n, int ind){
        if(ind == n)return 0;
        if(dp[ind] != null)return dp[ind];

        int nextInd = nextJob(jobs,ind,n,jobs.get(ind).get(1));
        int maxProfit = Math.max(findProfit(jobs,st,n,ind+1), jobs.get(ind).get(2)+findProfit(jobs,st,n,    nextInd));

        return dp[ind] = maxProfit;
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        ArrayList<ArrayList<Integer>> jobs = new ArrayList<>();

        for(int i=0;i<profit.length;i++){
            jobs.add(new ArrayList<>(Arrays.asList(startTime[i],endTime[i],profit[i])));
        }

        jobs.sort(Comparator.comparing(inner -> inner.get(0)));

        for(int i=0;i<profit.length;i++){
            startTime[i] = jobs.get(i).get(0);
        }

        return findProfit(jobs,startTime,profit.length,0);

    }

    public int nextJob(ArrayList<ArrayList<Integer>> jobs,int ind,int n,int e){
        int l = ind+1;
        int r = n-1;

        while(l<=r){
            int m = l+(r-l)/2;
            int midVal = jobs.get(m).get(0);

            if(midVal >= e){
                r = m - 1;
            }
            else{
                l = m +1;
            }
        }
        return l;
    }
}