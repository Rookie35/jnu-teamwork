import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;






public class AppJFrame extends JFrame{
	
	Container container;
	
	
	public AppJFrame() {
		this.setLayout(new GridBagLayout());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		container = this.getContentPane();
		
		addMenu();
		addArea();
	
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//****************
	//editor：张泽锋             *
	//功能：添加左边菜单栏   *
	//****************
	private void addMenu() {
		JPanel menu = new JPanel();
		menu.setLayout(new GridBagLayout());
		menu.setBackground(Color.GRAY);
		addSpaceTop(menu);
		addGrade(menu);
		addDocument(menu);
		addNotice(menu);
		addEmploy(menu);
		addLife(menu);
		addForum(menu);
		addInfor(menu);
		addSpace(menu);

		JScrollPane menuScroll = new JScrollPane(menu);
		container.add(menuScroll, new GBC(0, 0, 2, 1).setFill(GBC.BOTH).setWeight(1, 1));
	}
	
	
	//******************************
	//editor:zzf                   *
	//功能：以下每个add为左边菜单栏里的各选项 *	
	//******************************
	private void addSpaceTop(JPanel menu) {
		JPanel spaceTop = new JPanel();
		menu.add(spaceTop, new GBC(0, 0, 1, 5).setFill(GBC.BOTH).setWeight(1, 5));
	}
	
	private void addGrade(JPanel menu) {
		JTree grade;
		JPanel gradePanel = new JPanel();
		DefaultMutableTreeNode gradeRoot;
		DefaultMutableTreeNode gradeCheck;
		DefaultMutableTreeNode lessonSelect;
		gradeRoot = new DefaultMutableTreeNode("成绩查询");
		gradeCheck = new DefaultMutableTreeNode("查询成绩");
		lessonSelect = new DefaultMutableTreeNode("选课");
		gradeRoot.add(gradeCheck);
		gradeRoot.add(lessonSelect);
		grade = new JTree(gradeRoot);
		new TreeIcon(grade);
		gradePanel.add(grade);
		menu.add(gradePanel, new GBC(0, 5, 1, 3).setFill(GBC.BOTH).setWeight(1, 3));
	}
	
	private void addDocument(JPanel menu) {
		JTree document;
		JPanel documentPanel = new JPanel();
		DefaultMutableTreeNode documentRoot;
		DefaultMutableTreeNode documentWrite;
		documentRoot = new DefaultMutableTreeNode("文档编辑");
		documentWrite = new DefaultMutableTreeNode("文档填写");
		documentRoot.add(documentWrite);
		document = new JTree(documentRoot);
		new TreeIcon(document);
		documentPanel.add(document);
		menu.add(documentPanel, new GBC(0, 9, 1, 2).setFill(GBC.BOTH).setWeight(1, 2));
	}
	
	private void addNotice(JPanel menu) {
		JTree notice;
		JPanel noticePanel = new JPanel();
		DefaultMutableTreeNode noticeRoot;
		DefaultMutableTreeNode noticeCheck;
		noticeRoot = new DefaultMutableTreeNode("通知");
		noticeCheck = new DefaultMutableTreeNode("查看通知");
		noticeRoot.add(noticeCheck);
		notice = new JTree(noticeRoot);
		new TreeIcon(notice);
		noticePanel.add(notice);
		menu.add(noticePanel, new GBC(0, 12, 1, 2).setFill(GBC.BOTH).setWeight(1, 2));
	}
	
	private void addEmploy(JPanel menu) {
		JTree employ;
		JPanel employPanel = new JPanel();
		DefaultMutableTreeNode employRoot;
		DefaultMutableTreeNode employCheck;
		employRoot = new DefaultMutableTreeNode("就业");
		employCheck = new DefaultMutableTreeNode("就业信息查询");
		employRoot.add(employCheck);
		employ = new JTree(employRoot);
		new TreeIcon(employ);
		employPanel.add(employ);
		menu.add(employPanel, new GBC(0, 14, 1, 2).setFill(GBC.BOTH).setWeight(1, 2));
	}
	
	private void addLife(JPanel menu) {
		JTree life;
		JPanel lifePanel = new JPanel();
		DefaultMutableTreeNode lifeRoot;
		DefaultMutableTreeNode card;
		DefaultMutableTreeNode elec;
		lifeRoot = new DefaultMutableTreeNode("生活");
		card = new DefaultMutableTreeNode("校园卡");
		elec = new DefaultMutableTreeNode("水电");
		lifeRoot.add(card);
		lifeRoot.add(elec);
		life = new JTree(lifeRoot);
		new TreeIcon(life);
		lifePanel.add(life);
		menu.add(lifePanel, new GBC(0, 16, 1, 3).setFill(GBC.BOTH).setWeight(1, 3));
	}
	
	private void addForum(JPanel menu) {
		JTree forum;
		JPanel forumPanel = new JPanel();
		DefaultMutableTreeNode forumRoot;
		DefaultMutableTreeNode forumCheck;
		forumRoot = new DefaultMutableTreeNode("论坛");
		forumCheck = new DefaultMutableTreeNode("浏览论坛");
		forumRoot.add(forumCheck);
		forum = new JTree(forumRoot);
		new TreeIcon(forum);
		forumPanel.add(forum);
		menu.add(forumPanel, new GBC(0, 20, 1, 2).setFill(GBC.BOTH).setWeight(1, 2));
	}
	
	private void addInfor(JPanel menu) {
		JTree infor;
		JPanel inforPanel = new JPanel();
		DefaultMutableTreeNode inforRoot;
		DefaultMutableTreeNode inforManage;
		inforRoot = new DefaultMutableTreeNode("个人信息");
		inforManage = new DefaultMutableTreeNode("个人信息管理");
		inforRoot.add(inforManage);
		infor = new JTree(inforRoot);
		new TreeIcon(infor);
		inforPanel.add(infor);
		menu.add(inforPanel, new GBC(0, 23, 1, 2).setFill(GBC.BOTH).setWeight(1, 2));
	}
	
	private void addSpace(JPanel menu) {
		JPanel space = new JPanel();
		menu.add(space, new GBC(0, 25, 1, 5).setFill(GBC.BOTH).setWeight(1, 5));
		
	}
	
	//各组员在此area的JPanel中添加你的布局，注意，不要直接添加在area，自己再建一个容器，布局添加在自己新建的容器，将容器再添加至area
	//****************
	//editor：张泽锋             *
	//功能：添加右边显示区    *
	//****************
	private void addArea() {
		JPanel area = new JPanel();
		area.setBackground(Color.YELLOW);
		container.add(area, new GBC(2, 0, 8, 1).setFill(GBC.BOTH).setWeight(8, 1));
	}
}
