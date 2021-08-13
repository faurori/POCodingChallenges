import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
	
	public static void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.data);
			if(temp.left != null) {
				queue.add(temp.left);
			if(temp.right != null) {
				queue.add(temp.right);
			
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Node rootNode = new Node(40);
		Node node20 = new Node(20);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50	= new Node(50);
		Node node70 = new Node(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		node20.left = node10;
		node20.right = node30;
		node60.left = node50;
		node60.right = node70;
		
		levelOrderTraversal(rootNode);
	}

}
