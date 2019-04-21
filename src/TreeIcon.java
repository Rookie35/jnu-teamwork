import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeIcon {
	public TreeIcon(JTree jTree) {
		DefaultTreeCellRenderer cellRenderer = (DefaultTreeCellRenderer) jTree.getCellRenderer();
		ImageIcon iconRight = new ImageIcon("./images/RightArrow.png");
		Image imageRight = iconRight.getImage().getScaledInstance(cellRenderer.getFont().getSize(), cellRenderer.getFont().getSize(), iconRight.getImage().SCALE_DEFAULT);
		iconRight = new ImageIcon(imageRight);
		ImageIcon iconDown = new ImageIcon("./images/DownArrow.png");
		Image imageDown = iconDown.getImage().getScaledInstance(cellRenderer.getFont().getSize(), cellRenderer.getFont().getSize(), iconDown.getImage().SCALE_DEFAULT);
		iconDown = new ImageIcon(imageDown);
		cellRenderer.setClosedIcon(iconRight);
		cellRenderer.setOpenIcon(iconDown);
	}
}
