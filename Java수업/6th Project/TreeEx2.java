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
        
		//이미지로 아이콘 바꾸기
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new ImageIcon("vegetable.jpg")); // 이미지 불러오기
        tree.setCellRenderer(renderer); // 실제 내 tree에 설정하기
        
		JScrollPane sp = new JScrollPane(tree);	
		
		//루트숨기기
		tree.setShowsRootHandles(true); // 선보이기
        tree.setRootVisible(false); //최상위 루트 숨기기
        
		this.add(sp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TreeEx2();
	}
}
