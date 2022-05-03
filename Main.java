package BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		BinarysearchTree obj = new BinarysearchTree();
		Node root = new Node(50);
		obj.insert(null,root.data);
		obj.insert(root,20);
		obj.insert(root,70);
		obj.insert(root,60);
		obj.insert(root,80);
		obj.traverse(root);
		System.out.println();
		//obj.delete(root, 50);
		//System.out.println("After deleting the root node");
		//obj.traverse(root);
		System.out.print(obj.floor(root, 60).data);
	}
}
