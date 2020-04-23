import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

import java.awt.CardLayout;

public class GameApplication {

	private JFrame frame;
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
		pnlMain.setBounds(0, 70, 700, 540);
		frame.getContentPane().add(pnlMain);
		pnlMain.setLayout(new GridLayout(10,5, 8,10));
		
		
		pnlColorsCard.setBackground(Color.ORANGE);
		pnlColorsCard.setBounds(0, 608, 694, 113);
		frame.getContentPane().add(pnlColorsCard);
		pnlColorsCard.setLayout(new CardLayout(0, 0));
		
		

		
//		JPanel pnlJudge9=new JPanel();
//		pnlJudge9.setBackground(Color.WHITE);
//		pnlMain.add(pnlJudge9);
//		
//		JTextPane txtpA90=new JTextPane();
//		txtpA90.setBackground(Color.WHITE);
//		pnlMain.add(txtpA90);
//		
//		JTextPane txtpA91=new JTextPane();
//		txtpA91.setBackground(Color.WHITE);
//		pnlMain.add(txtpA91);
		
		
	}
	public void createMainPanel() {
		String resultName="jtxtResult";
		String attemptName="jtxtAttempt";
		int count1=9;
		int col=0;
		
		for(int i=0;i<50;i++) {
			
			if((i%5)==0) {
				
				
				JPanel pnlJudge=new JPanel();
				GridLayout grid=new GridLayout(1,4,3,3);
				pnlJudge.setLayout(grid);
				pnlJudge.setBackground(Color.WHITE);
				for(int k=0;k<4;k++) {
					JTextPane jtxtResult=new JTextPane();
					jtxtResult.setBackground(Color.CYAN);
					jtxtResult.setName(resultName+count1+""+k);
					jtxtResult.setText(jtxtResult.getName());
					pnlJudge.add(jtxtResult);
				}
				pnlMain.add(pnlJudge);
				col=0;
				if(i!=0) {
					count1--;
				}
				
			}
			else {
				JTextPane jtxtAttempt=new JTextPane();
				jtxtAttempt.setName(attemptName+count1+""+col);
				col++;
				jtxtAttempt.setText(jtxtAttempt.getName());
				jtxtAttempt.setBackground(Color.WHITE);
				pnlMain.add(jtxtAttempt);
				
			}
			
		}
	}
	public void createChooseColourPanel() {
		GridLayout grid=new GridLayout(2,4,15,15);
		JPanel pnlColors=new JPanel();
		pnlColors.setLayout(grid);
		
		
		Border b=BorderFactory.createLineBorder(Color.BLACK, 2, true);
		
		JButton btnYellow=new JButton();
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
