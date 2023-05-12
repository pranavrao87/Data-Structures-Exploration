public class treeNodeRunner{
    public static void main(String[] args){
        treeNode root = new treeNode(90);
        root.add(80, root);
        root.add(100, root);
        root.add(70, root);
        root.add(85, root);
        root.add(98, root); 
        root.add(120, root);
        
        System.out.println("IN ORDER");
        root.inOrder(root);
        System.out.println("\nPRE ORDER");
        root.preOrder(root);
        System.out.println("\nPOST ORDER");
        root.postOrder(root);
        System.out.println("\nREVERSE ORDER");
        root.revOrder(root);
        
        System.out.println("\nTree height is " + root.getHeight(root));
        System.out.println("Tree width is " + root.getWidth(root));
        System.out.println("Number of leaves is " + root.getNumLeaves(root));
        System.out.println("Number of nodes is " + root.getNumNodes());
        System.out.println("Number of levels is " + root.getNumLevels(root));
        System.out.println("Tree as a string, using pre-order traversal: " + root.toString());
        if(root.isFull(root) == true){
            System.out.println("The tree is full");
        }
        else{
            System.out.println("The tree is NOT full");
        }
    }
}