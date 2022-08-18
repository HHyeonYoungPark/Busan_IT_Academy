import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeEx extends JFrame{
	public TreeEx() {
		this.setSize(300, 500);
		this.setDefaultCloseOperation(3);
		
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("���1(��Ʈ)");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("���2");
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("���3");
		DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("���4");
		DefaultMutableTreeNode node5 = new DefaultMutableTreeNode("���5");
		DefaultMutableTreeNode node6 = new DefaultMutableTreeNode("���6");
		
		node1.add(node2);
		node1.add(node3);
		
		node2.add(node4);
		node2.add(node5);
		
		node4.add(node6);
		
		
		JTree tree = new JTree(node1); // ��Ʈ�� JTree ������ �� �־���
		this.add(tree);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TreeEx();
	}
}
