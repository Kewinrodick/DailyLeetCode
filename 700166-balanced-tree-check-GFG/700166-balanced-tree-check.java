/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root){
        if(root == null){
            return 0;
        }
       int lh = height(root.left);
       int rh = height(root.right);

       if(lh == -1 || rh == -1)return -1; 
       if(Math.abs(lh-rh) > 1) return -1;
       

       return 1+Math.max(lh,rh);

    }
    public boolean isBalanced(Node root) {
        return height(root)!=-1;
    }
}