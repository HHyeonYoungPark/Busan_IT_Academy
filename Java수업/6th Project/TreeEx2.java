import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeEx2 extends JFrame{
	public TreeEx2() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(3);
		
		DefaultMutableTreeNode node = new DefaultMutableTreeNode();
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Vegetables");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Fruits");
	
		node.add(node1);
		node.add(node2);
		
		node1.add(new DefaultMutableTreeNode("Capsicum"));
		node1.add(new DefaultMutableTreeNode("Carrot"));
		node1.add(new DefaultMutableTreeNode("Tomato"));
		node1.add(new DefaultMutableTreeNode("Potato"));
		
		node2.add(new DefaultMutableTreeNode("Banana"));
		node2.add(new DefaultMutableTreeNode("Mango"));
		node2.add(new DefaultMutableTreeNode("Apple"));
		node2.add(new DefaultMutableTreeNode("Grapes"));
		node2.add(new DefaultMutableTreeNode("Pear"));
		node2.add(new DefaultMutableTreeNode("Melon"));
		node2.add(new DefaultMutableTreeNode("Orange"));
		node2.add(new DefaultMutableTreeNode("Lime"));
		
		JTree tree = new JTree(node);   
        
		//�̹����� ������ �ٲٱ�
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new ImageIcon("vegetable.jpg")); // �̹��� �ҷ�����
        tree.setCellRenderer(renderer); // ���� �� tree�� �����ϱ�
        
		JScrollPane sp = new JScrollPane(tree);	
		
		//��Ʈ�����
		tree.setShowsRootHandles(true); // �����̱�
        tree.setRootVisible(false); //�ֻ��� ��Ʈ �����
        
		this.add(sp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TreeEx2();
	}
}
