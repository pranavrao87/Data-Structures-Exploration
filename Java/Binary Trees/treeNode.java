public class treeNode{
    private int data;
    private treeNode left;
    private treeNode right;
    private int numNodes;
    
    public treeNode(int d){
        data = d;
        left = null;
        right = null;
    }
    
    public treeNode(int d, treeNode l, treeNode r){
        data = d;
        left = l;
        right = r;
    }
    
    public int getValue(){
        return data;
    }
    
    public treeNode getLeft(){
        return left;
    }
    
    public treeNode getRight(){
        return right;
    }
    
    public void setLeft(treeNode n){
        left = n;    
    }
    
    public void setRight(treeNode n){
        right = n;    
    }
    
    public treeNode add(int val, treeNode tree){
        if(tree == null){
            tree = new treeNode(val, null, null);
            numNodes++;
        }
        else if(val < tree.getValue()){
            tree.setLeft(add(val, tree.getLeft()));
        }
        else{
            tree.setRight(add(val, tree.getRight()));
        }
        return tree;
    }
        
    public int getNumLevels(treeNode root){
        if (root == null) {
            return 0;
        }
        else{
            return 1 + Math.max(getNumLevels(root.getLeft()), getNumLevels(root.getRight()));
        }

    }
    
    public int getNumNodes(){
        return numNodes+1;
    }
    
    public int getNumLeaves(treeNode tree){
        if(tree == null){
            return 0;
        }
        if(tree.getLeft() == null && tree.getRight() == null){
            return 1;
        }
        else{
            return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
        }
    }
    
    public int getWidth(treeNode root) {
        int height = getHeight(root);
        int[] levelCounts = new int[height+1];
        getWidth(root, 0, levelCounts);
        
        int maxWidth = 0;
        for (int count : levelCounts) {
            maxWidth = Math.max(maxWidth, count);
        }
        
        return maxWidth+1;
    }
    
    private void getWidth(treeNode node, int level, int[] levelCounts) {
        if (node == null) {
            return;
        }
        
        levelCounts[level]++;
        
        getWidth(node.left, level + 1, levelCounts);
        getWidth(node.right, level + 1, levelCounts);
    }
    
    public int getHeight(treeNode node) {
        if (node == null) {
            return 0;
        }
        
        if (node.left == null && node.right == null) {
            return 0; // change the base case to return 1 instead of 0
        }
    
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
   }

    
    public boolean isFull(treeNode root) {
        return isFullHelper(root);
    }
    
    private boolean isFullHelper(treeNode node) {
        if (node == null) {
            return true;
        }
        
        if (node.left == null && node.right == null) {
            return true;
        }
        
        if (node.left != null && node.right != null) {
            return isFull(node.left) && isFull(node.right);
        }
        return false;
    }

    
    public void inOrder(treeNode tree){
        if (tree != null){
            inOrder(tree.getLeft());
            System.out.print(tree.getValue() + " ");
            inOrder(tree.getRight());
        }
    }
    
    public void preOrder(treeNode tree){
        if (tree != null){
            System.out.print(tree.getValue() + " ");
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }
    
    public void postOrder(treeNode tree){
        if (tree != null){
            postOrder(tree.getLeft());
            postOrder(tree.getRight());
            System.out.print(tree.getValue() + " ");
        }
    }
    
    public void revOrder(treeNode tree){
        if (tree != null){
            revOrder(tree.getRight());
            System.out.print(tree.getValue() + " ");
            revOrder(tree.getLeft());
        }
    }
    
    public String toString(){
        String output = "";
        output += data;
        if (left != null) {
            output += " " + left;
        }
        if (right != null) {
            output += " " + right;
        }
        return output;
    }
}
