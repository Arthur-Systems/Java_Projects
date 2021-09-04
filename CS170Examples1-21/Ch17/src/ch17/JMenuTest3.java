package ch17;

//Demo； use of MenuListener to handling Menu events.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuTest3 extends JFrame implements MenuListener {
	private JMenu fileMenu, helpMenu;
  public JMenuTest3() {
    super("菜单事件处理演示");

    fileMenu = new JMenu("文件(F)");
    fileMenu.setMnemonic('F');
    fileMenu.addMenuListener(this);
    fileMenu.add(new JMenuItem("打开"));
    fileMenu.add(new JMenuItem("关闭"));

    helpMenu = new JMenu("帮助(H)");
    helpMenu.setMnemonic('H');
    helpMenu.addMenuListener(this);
    helpMenu.add(new JMenuItem("关于菜单"));
    helpMenu.insertSeparator(1);

    helpMenu.add(new JMenuItem("关于事件处理"));

    JMenuBar mb = new JMenuBar();
    mb.add(fileMenu);
    mb.add(helpMenu);
    setJMenuBar(mb);


	setSize(250,140);							//宽250，高140像素
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	centerWindow(this);							//调用自定义在中心位置显示框架的方法
  }
  public void menuSelected(MenuEvent e) {
	  display("Menu Selected: ", e);
	  if(e.getSource() == helpMenu) {
	  	fileMenu.setVisible(false);
	  	menuCanceled(e);
	  }
  }
  public void menuDeselected(MenuEvent e) {
  	  display("Menu deselected:", e);
  	  if(e.getSource() == helpMenu) {
	  	  	fileMenu.setVisible(true);
	  }
  }
  public void menuCanceled(MenuEvent e) {
  	  display("Menu canceled 文件 menu:", e);
  }
  private void display(String s, MenuEvent e) {
          JMenu menu = (JMenu) e.getSource();
          System.out.println(s + ": " + menu.getText());
  }

  private void centerWindow(JFrame frame) {		//按屏幕中心位置显示框架的自定义方法
  			Toolkit tk = Toolkit.getDefaultToolkit();
  			Dimension d = tk.getScreenSize();
  			int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;	//计算中心宽度
  			int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;	//计算中心高度
  			frame.setLocation(centeredWidth, centeredHeight);				//设置显示位置
	}


  public static void main(String args[]) {
    JFrame frame = new JMenuTest3();
    frame.setVisible(true);
  }
}