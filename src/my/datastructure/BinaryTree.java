package my.datastructure;

import java.util.Stack;

public class BinaryTree {
   
	
	Node root;
	
	private class Node{
		
		private int data; //Generic type
		private Node left;
		private Node right;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	
	public void createBinaryTree() {
		
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(2);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		
		root=first;  //root-->first
		first.left=second;
		first.right=third;  //second<--first-->third
		
		second.left=fourth;
		second.right=fifth;
		
		
	}
	
	
	public void preOrder() {
		if(root==null) {
			return;
		}
		
		Stack<Node>	stack= new Stack<>();
		stack.push(root);
		
		
		while(!stack.isEmpty()) {
			Node temp=stack.pop();
			System.out.println(temp.data + " ");
			
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
		
		
	}
	
	public void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	
	public static void main(String args[]) {
		
		BinaryTree bt= new BinaryTree();
		//bt.createBinaryTree();// Iterative pre-order traversal of binary tree
		bt.preOrder(bt.root);// Recursive  pre-order traversal of binary tree
		
		bt.preOrder();
		
	}


	
}
