package com.greatlearning.dsaproblem2.bst;


class Node
{
	int val;
	Node left, right;
	Node(int item)
	{
		val = item;
		left = right = null;
	}
}
class binarySearchTree
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void rightSkewConversion(Node root, int order)
	{
	
		if(root == null)
		{
			return;
		}
		rightSkewConversion(root.left, order);
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		rightSkewConversion(rightNode, order);
	}

	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}

	// Driver Code
	public static void main (String[] args)
	{

		binarySearchTree tree = new binarySearchTree();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);

		int order = 0;
		rightSkewConversion(node, order);
		traverseRightSkewed(headNode);
	}
}

