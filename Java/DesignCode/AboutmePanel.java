package Portfolio3;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class AboutmePanel extends JPanel {

	// image
	private ImageIcon picKim = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\kim.jpeg")
					.getImage().getScaledInstance(436, 486, Image.SCALE_DEFAULT));
	private ImageIcon picskill1 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\bad.jpg")
					.getImage().getScaledInstance(386, 213, Image.SCALE_DEFAULT));
	private ImageIcon picskill2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\hcss.jpg")
					.getImage().getScaledInstance(386, 213, Image.SCALE_DEFAULT));
	private ImageIcon hpic1 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\sing.png")
					.getImage().getScaledInstance(214, 192, Image.SCALE_DEFAULT));
	private ImageIcon hpic2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\watching.jpg")
					.getImage().getScaledInstance(214, 192, Image.SCALE_DEFAULT));
	private ImageIcon hpic3 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\dance.png")
					.getImage().getScaledInstance(214, 192, Image.SCALE_DEFAULT));
	private ImageIcon fb = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\facebook (1).png")
					.getImage().getScaledInstance(56, 45, Image.SCALE_DEFAULT));
	private ImageIcon gmail = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\gmail-logo.png")
					.getImage().getScaledInstance(56, 45, Image.SCALE_DEFAULT));
	private ImageIcon instagram = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\instagram (1).png")
					.getImage().getScaledInstance(56, 45, Image.SCALE_DEFAULT));
	private ImageIcon twitter = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\twitter.png")
					.getImage().getScaledInstance(56, 45, Image.SCALE_DEFAULT));
	private ImageIcon phone = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\contact.png")
					.getImage().getScaledInstance(56, 45, Image.SCALE_DEFAULT));

	/**
	 * Create the panel.
	 */
	public AboutmePanel() {
		
		setBackground(new Color(192, 192, 192));
		setBounds(0, 59, 1280, 673);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		// ================scroll pane panel ===============================
				JPanel scrollpanepanel = new JPanel();
				scrollpanepanel.setBackground(new Color(255, 255, 255));
				scrollpanepanel.setBounds(0, 0, 1280, 720);
				mainPanel.add(scrollpanepanel);
				scrollpanepanel.setLayout(null);
							
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 0, 1280, 679);
				scrollPane.setBackground(new Color(225, 254, 253));
			   scrollpanepanel.add(scrollPane);
			   
			   	JPanel scrollContent = new JPanel();
			    scrollContent.setBackground(new Color(255, 255, 255));
			    scrollContent.setLayout(null);
			    scrollContent.setPreferredSize(new Dimension(1001, 1665)); // increase the size of the panel to fit all 9 labels
			    scrollPane.setViewportView(scrollContent);
			    
		    
			   
			    
			    JPanel aboutmePanel = new JPanel();
			    aboutmePanel.setBounds(0, 0, 1261, 621);
			    scrollContent.add(aboutmePanel);
			    aboutmePanel.setLayout(null);
			    
			    JLabel aboutmelbl_1 = new JLabel("Getting to know me");
			    aboutmelbl_1.setForeground(new Color(0, 128, 192));
			    aboutmelbl_1.setFont(new Font("Arial Black", Font.ITALIC, 40));
			    aboutmelbl_1.setBounds(626, 11, 469, 137);
			    aboutmePanel.add(aboutmelbl_1);
			    
			    JLabel lblNewLabel_2_1_1_1 = new JLabel("_____________");
			    lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
			    lblNewLabel_2_1_1_1.setBounds(635, 27, 459, 116);
			    aboutmePanel.add(lblNewLabel_2_1_1_1);
			    
			    JLabel lblNewLabel = new JLabel("");
			    lblNewLabel.setIcon(picKim);
			    lblNewLabel.setBounds(10, 123, 436, 486);
			    aboutmePanel.add(lblNewLabel);
			    
			    JPanel nameHobbiesPanel = new JPanel();
			    nameHobbiesPanel.setBounds(539, 267, 589, 333);
			    aboutmePanel.add(nameHobbiesPanel);
			    nameHobbiesPanel.setLayout(new CardLayout(0, 0));

			    JPanel aboutMe2 = new JPanel();
			    aboutMe2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			    aboutMe2.setBackground(new Color(240, 240, 240));
			    nameHobbiesPanel.add(aboutMe2, "aboutMePanel");
			    aboutMe2.setLayout(null);
			    //=====================  Mouse Listener About me Cardlayout
			    JLabel aboutMeLabel = new JLabel("About me");
			    aboutMeLabel.setForeground(new Color(0, 128, 192));
			    aboutMeLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    aboutMeLabel.setBounds(10, 11, 78, 26);
			    aboutMeLabel.addMouseListener(new MouseAdapter() {
			        @Override
			        public void mouseClicked(MouseEvent e) {
			            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
			            cardLayout.show(nameHobbiesPanel, "aboutMePanel");
			        }
			    });
			    aboutMe2.add(aboutMeLabel);
			    // ================= Mouse Listener Hobbies Cardlayout
			    JLabel hobbiesLabel = new JLabel("Educational Background\r\n");
			    hobbiesLabel.setForeground(new Color(0, 128, 192));
			    hobbiesLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    hobbiesLabel.setBounds(102, 14, 197, 20);
			    hobbiesLabel.addMouseListener(new MouseAdapter() {
			        @Override
			        public void mouseClicked(MouseEvent e) {
			            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
			            cardLayout.show(nameHobbiesPanel, "hobbiesPanel");
			        }
			    });
			    aboutMe2.add(hobbiesLabel);
			    
			    JLabel sads = new JLabel("______________");
			    sads.setFont(new Font("Anton", Font.PLAIN, 11));
			    sads.setBounds(10, 23, 64, 14);
			    aboutMe2.add(sads);
			    
			    JPanel panel_1 = new JPanel();
			    panel_1.setBounds(10, 61, 569, 261);
			    aboutMe2.add(panel_1);
			    panel_1.setLayout(null);
			    
			    JLabel lblNewLabel_2 = new JLabel("Fullname : ");
			    lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2.setForeground(new Color(0, 0, 0));
			    lblNewLabel_2.setBounds(10, 11, 81, 30);
			    panel_1.add(lblNewLabel_2);
			    
			    JLabel lblNewLabel_3 = new JLabel("Kimberly Rose V Mateo");
			    lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3.setBounds(101, 11, 188, 30);
			    panel_1.add(lblNewLabel_3);
			    
			    JLabel sad = new JLabel("Age : ");
			    sad.setForeground(Color.BLACK);
			    sad.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    sad.setBounds(10, 52, 81, 30);
			    panel_1.add(sad);
			    
			    JLabel lblNewLabel_3_1 = new JLabel("19 years old");
			    lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_1.setBounds(101, 52, 188, 30);
			    panel_1.add(lblNewLabel_3_1);
			    
			    JLabel lblNewLabel_2_2 = new JLabel("Gender : ");
			    lblNewLabel_2_2.setForeground(Color.BLACK);
			    lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2_2.setBounds(10, 93, 81, 30);
			    panel_1.add(lblNewLabel_2_2);
			    
			    JLabel lblNewLabel_3_2 = new JLabel("Female");
			    lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_2.setBounds(101, 93, 188, 30);
			    panel_1.add(lblNewLabel_3_2);
			    
			    JLabel lblNewLabel_2_3 = new JLabel("Address");
			    lblNewLabel_2_3.setForeground(Color.BLACK);
			    lblNewLabel_2_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2_3.setBounds(10, 134, 81, 30);
			    panel_1.add(lblNewLabel_2_3);
			    
			    JLabel lblNewLabel_3_3 = new JLabel("2855 M.Hizon St. Sta Cruz Manila");
			    lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_3.setBounds(101, 134, 230, 30);
			    panel_1.add(lblNewLabel_3_3);
			    
			    JLabel lblNewLabel_2_4 = new JLabel("School :");
			    lblNewLabel_2_4.setForeground(Color.BLACK);
			    lblNewLabel_2_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2_4.setBounds(10, 175, 81, 30);
			    panel_1.add(lblNewLabel_2_4);
			    
			    JLabel lblNewLabel_3_4 = new JLabel("National University Manila");
			    lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_4.setBounds(101, 175, 188, 30);
			    panel_1.add(lblNewLabel_3_4);
			    
			    JLabel lblNewLabel_2_1_1 = new JLabel("Year : ");
			    lblNewLabel_2_1_1.setForeground(Color.BLACK);
			    lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2_1_1.setBounds(10, 216, 81, 30);
			    panel_1.add(lblNewLabel_2_1_1);
			    
			    JLabel lblNewLabel_3_1_1 = new JLabel("3rd term,1st Year");
			    lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_1_1.setBounds(101, 216, 188, 30);
			    panel_1.add(lblNewLabel_3_1_1);
			    
			    JLabel lblNewLabel_2_2_1 = new JLabel("Program : ");
			    lblNewLabel_2_2_1.setForeground(Color.BLACK);
			    lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2_2_1.setBounds(341, 11, 120, 30);
			    panel_1.add(lblNewLabel_2_2_1);
			    
			    JLabel lblNewLabel_3_2_1 = new JLabel("BS Information technology\r\n");
			    lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_2_1.setBounds(341, 37, 203, 30);
			    panel_1.add(lblNewLabel_3_2_1);
			    
			    JLabel lblNewLabel_2_3_1 = new JLabel("Gmail : ");
			    lblNewLabel_2_3_1.setForeground(Color.BLACK);
			    lblNewLabel_2_3_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lblNewLabel_2_3_1.setBounds(341, 67, 97, 30);
			    panel_1.add(lblNewLabel_2_3_1);
			    
			    JLabel lblNewLabel_3_3_1 = new JLabel("Kimmateo658@gmail.com");
			    lblNewLabel_3_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_3_3_1.setBounds(341, 91, 188, 30);
			    panel_1.add(lblNewLabel_3_3_1);

			    JPanel educationalBackgournd = new JPanel();
			    educationalBackgournd.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			    educationalBackgournd.setBackground(new Color(240, 240, 240));
			    nameHobbiesPanel.add(educationalBackgournd, "hobbiesPanel");
			    educationalBackgournd.setLayout(null);

			    JLabel hobbiesTextLabel = new JLabel("Educational Background\r\n");
			    hobbiesTextLabel.setForeground(new Color(0, 128, 192));
			    hobbiesTextLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			    hobbiesTextLabel.setBounds(102, 14, 197, 20);
			 // ============= Mouse listener Hobbies  cardlayout
			    hobbiesTextLabel.addMouseListener(new MouseAdapter() {
			        @Override
			        public void mouseClicked(MouseEvent e) {
			            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
			            cardLayout.show(nameHobbiesPanel, "hobbiesPanel");
			        }
			    });
			    educationalBackgournd.add(hobbiesTextLabel);
			    
			    // ============= Mouse listener About me cardlayout
			    JLabel aboutMeTextLabel = new JLabel("About me");
			    aboutMeTextLabel.setForeground(new Color(0, 128, 192));
			    aboutMeTextLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			    aboutMeTextLabel.setBounds(11, 11, 78, 26);
			    aboutMeTextLabel.addMouseListener(new MouseAdapter() {
			        @Override
			        public void mouseClicked(MouseEvent e) {
			            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
			            cardLayout.show(nameHobbiesPanel, "aboutMePanel");
			        }
			    });
			    educationalBackgournd.add(aboutMeTextLabel);
			    
			    JLabel lblNewLabel_1 = new JLabel("______________");
			    lblNewLabel_1.setFont(new Font("Anton", Font.PLAIN, 11));
			    lblNewLabel_1.setBounds(99, 23, 64, 14);
			    educationalBackgournd.add(lblNewLabel_1);
			    
			    JPanel ebPanel = new JPanel();
			    ebPanel.setLayout(null);
			    ebPanel.setBounds(11, 61, 569, 261);
			    educationalBackgournd.add(ebPanel);
			    
			    JLabel lblNewLabe3_1 = new JLabel("Elementary  (2008 - 2016)");
			    lblNewLabe3_1.setForeground(new Color(0, 128, 192));
			    lblNewLabe3_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			    lblNewLabe3_1.setBounds(10, 11, 249, 30);
			    ebPanel.add(lblNewLabe3_1);
			    
			    JLabel lblNewLabel_4_4 = new JLabel("Plaridel Elementary School");
			    lblNewLabel_4_4.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_4_4.setBounds(10, 38, 318, 30);
			    ebPanel.add(lblNewLabel_4_4);
			    
			    JLabel lblEducation_1 = new JLabel("High School 2016 - 2020");
			    lblEducation_1.setForeground(new Color(0, 128, 192));
			    lblEducation_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			    lblEducation_1.setBounds(10, 69, 257, 30);
			    ebPanel.add(lblEducation_1);
			    
			    JLabel lblNewLabel_4_2_1 = new JLabel("Cayetano Arellano High School\r\n");
			    lblNewLabel_4_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_4_2_1.setBounds(10, 96, 294, 30);
			    ebPanel.add(lblNewLabel_4_2_1);
			    
			    JLabel lblSeniorHigh_1 = new JLabel("Senior High 2020 - 2022");
			    lblSeniorHigh_1.setForeground(new Color(0, 128, 192));
			    lblSeniorHigh_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			    lblSeniorHigh_1.setBounds(10, 137, 508, 30);
			    ebPanel.add(lblSeniorHigh_1);
			    
			    JLabel lblNewLabel_4_3_2 = new JLabel("Ama Learning Computer Center");
			    lblNewLabel_4_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_4_3_2.setBounds(10, 164, 222, 30);
			    ebPanel.add(lblNewLabel_4_3_2);
			    
			    JLabel lblCollege_1 = new JLabel("College 2022 - current");
			    lblCollege_1.setForeground(new Color(0, 128, 192));
			    lblCollege_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			    lblCollege_1.setBounds(10, 193, 204, 30);
			    ebPanel.add(lblCollege_1);
			    
			    JLabel lblNewLabel_4_3_1_1 = new JLabel("National University Manila");
			    lblNewLabel_4_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
			    lblNewLabel_4_3_1_1.setBounds(10, 220, 234, 30);
			    ebPanel.add(lblNewLabel_4_3_1_1);
			    
			    JLabel textaboutmelbl = new JLabel("About me");
			    textaboutmelbl.setForeground(new Color(0, 128, 192));
			    textaboutmelbl.setFont(new Font("Arial Black", Font.ITALIC, 40));
			    textaboutmelbl.setBounds(10, 35, 267, 86);
			    aboutmePanel.add(textaboutmelbl);
			    
			    JLabel etext1lbl = new JLabel("Hello, my name is Kimberly Mateo, and I'm 19-years-old programmer from St. Sta Cruz Manila");
			    etext1lbl.setForeground(new Color(0, 0, 0));
			    etext1lbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    etext1lbl.setBounds(522, 141, 642, 20);
			    aboutmePanel.add(etext1lbl);
			    
			    JLabel lbl2 = new JLabel("I'm Currectly a freshman at National University of Manila, and I'm Information Technology");
			    lbl2.setForeground(new Color(0, 0, 0));
			    lbl2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lbl2.setBounds(522, 163, 589, 20);
			    aboutmePanel.add(lbl2);
			    
			    JLabel lbl3 = new JLabel("Student with Specialization Mobile Web Aplication.");
			    lbl3.setForeground(new Color(0, 0, 0));
			    lbl3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			    lbl3.setBounds(522, 187, 589, 20);
			    aboutmePanel.add(lbl3);
			    
			    JLabel lbl4 = new JLabel("");
