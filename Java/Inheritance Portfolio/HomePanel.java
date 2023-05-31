package Portfolio4;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel {

	// HOME PANEL class
	public HomePanel() {
		
		setBackground(new Color(192, 192, 192));
		setBounds(0, 59, 1280, 673);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(250, 250, 250));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel text1Label = new JLabel("Hi,");
		text1Label.setFont(new Font("Arial Black", Font.ITALIC, 45));
		text1Label.setBounds(195, 220, 107, 124);
		mainPanel.add(text1Label);
		
		JLabel text2Labl = new JLabel("I'm Kimberly Mateo");
		text2Labl.setBackground(new Color(0, 0, 0));
		text2Labl.setForeground(new Color(0, 128, 192));
		text2Labl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 60));
		text2Labl.setBounds(294, 197, 796, 158);
		mainPanel.add(text2Labl);
		
		JLabel text3Lbl = new JLabel("from");
		text3Lbl.setFont(new Font("Arial Black", Font.ITALIC, 35));
		text3Lbl.setBounds(165, 293, 154, 124);
		mainPanel.add(text3Lbl);
		
		JLabel text4Lbl = new JLabel("BS-Information Technology");
		text4Lbl.setForeground(new Color(0, 128, 192));
		text4Lbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		text4Lbl.setBackground(Color.BLACK);
		text4Lbl.setBounds(496, 276, 556, 158);
		mainPanel.add(text4Lbl);
		
		JLabel text5lbl = new JLabel("INF 228,");
		text5lbl.setForeground(new Color(0, 128, 192));
		text5lbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		text5lbl.setBackground(Color.BLACK);
		text5lbl.setBounds(263, 276, 180, 158);
		mainPanel.add(text5lbl);
		
		JLabel text6Lbl = new JLabel("an");
		text6Lbl.setFont(new Font("Arial Black", Font.ITALIC, 35));
		text6Lbl.setBounds(437, 293, 154, 124);
		mainPanel.add(text6Lbl);
		
		JLabel text7Lbl = new JLabel("Student");
		text7Lbl.setForeground(new Color(0, 128, 192));
		text7Lbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		text7Lbl.setBackground(Color.BLACK);
		text7Lbl.setBounds(175, 331, 168, 158);
		mainPanel.add(text7Lbl);
		
		JLabel text8Lbl = new JLabel("from");
		text8Lbl.setFont(new Font("Arial Black", Font.ITALIC, 35));
		text8Lbl.setBounds(348, 348, 118, 124);
		mainPanel.add(text8Lbl);
		
		JLabel text9Lbl = new JLabel("National University Manila.");
		text9Lbl.setForeground(new Color(0, 128, 192));
		text9Lbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		text9Lbl.setBackground(Color.BLACK);
		text9Lbl.setBounds(447, 331, 556, 158);
		mainPanel.add(text9Lbl);
		
		

	}
}
