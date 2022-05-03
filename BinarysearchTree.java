package BinarySearchTree;

public class BinarysearchTree {
	Node root;
	public BinarysearchTree() {
		root=null;
	}
	public boolean search(Node root, int k) {
		if(root==null)
			return false;
		else {
			if(root.data==k)
				return true;
			else if(root.data>k)
				return search(root.left,k);
			else
				return search(root.right,k);
			}
		}
	//we can only insert the values which are not present in the BST
	public Node insert( Node root,int value) {
		Node newnode = new Node(value);
		if(root ==null)
			return new Node(value);
		if(root.data>newnode.data)
			root.left=insert(root.left,value);
		else if(root.data<newnode.data)
			root.right=insert(root.right,value);
		return root;
	}
	public Node getSuccessor(Node curr) {
		curr =curr.right;
		while(curr!=null && curr.left!=null )
			curr= curr.left;
		return curr;
	}
	public Node delete(Node root,int value) {
		if(root ==null) return root;
		if(root.data>value)
			root.left=delete(root.left,value);
		else if(root.data<value)
			root.right=delete(root.right,value);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else {
				Node succ= getSuccessor(root);
				root.data= succ.data;
				root.right=delete(root.right,succ.data);
			}
		}
		return root;
	}
	public Node floor(Node root, int data) {
		if(root!=null) {
			if(root.data==data) {
			  return root;	
			}
			else if(root.data>data) {
			   Node curr=root.left;
			   while(curr!=null && curr.left!=null )
				   curr=curr.left;
			   return curr;
			}
			else {
				Node curr=root.right;
				   while(curr!=null && curr.right!=null )
					   curr=curr.right;
				   return curr;
			}
		}
		return null;
	}
	public void traverse(Node root) {
		if(root!=null) {
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);
		}
	}
	
}
