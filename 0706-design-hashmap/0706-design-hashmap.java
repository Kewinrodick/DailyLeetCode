class Node{
    int key;
    int value;
    Node next;

    Node(int key,int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
class MyHashMap {

    LinkedList<Node>[] buckets;
    int SIZE = 769;

    public MyHashMap() {
        buckets = new LinkedList [SIZE];
    }
    
    public void put(int key, int value) {
       int bucketIndex = key % SIZE;

       if(buckets[bucketIndex] == null){
            Node node = new Node(key,value);
            buckets[bucketIndex] = new LinkedList<>();
            buckets[bucketIndex].add(node);
          
       }
       else{
            for(Node node:buckets[bucketIndex]){
                    if(node.key == key){
                        node.value = value;
                        return;
                    }
            }
            buckets[bucketIndex].add(new Node(key,value));
       }
    }
    
    public int get(int key) {
        int bucketIndex = key % SIZE;
        LinkedList<Node> nodes = buckets[bucketIndex];

        if(nodes == null)return -1;
        for(Node node : nodes){
            if(node.key == key) return node.value;
        }

        return -1;
    }
    
    public void remove(int key) {
        int bucketIndex = key % SIZE;
        Node toRemove = null;

        if(buckets[bucketIndex] == null)return;

        for(Node node:buckets[bucketIndex]){
            if(node.key == key){
                toRemove = node;
            }
        }
        if (toRemove == null) return;

        buckets[bucketIndex].remove(toRemove);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna