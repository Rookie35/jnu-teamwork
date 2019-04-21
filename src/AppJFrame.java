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
	//editor�������             *
	//���ܣ������߲˵���   *
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
	//���ܣ�����ÿ��addΪ��߲˵�����ĸ�ѡ�� *	
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
		gradeRoot = new DefaultMutableTreeNode("�ɼ���ѯ");
		gradeCheck = new DefaultMutableTreeNode("��ѯ�ɼ�");
		lessonSelect = new DefaultMutableTreeNode("ѡ��");
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
		documentRoot = new DefaultMutableTreeNode("�ĵ��༭");
		documentWrite = new DefaultMutableTreeNode("�ĵ���д");
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
		noticeRoot = new DefaultMutableTreeNode("֪ͨ");
		noticeCheck = new DefaultMutableTreeNode("�鿴֪ͨ");
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
		employRoot = new DefaultMutableTreeNode("��ҵ");
		employCheck = new DefaultMutableTreeNode("��ҵ��Ϣ��ѯ");
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
		lifeRoot = new DefaultMutableTreeNode("����");
		card = new DefaultMutableTreeNode("У԰��");
		elec = new DefaultMutableTreeNode("ˮ��");
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
		forumRoot = new DefaultMutableTreeNode("��̳");
		forumCheck = new DefaultMutableTreeNode("�����̳");
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
		inforRoot = new DefaultMutableTreeNode("������Ϣ");
		inforManage = new DefaultMutableTreeNode("������Ϣ����");
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
	
	//����Ա�ڴ�area��JPanel�������Ĳ��֣�ע�⣬��Ҫֱ�������area���Լ��ٽ�һ������������������Լ��½����������������������area
	//****************
	//editor�������             *
	//���ܣ�����ұ���ʾ��    *
	//****************
	private void addArea() {
		JPanel area = new JPanel();
		area.setBackground(Color.YELLOW);
		container.add(area, new GBC(2, 0, 8, 1).setFill(GBC.BOTH).setWeight(8, 1));
	}
}
