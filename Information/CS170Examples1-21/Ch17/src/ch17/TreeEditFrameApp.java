package ch17;
//package ch17;
//Use of JTree to show the interitance hierarchy of Object class

import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class TreeEditFrame extends JFrame implements ActionListener {
	 DefaultTreeModel model;
	 JTree tree;
	 JButton addSiblingButton, addChildButton, deleteButton, exitButton;
  public TreeEditFrame() {
    super("Demo: Use of JTree");

    TreeNode treeNode = makeEditableTree();
    model = new DefaultTreeModel(treeNode);
    tree = new JTree(model);
    tree.setEditable(true);
    JScrollPane scrollPane = new JScrollPane(tree);
    add(scrollPane, "Center");

    JPanel panel = new JPanel();
    addSiblingButton = new JButton("Add Sibling");
    addSiblingButton.addActionListener(this);
    panel.add(addSiblingButton);
    addChildButton = new JButton("Add Child");
    addChildButton.addActionListener(this);
    panel.add(addChildButton);
    deleteButton = new JButton("Delete");
    deleteButton.addActionListener(this);
    panel.add(deleteButton);
    exitButton = new JButton("Exit");
    panel.add(exitButton);
    exitButton.addActionListener(this);
    add(panel, "South");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public TreeNode makeEditableTree() {
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Object");
    DefaultMutableTreeNode level1 = new DefaultMutableTreeNode("Throwable");
    root.add(level1);
    DefaultMutableTreeNode level2 = new DefaultMutableTreeNode("Exception");
    level1.add(level2);
    DefaultMutableTreeNode level3 = new DefaultMutableTreeNode("RuntimeException");
    level2.add(level3);
    DefaultMutableTreeNode level4 = new DefaultMutableTreeNode("InputMismatchException");
    level3.add(level4);

    level2 = new DefaultMutableTreeNode("Error");
    level1.add(level2);
    level3 = new DefaultMutableTreeNode("IOException");
    level2.add(level3);
    level3 = new DefaultMutableTreeNode("AWTError");
    level2.add(level3);

    level1 = new DefaultMutableTreeNode("EventObject");
    root.add(level1);
    level2 = new DefaultMutableTreeNode("AWTEvent");
    level1.add(level2);
    level3 = new DefaultMutableTreeNode("ActionEvent");
    level2.add(level3);
    return root;
  }
  public void actionPerformed(ActionEvent e) {
    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
        .getLastSelectedPathComponent();
	Object source = e.getSource();

    if (selectedNode == null)
      return;

	if (source == exitButton)
      System.exit(0);
    else if (source == deleteButton) {
      if (selectedNode.getParent() != null)
        model.removeNodeFromParent(selectedNode);
      return;
    }
    // add new node as sibling or child
    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("New");
    if (source == addSiblingButton) {
      DefaultMutableTreeNode parent = (DefaultMutableTreeNode) selectedNode
          .getParent();
      if (parent != null) {
        int selectedIndex = parent.getIndex(selectedNode);
        model.insertNodeInto(newNode, parent, selectedIndex + 1);
      }
    } else if (source == addChildButton) {
      model.insertNodeInto(newNode, selectedNode, selectedNode
          .getChildCount());
    }
    TreeNode[] nodes = model.getPathToRoot(newNode); //display new node
    TreePath path = new TreePath(nodes);
    tree.scrollPathToVisible(path);
  }
}
public class TreeEditFrameApp {
  public static void main(String[] args) {
    JFrame frame = new TreeEditFrame();
    frame.pack();
    frame.setVisible(true);
  }
}
