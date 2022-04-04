package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
	Node root;
	public Binarytree() {
		root=null;
	}
	//depth first search
	public void inorderTraversal(Node root) {
		if(root!=null) {
		inorderTraversal(root.left);
		System.out.print(root.key+" ");
		inorderTraversal(root.right);
		}
	}
	public void preordertraversal(Node root) {
		if(root !=null) {
		System.out.print(root.key+" ");
		preordertraversal(root.left);
		preordertraversal(root.right);
	}
	}
	public void postorder(Node root) {
		if(root!=null) {
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key+" ");
	}
	}
	//height of bt
	public int height(Node root) {
		if(root==null)
			return 0;
		return Math.max(height(root.left), height(root.right)+1);
	}
	//print nodes which are at k distance from the root
	public void printNodeAtK(Node root, int k) {
		if(k==0)
			System.out.print(root.key+" ");
		printNodeAtK(root.left, k-1);
		printNodeAtK(root.right,k-1);
	}
	//Level order traversal or BFS
	public void BFS(Node root) {
		if(root==null)
			return;
		Queue <Node> q= new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false) {
			Node curr =q.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
	}
	//Printing all nodes in different line by their repective level
	public void levelorder(Node root) {
		if(root==null)
			return;
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false) {
			int count =q.size();   
			for(int i=0;i<count;i++) { // getting all the elements of particular level
			Node curr =q.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
			System.out.println();
	  }
	}
	//Size of bt = total no. of nodes
	public int sizeOfBt(Node root) {
		if(root==null)
			return 0;
		 return 1+sizeOfBt(root.left)+sizeOfBt(root.right);
	}
	//Maximum value in the tree
	public int maximumOfbt(Node root) {
		if(root==null)
			return Integer.MIN_VALUE;
	    return Math.max(root.key,Math.max(maximumOfbt(root.left),maximumOfbt(root.right)));
		
	}
}