//			    lbl4.setIcon(astrount2);
			    lbl4.setBounds(150, 11, 362, 333);
			    aboutmePanel.add(lbl4);
			    
			    JPanel hobbiesandcontactPanel = new JPanel();
			    hobbiesandcontactPanel.setBounds(0, 1100, 1261, 440);
			    scrollContent.add(hobbiesandcontactPanel);
			    hobbiesandcontactPanel.setLayout(null);
			    
			    JLabel hobbieslbl = new JLabel("Hobbies\r\n");
			    hobbieslbl.setBounds(626, 11, 469, 137);
			    hobbieslbl.setForeground(new Color(0, 128, 192));
			    hobbieslbl.setFont(new Font("Arial Black", Font.ITALIC, 40));
			    hobbiesandcontactPanel.add(hobbieslbl);
			    
			    JLabel hobbieslines = new JLabel("______");
			    hobbieslines.setBounds(635, 27, 459, 116);
			    hobbieslines.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
			    hobbiesandcontactPanel.add(hobbieslines);
			    
			    JLabel hobbiespics1 = new JLabel("");
			    hobbiespics1.setIcon(hpic1);
			    hobbiespics1.setBounds(217, 162, 214, 192);
			    hobbiesandcontactPanel.add(hobbiespics1);
			    
			    JLabel hobbiespic2 = new JLabel("");
			    hobbiespic2.setIcon(hpic2);
			    hobbiespic2.setBounds(618, 162, 214, 192);
			    hobbiesandcontactPanel.add(hobbiespic2);
			    
			    JLabel hobbiespic3 = new JLabel("");
			    hobbiespic3.setIcon(hpic3);
			    hobbiespic3.setBounds(946, 154, 214, 192);
			    hobbiesandcontactPanel.add(hobbiespic3);
			    
			    JLabel sinsinglbl = new JLabel("Singing");
			    sinsinglbl.setForeground(new Color(0, 128, 192));
			    sinsinglbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    sinsinglbl.setBounds(266, 372, 165, 31);
			    hobbiesandcontactPanel.add(sinsinglbl);
			    
			    JLabel lblWatching = new JLabel("Watching");
			    lblWatching.setForeground(new Color(0, 128, 192));
			    lblWatching.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    lblWatching.setBounds(673, 365, 135, 31);
			    hobbiesandcontactPanel.add(lblWatching);
			    
			    JLabel lblDance = new JLabel("Dance");
			    lblDance.setForeground(new Color(0, 128, 192));
			    lblDance.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    lblDance.setBounds(1024, 357, 112, 31);
			    hobbiesandcontactPanel.add(lblDance);
			    
			    JPanel SkillsAndHobbies = new JPanel();
			    SkillsAndHobbies.setBounds(0, 621, 1261, 621);
			    scrollContent.add(SkillsAndHobbies);
			    SkillsAndHobbies.setLayout(null);
			    
			    JLabel skillslbl = new JLabel("My Skills");
			    skillslbl.setForeground(new Color(0, 128, 192));
			    skillslbl.setFont(new Font("Arial Black", Font.ITALIC, 40));
			    skillslbl.setBounds(551, -10, 347, 137);
			    SkillsAndHobbies.add(skillslbl);
			    
			    JLabel lineskillslbl = new JLabel("________");
			    lineskillslbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
			    lineskillslbl.setBounds(531, 6, 280, 116);
			    SkillsAndHobbies.add(lineskillslbl);
			    
			    JLabel picskill13 = new JLabel("");
			    picskill13.setIcon(picskill1);
			    picskill13.setBounds(169, 138, 386, 213);
			    SkillsAndHobbies.add(picskill13);
			    
			    JLabel pic2skill = new JLabel("");
			    pic2skill.setIcon(picskill2);
			    pic2skill.setBounds(771, 138, 386, 213);
			    SkillsAndHobbies.add(pic2skill);
			    
			    JLabel skillslbl_1 = new JLabel("Badminton");
			    skillslbl_1.setForeground(new Color(0, 128, 192));
			    skillslbl_1.setFont(new Font("Arial Black", Font.ITALIC, 30));
			    skillslbl_1.setBounds(169, 308, 368, 137);
			    SkillsAndHobbies.add(skillslbl_1);
			    
			    JLabel lineskillslbl_1 = new JLabel("_____");
			    lineskillslbl_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
			    lineskillslbl_1.setBounds(169, 310, 238, 116);
			    SkillsAndHobbies.add(lineskillslbl_1);
			    
			    JLabel lineskillslbl_1_1 = new JLabel("_____");
			    lineskillslbl_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
			    lineskillslbl_1_1.setBounds(771, 310, 238, 116);
			    SkillsAndHobbies.add(lineskillslbl_1_1);
			    
			    JLabel skillslbl_1_1 = new JLabel("HTML/CSS");
			    skillslbl_1_1.setForeground(new Color(0, 128, 192));
			    skillslbl_1_1.setFont(new Font("Arial Black", Font.ITALIC, 30));
			    skillslbl_1_1.setBounds(771, 297, 368, 137);
			    SkillsAndHobbies.add(skillslbl_1_1);
			    
			    JLabel wheniwas = new JLabel("when I was in grade 6, I was a player in a sport ");
			    wheniwas.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    wheniwas.setBounds(169, 421, 437, 44);
			    SkillsAndHobbies.add(wheniwas);
			    
			    JLabel called = new JLabel("called badminton  and I was champion at");
			    called.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    called.setBounds(169, 456, 386, 35);
			    SkillsAndHobbies.add(called);
			    
			    JLabel lblNewLabel_1_1 = new JLabel("cluster and district level");
			    lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    lblNewLabel_1_1.setBounds(169, 491, 386, 35);
			    SkillsAndHobbies.add(lblNewLabel_1_1);
			    
			    JLabel lblWhenIWas = new JLabel("When I was in senior high school, I learned ");
			    lblWhenIWas.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    lblWhenIWas.setBounds(757, 410, 437, 44);
			    SkillsAndHobbies.add(lblWhenIWas);
			    
			    JLabel lblNewLabel_1_2 = new JLabel("HTML and CSS, so I have a skill level of 50%");
			    lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    lblNewLabel_1_2.setBounds(757, 445, 386, 35);
			    SkillsAndHobbies.add(lblNewLabel_1_2);
			    
			    JLabel lblNewLabel_1_1_1 = new JLabel("in HTML and CSS.");
			    lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
			    lblNewLabel_1_1_1.setBounds(757, 480, 386, 35);
			    SkillsAndHobbies.add(lblNewLabel_1_1_1);
			    
			    JPanel contactPanel = new JPanel();
			    contactPanel.setBounds(0, 1530, 1261, 123);
			    scrollContent.add(contactPanel);
			    contactPanel.setLayout(null);
			    
			    JLabel contactslbl = new JLabel("Contact");
			    contactslbl.setForeground(new Color(0, 128, 192));
			    contactslbl.setFont(new Font("Arial Black", Font.ITALIC, 40));
			    contactslbl.setBounds(630, -22, 200, 99);
			    contactPanel.add(contactslbl);
			    
			    JLabel hobbieslines_1 = new JLabel("______");
			    hobbieslines_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
			    hobbieslines_1.setBounds(630, -16, 209, 79);
			    contactPanel.add(hobbieslines_1);
			    
			    // for facebook
			    JLabel facebooklbl = new JLabel("Kim Mateo");
			    facebooklbl.setIcon(fb);
			    facebooklbl.setBounds(10, 67, 56, 45);
			    contactPanel.add(facebooklbl);
			    
			    JLabel namenikim = new JLabel("Kim Mateo");
			    namenikim.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			    namenikim.setBounds(67, 82, 164, 30);
			    contactPanel.add(namenikim);
			    
			    JLabel gmaillbl = new JLabel("Kim Mateo");
			    gmaillbl.setIcon(gmail);
			    gmaillbl.setBounds(267, 67, 56, 45);
			    contactPanel.add(gmaillbl);
			    
			    JLabel lblNewLabel_1_3 = new JLabel("Kimmateo658@gmail.com");
			    lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			    lblNewLabel_1_3.setBounds(324, 82, 214, 30);
			    contactPanel.add(lblNewLabel_1_3);
			    
			    JLabel instagramlbl = new JLabel("Kim Mateo");
			    instagramlbl.setIcon(instagram);
			    instagramlbl.setBounds(548, 67, 56, 45);
			    contactPanel.add(instagramlbl);
			    
			    JLabel lblNewLabel_1_4 = new JLabel("dontblamethekim");
			    lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			    lblNewLabel_1_4.setBounds(605, 82, 164, 30);
			    contactPanel.add(lblNewLabel_1_4);
			    
			    JLabel twitterlbl = new JLabel("Kim Mateo");
			    twitterlbl.setIcon(twitter);
			    twitterlbl.setBounds(774, 67, 56, 45);
			    contactPanel.add(twitterlbl);
			    
			    JLabel lblNewLabel_1_5 = new JLabel("@kim041504\r\n");
			    lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			    lblNewLabel_1_5.setBounds(831, 82, 164, 30);
			    contactPanel.add(lblNewLabel_1_5);
			    
			    JLabel phonenumberlbl = new JLabel("Kim Mateo");
			    phonenumberlbl.setIcon(phone);
			    phonenumberlbl.setBounds(1030, 67, 56, 45);
			    contactPanel.add(phonenumberlbl);
			    
			    JLabel lblNewLabel_1_6 = new JLabel("09309579093");
			    lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			    lblNewLabel_1_6.setBounds(1087, 82, 164, 30);
			    contactPanel.add(lblNewLabel_1_6);
	}

}
