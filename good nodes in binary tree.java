class Solution {
    public int goodNodes(TreeNode root) {
        
      return nodes(root,Integer.MIN_VALUE);
       
    
       
    }
    public int nodes(TreeNode root,int max){
        int count=0;
        if(root==null){
            return 0;
        }
        if(root.val>=max){
            max=root.val;
            count++;
        }
        count+=nodes(root.left,max);
        count+=nodes(root.right,max);
        return count;
        
    }
}  