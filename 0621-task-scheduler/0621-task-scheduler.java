class Pair{
    public int freq;
    public int time;

    public Pair(int freq,int time){
        this.freq = freq;
        this.time = time;
    }

}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Pair> q = new LinkedList<>();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char i: tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:map.values()){
            maxHeap.offer(i);
        }

        while(!maxHeap.isEmpty() || !q.isEmpty()){
            time++;
            if(!maxHeap.isEmpty()){
                int currTask = maxHeap.poll();   
                if(currTask-1 > 0)q.offer(new Pair(currTask-1,time+n));
            }
            if(!q.isEmpty() && q.peek().time == time){
                Pair p = q.poll();
                maxHeap.offer(p.freq);
            }
        }

        return time;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna