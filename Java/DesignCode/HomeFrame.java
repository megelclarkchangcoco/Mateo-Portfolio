package Portfolio3;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class HomeFrame extends JFrame {
	private ImageIcon homeIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\home.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon aboutmeicon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\information-button.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon contacticon = new ImageIcon(
			new ImageIcon("C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\FreeLancingJava\\\\src\\\\assets\\\\contact.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

	private ImageIcon userIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\rainerheaders.png")
					.getImage().getScaledInstance(166, 111, Image.SCALE_DEFAULT));
	

	private JPanel contentPane;
	public static HomePanel homePanels;
	public static AboutmePanel aboutmePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeFrame() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
//		setIconImage(windowIcon.getImage());
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//==================Create an instance PANEL CLASS ============================
		
		homePanels = new HomePanel();
		homePanels.setBackground(new Color(255, 255, 255));
		aboutmePanel = new AboutmePanel();
		aboutmePanel.setBackground(new Color(255, 255, 255));
		
		
	 // Add the panelHome instance to the content pane of the DashboardFrame
	    contentPane.add(homePanels);
	    contentPane.add(aboutmePanel);

	 // Call revalidate() and repaint() to update the frame
	    contentPane.revalidate();
	    contentPane.repaint();
		
	  // set the bounds of the panels
        homePanels.setBounds(0, 59, 1280, 673);
        aboutmePanel.setBounds(0, 59, 1280, 673);
	//==========End  Header Panel =============================
		
		
		
		
	//========== UP Panel================================
		
		
		JPanel UpPanel = new JPanel();
		UpPanel.setBackground(new Color(0, 128, 192));
		UpPanel.setBounds(0, 0, 1280, 59);
		contentPane.add(UpPanel);
		UpPanel.setLayout(null);
		
		
		JPanel HomePanel = new JPanel();
		HomePanel.addMouseListener(new PanelButtonMouseAdapter(HomePanel){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(HomePanel);
		        homePanels.setVisible(true);// for home panel
	            aboutmePanel.setVisible(false);
	            

		    }
		});
		HomePanel.setBackground(new Color(0, 128, 192));
		HomePanel.setBounds(837, 11, 197, 48);
		UpPanel.add(HomePanel);
		HomePanel.setLayout(null);
		
		JLabel Homelbl = new JLabel("HOME");
		Homelbl.setFont(new Font("Dialog", Font.BOLD, 14));
		Homelbl.setIcon(homeIcon);
		Homelbl.setBounds(22, 0, 197, 58);
		HomePanel.add(Homelbl);
		
		JPanel aboutmepanel = new JPanel();
		aboutmepanel.setBounds(1040, 11, 197, 48);
		UpPanel.add(aboutmepanel);
		aboutmepanel.addMouseListener(new PanelButtonMouseAdapter(aboutmepanel){
			public void mouseClicked(MouseEvent e) {
				menuClicked(aboutmepanel);
				homePanels.setVisible(false);
	            aboutmePanel.setVisible(true);// for panel about me panel
	        
			}
			});
		aboutmepanel.setBackground(new Color(0, 128, 192));
		aboutmepanel.setLayout(null);
		
		JLabel Aboutme = new JLabel("About me");
		Aboutme.setFont(new Font("Dialog", Font.BOLD, 14));
		Aboutme.setIcon(aboutmeicon);
		Aboutme.setBounds(23, 0, 197, 58);
		aboutmepanel.add(Aboutme);
		
		

	}
	
	// create new method for JPanel class
	public void menuClicked(JPanel selectedPanel){
	    homePanels.setVisible(false);
	    aboutmePanel.setVisible(false);
	    selectedPanel.setVisible(true);
	}
	
	
	
	 // ================== JPANEL NAMING ACTION LISTENER ===================== 
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e){
			
			panel.setBackground(new Color(250,  246, 110));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 192));
		}
		
		@Override
		public void mousePressed(MouseEvent e){
			panel.setBackground(new Color(250,  246, 110));
		} 
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(0, 128, 192));
		}
	}	
	
}