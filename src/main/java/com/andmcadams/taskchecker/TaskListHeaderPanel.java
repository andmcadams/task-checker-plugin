package com.andmcadams.taskchecker;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;

public class TaskListHeaderPanel extends JPanel
{

	public TaskListHeaderPanel(String name)
	{
		super();

		setLayout(new DynamicGridLayout(1, 1, 0, 0));
		setBorder(new EmptyBorder(5, 5, 5, 5));

		setBackground(ColorScheme.DARKER_GRAY_COLOR);
		JTextPane nameLabel = new JTextPane();
		StyledDocument doc = nameLabel.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		nameLabel.setEditable(false);
		nameLabel.setOpaque(false);
		nameLabel.setFocusable(false);
		nameLabel.setBorder(new EmptyBorder(5, 10, 5, 10));

		nameLabel.setText(name);
		add(nameLabel);
	}
}
