package practice;
import java.util.*;

public class PreOrder {

	public static void main(String[] args) {
		

	}
	public ArrayList<Integer> preorderItr(TreeNode root) {
	    ArrayList<Integer> alist = new ArrayList<>();
	    Stack<TreeNode> nodestack = new Stack<>();
	    if(root == null)
	        return alist;
	        
	    nodestack.push(root);
	    while(!nodestack.empty()){
	        TreeNode current = nodestack.pop();
	        alist.add(current.data);
	        if(current.right != null)
	            nodestack.push(current.right);
	        else if(current.left != null)
	            nodestack.push(current.left);
	        }
	    
	    return alist;

}
	
	class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    
	    TreeNode() {
	    }

	    TreeNode(int data) {
	        this.data = data;
	    }

	    TreeNode(int data, TreeNode left, TreeNode right) {
	        this.data = data;
	        this.left = left;
	        this.right = right;
	    }
	}   
}