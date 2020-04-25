import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameApplication {

	private static JFrame frame;
	private final JPanel pnlMain = new JPanel();
	private final JPanel pnlColorsCard = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameApplication window = new GameApplication();

					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameApplication() {
		initialize();
		createMainPanel();
		createChooseColourPanel();
	}
	
	static class CustomPaintComponent extends Component {
		public void paint(Graphics g) {
			Graphics g2d=(Graphics2D)g;
			g2d.setColor(Color.BLACK);
			int x=0;
			int y=0;
			int w=getSize().width-1;
			int h=getSize().height-1;
			
			g2d.drawOval(x, y, w, h);
					
			
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 0, 700, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setBackground(Color.BLACK);
		frame.setForeground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		pnlMain.setBackground(Color.BLACK);
		pnlMain.setBounds(0, 70, 700, 535);
		
		frame.getContentPane().add(pnlMain);
		
		GridLayout grid=new GridLayout(10,5, 8,10);
		
		

		pnlMain.setLayout(grid);
		
		
		
		pnlColorsCard.setBackground(Color.ORANGE);
		pnlColorsCard.setBounds(0, 608, 694, 113);
		frame.getContentPane().add(pnlColorsCard);
		pnlColorsCard.setLayout(new CardLayout(0, 0));
		
		JLabel lblDanger = new JLabel("");
		lblDanger.setBackground(Color.RED);
		lblDanger.setForeground(Color.RED);
		lblDanger.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanger.setIcon(new ImageIcon(GameApplication.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error@2x.png")));
		lblDanger.setBounds(0, 0, 147, 69);
		frame.getContentPane().add(lblDanger);
		
		JButton btnSecretCode = new JButton("SECRET CODE");
		btnSecretCode.setBounds(145, 0, 407, 69);
		frame.getContentPane().add(btnSecretCode);
		btnSecretCode.setForeground(Color.YELLOW);
		btnSecretCode.setFont(new Font("High Tower Text", Font.BOLD, 36));
		btnSecretCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSecretCode.setIcon(new ImageIcon(GameApplication.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		btnSecretCode.setBackground(Color.RED);
		
		JLabel lblDanger2 = new JLabel("");
		lblDanger2.setBackground(Color.RED);
		lblDanger2.setIcon(new ImageIcon(GameApplication.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error@2x.png")));
		lblDanger2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanger2.setForeground(Color.WHITE);
		lblDanger2.setBounds(555, 0, 139, 69);
		frame.getContentPane().add(lblDanger2);
		
		
	}
	
	public void createMainPanel() {
		String resultName="pnlJudge";
		String attemptName="btnAttempt";
		int count1=9;
		int count2=9;
		int col=0;
		
		
		for(int i=0;i<50;i++) {
			
			if((i%5)==0) {

				
				JPanel pnlJudge=new JPanel();
				GridLayout grid=new GridLayout(1,4,3,0);
				pnlJudge.setLayout(grid);
				pnlJudge.setBackground(Color.WHITE);
				for(int k=0;k<4;k++) {
					pnlJudge.add(new CustomPaintComponent());
					pnlJudge.setName(resultName+count2);
					

				}
				count2--;
				pnlMain.add(pnlJudge);
				col=0;
				if(i!=0) {
					count1--;
				}
				
			}
			else {
				JButton btnAttempt=new JButton();
				btnAttempt.setName(attemptName+count1+""+col);

			
				col++;

				btnAttempt.setBackground(Color.WHITE);
				pnlMain.add(btnAttempt);
				
			}
			
		}
	}
	public void createChooseColourPanel() {
		GridLayout grid=new GridLayout(2,4,15,15);
		JPanel pnlColors=new JPanel();
		pnlColors.setLayout(grid);
		
		
		Border b=BorderFactory.createLineBorder(Color.BLACK, 5, true);
		
		JButton btnYellow=new JButton();
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnYellow.setName("btnYellow");
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setBorder(b);
		pnlColors.add(btnYellow);
		
		JButton btnGreen=new JButton();
		btnGreen.setName("btnGreen");
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setBorder(b);
		pnlColors.add(btnGreen);
		
		JButton btnMagenta=new JButton();
		btnMagenta.setName("btnMagenta");
		btnMagenta.setBackground(Color.MAGENTA);
		btnMagenta.setBorder(b);
		pnlColors.add(btnMagenta);

		JButton btnBlue=new JButton();
		btnBlue.setName("btnBlue");
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setBorder(b);
		pnlColors.add(btnBlue);
		
		JButton btnWhite=new JButton();
		btnWhite.setName("btnWhite");
		btnWhite.setBackground(Color.WHITE);
		btnWhite.setBorder(b);
		pnlColors.add(btnWhite);
		
		JButton btnBlack=new JButton();
		btnBlack.setName("btnBlack");
		btnBlack.setBackground(Color.BLACK);
		btnBlack.setBorder(b);
		pnlColors.add(btnBlack);
		
		JButton btnRed=new JButton();
		btnRed.setName("btnRed");
		btnRed.setBackground(Color.RED);
		btnRed.setBorder(b);
		pnlColors.add(btnRed);
		
		JButton btnGray=new JButton();
		btnGray.setName("btnGray");
		btnGray.setBackground(Color.GRAY);
		btnGray.setBorder(b);
		pnlColors.add(btnGray);
		
		
		pnlColorsCard.add(pnlColors);
	}
}
