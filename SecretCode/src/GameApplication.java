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

import javax.swing.border.Border;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.CardLayout;


import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class GameApplication {

	public static JFrame frame;
	private final JPanel pnlMain = new JPanel();
	private final JPanel pnlColorsCard = new JPanel();
	
	JLabel lblAttemptNo = new JLabel();
	static GameMethods gm=new GameMethods();
	//checks that a color for each block was entered
	JButton btnDone = new JButton();
	JButton btnCheck=new JButton();
	
	JPanel pnlColors=new JPanel();
	JPanel pnlJudge=new JPanel();
	
	boolean onAttempt=true;


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
		

		pnlColorsCard.setBounds(0, 608, 694, 113);
		
		pnlColorsCard.setLayout(new CardLayout());
		frame.getContentPane().add(pnlColorsCard);
		

		createChooseColourPanel();
		createJudgePanel();
		
		
		
	}
	
	static class JudgePaintComponent extends Component {//paints the circles for the judging
		public void paint(Graphics g) {
			Graphics g2d=(Graphics2D)g;
			g2d.setColor(Color.BLACK);
			int x=5;
			int y=8;
			int w=getSize().width-7;
			int h=getSize().height-15;
			((Graphics2D) g2d).setStroke(new BasicStroke(3));
			
			g2d.drawOval(x, y, w, h);
					
			
			
		}
	}
	
	static class AttemptPaintComponent extends Component {//paints the ovals for the attempts
		public void paint(Graphics g) {
			Graphics g2d=(Graphics2D)g;
			g2d.setColor(Color.BLACK);
			int x=40;
			int y=3;
			int w=getSize().width-90;
			int h=getSize().height-5;
			((Graphics2D) g2d).setStroke(new BasicStroke(5));
			
			g2d.drawOval(x, y, w, h);
					
			
			
		}
	}
	
	static class CustomPaintFillAttemptGreen extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.GREEN);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptBlack extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.BLACK);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptBlue extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.BLUE);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptWhite extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.WHITE);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptMagenta extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.MAGENTA);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptRed extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.RED);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptGray extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.GRAY);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	static class CustomPaintFillAttemptYellow extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=40;
				int y=3;
				int w=getSize().width-90;
				int h=getSize().height-5;
				


				g2d.setColor(Color.YELLOW);


				
				g2d.fillOval(x, y, w, h);
			
		}
	}
	
	
	
	static class CustomPaintFillJudgeYellow extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=5;
				int y=8;
				int w=getSize().width-7;
				int h=getSize().height-15;
				((Graphics2D) g2d).setStroke(new BasicStroke(3));

				g2d.setColor(Color.YELLOW);
		
				g2d.fillOval(x, y, w, h);
			
		}
	}
	

	static class CustomPaintFillJudgeRed extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=5;
				int y=8;
				int w=getSize().width-7;
				int h=getSize().height-15;
				((Graphics2D) g2d).setStroke(new BasicStroke(3));

				g2d.setColor(Color.RED);
		
				g2d.fillOval(x, y, w, h);
			
		}
	}
	
	public void judgeMethod() {
		
		onAttempt=false;
		CardLayout cl = (CardLayout)(pnlColorsCard.getLayout());
		cl.show(pnlColorsCard, "judge");
		
		
		
		
		btnCheck.setVisible(false);
		btnDone.setVisible(true);
		frame.revalidate();
	}
	
//	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 0, 900, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setBackground(Color.BLACK);
		frame.setForeground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		pnlMain.setBackground(Color.BLACK);
		pnlMain.setBounds(0, 70, 700, 535);
		
		frame.getContentPane().add(pnlMain);
		
		GridLayout grid=new GridLayout(10,5, 0,7);//the main grid layout
		
		

		
		//frame.getContentPane().add(new linePaintComponent());//draws the dividing line on the board
		pnlMain.setLayout(grid);
		
		
				
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
		btnSecretCode.setFont(new Font("High Tower Text", Font.BOLD, 40));
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
		
		JLabel lblAttemptHeading = new JLabel("Attempt No.");
		lblAttemptHeading.setForeground(new Color(0, 51, 153));
		lblAttemptHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttemptHeading.setFont(new Font("Segoe Script", Font.BOLD, 28));
		lblAttemptHeading.setBounds(710, 98, 187, 82);
		frame.getContentPane().add(lblAttemptHeading);
		
		
		lblAttemptNo.setText("1");
		lblAttemptNo.setFont(new Font("Rockwell", Font.BOLD, 86));
		lblAttemptNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttemptNo.setBounds(730, 184, 140, 88);
		lblAttemptNo.setForeground(new Color(0, 51, 153));
		lblAttemptNo.setBackground(Color.BLACK);
		lblAttemptNo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
		frame.getContentPane().add(lblAttemptNo);
		
		
		btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				judgeMethod();
				
			}
			
		});
		
		btnCheck.setText("Let's See");
		btnCheck.setBackground(Color.BLACK);
		btnCheck.setForeground(new Color(0, 128, 0));
		btnCheck.setFont(new Font("ROCKWELL", Font.BOLD, 26));
		btnCheck.setToolTipText("Press here to check you attempt");
		btnCheck.setBounds(715, 530, 168, 60);
		frame.getContentPane().add(btnCheck);
		
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String s=lblAttemptNo.getText().toString();
				switch(s) {
				case "1":
					lblAttemptNo.setText("2");
					break;
				case "2":
					lblAttemptNo.setText("3");
					break;
				case "3":
					lblAttemptNo.setText("4");
					break;
				case "4":
					lblAttemptNo.setText("5");
					break;
				case "5":
					lblAttemptNo.setText("6");
					break;
				case "6":
					lblAttemptNo.setText("7");
					break;					
				case "7":
					lblAttemptNo.setText("8");
					break;
				case "8":
					lblAttemptNo.setText("9");
					break;
				case "9":
					lblAttemptNo.setText("10");
					break;
					
					
				}
				
				CardLayout cl = (CardLayout)(pnlColorsCard.getLayout());
				cl.show(pnlColorsCard, "colors");
				onAttempt=true;
				
				btnCheck.setVisible(true);
				btnDone.setVisible(false);
				//frame.revalidate();
				
				
				
			}
		});
		frame.getContentPane().add(lblAttemptNo);
		
		
		btnDone.setToolTipText("Press here when you're done checking\r\n");
		btnDone.setText("Done");
		btnDone.setForeground(new Color(0, 128, 0));
		btnDone.setFont(new Font("Rockwell", Font.BOLD, 26));
		btnDone.setBackground(Color.BLACK);
		btnDone.setBounds(715, 633, 168, 60);
		btnDone.setVisible(false);
		frame.getContentPane().add(btnDone);
		
		
	}
	
	
	
	
		
		
		public void createMainPanel() {
			
		String resultName="pnlJudge";
		String attemptName="pnlAttempt";
		int row1=9;
		int count2=9;
		int col=0;
		
		
		for(int i=0;i<50;i++) {
			
			if((i%5)==0) {

				
				JPanel pnlJudge=new JPanel();
				pnlJudge.setName(resultName+count2);//changes the name to which row it is judging
				GridLayout grid=new GridLayout(1,4,0,0);
				pnlJudge.setLayout(grid);
				pnlJudge.setBackground(Color.WHITE);
				
				for(int k=0;k<4;k++) {
					JPanel temp=new JPanel();
					temp.setLayout(new BorderLayout());
					temp.setBackground(Color.WHITE);
					temp.add(new JudgePaintComponent());
					temp.addMouseListener(new MouseAdapter() {
						@Override
						public void mousePressed(MouseEvent e) {
							String str=lblAttemptNo.getText().toString();
							int n=Integer.parseInt(str);
							boolean correctRow=gm.checkCorrectRow(pnlJudge, n);
							String row;
							if(n==1) {
								row="1st";
							}
							else if(n==2) {
								row="2nd";
								
							}
							else if(n==3) {
								row="3rd";
								
							}
							else {
								row=n+"th";
							}

							if(!gm.getSelectedColor().equals(Color.RED) && !gm.getSelectedColor().equals(Color.YELLOW)) {
								JOptionPane.showMessageDialog(null, "Please Select A Colour First");
							}
							else if(!correctRow) {
								JOptionPane.showMessageDialog(null, "Please Select A Position On The "+row+" Row");
							}
							else if(onAttempt) {
								JOptionPane.showMessageDialog(frame, "Please only attempt the code in the 4 circles on the right");
							}
							else {

								if(gm.getSelectedColor().equals(Color.RED)) {
									temp.add(new CustomPaintFillJudgeRed());
								}
								else if(gm.getSelectedColor().equals(Color.YELLOW)) {
									temp.add(new CustomPaintFillJudgeYellow());
								}
								
								
//								
								temp.revalidate();
								temp.repaint();
								
							}
						}
					});
					
					pnlJudge.add(temp);
					
				}
				
				count2--;
				pnlMain.add(pnlJudge);
				col=0;
				if(i!=0) {
					row1--;
				}
				
			}
			else {
				JPanel pnlAttempt=new JPanel();
				
				pnlAttempt.setLayout(new BorderLayout(0, 0));
				pnlAttempt.setName(attemptName+row1+""+col);
				pnlAttempt.setBackground(Color.WHITE);
				pnlAttempt.add(new AttemptPaintComponent());
				
				pnlAttempt.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						String str=lblAttemptNo.getText().toString();
						int n=Integer.parseInt(str);
						boolean correctRow=gm.checkCorrectRow(pnlAttempt, n);
						String row;
						if(n==1) {
							row="1st";
						}
						else if(n==2) {
							row="2nd";
							
						}
						else if(n==3) {
							row="3rd";
							
						}
						else {
							row=n+"th";
						}
						
						if(gm.getSelectedColor()==null) {
							JOptionPane.showMessageDialog(null, "Please Select A Colour First");
						}
						else if(!correctRow) {
							JOptionPane.showMessageDialog(null, "Please Select A Position On The "+row+" Row");
						}
						else if(!onAttempt) {
							JOptionPane.showMessageDialog(frame, "You cannot edit their code while checking");
						}
						else {
							
							
							if(gm.getSelectedColor().equals(Color.GREEN)) {
								pnlAttempt.add(new CustomPaintFillAttemptGreen());
							}
							else if(gm.getSelectedColor().equals(Color.GRAY)) {
								pnlAttempt.add(new CustomPaintFillAttemptGray());
							}
							else if(gm.getSelectedColor().equals(Color.WHITE)) {
								pnlAttempt.add(new CustomPaintFillAttemptWhite());
							}
							else if(gm.getSelectedColor().equals(Color.BLUE)) {
								pnlAttempt.add(new CustomPaintFillAttemptBlue());
							}
							else if(gm.getSelectedColor().equals(Color.RED)) {
								pnlAttempt.add(new CustomPaintFillAttemptRed());
							}
							else if(gm.getSelectedColor().equals(Color.MAGENTA)) {
								pnlAttempt.add(new CustomPaintFillAttemptMagenta());
							}
							else if(gm.getSelectedColor().equals(Color.YELLOW)) {
								pnlAttempt.add(new CustomPaintFillAttemptYellow());
							}
							else if(gm.getSelectedColor().equals(Color.BLACK)) {
								pnlAttempt.add(new CustomPaintFillAttemptBlack());
							}
							
							pnlAttempt.revalidate();
							pnlAttempt.repaint();
							
						}
						
						
					}
				});

			
				col++;

				
				pnlMain.add(pnlAttempt);
				
			}
			
		}
	}
		
		
	public void createJudgePanel() {//makes the judging panel
		GridLayout grid=new GridLayout(2,2,25,25);
		
		pnlJudge.setLayout(grid);
		
		Border b=BorderFactory.createLineBorder(Color.BLACK, 5, true);
		
		JButton btnYellow=new JButton();
		btnYellow.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.YELLOW);
				
			}
		});
		
		btnYellow.setName("btnYellow");
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setBorder(b);
		pnlJudge.add(btnYellow);
		
		JButton btnRed=new JButton();
		btnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.RED);

			}
		});
		btnRed.setName("btnRed");
		btnRed.setBackground(Color.RED);
		btnRed.setBorder(b);
		pnlJudge.add(btnRed);
		
		JLabel lblYellow=new JLabel();
		lblYellow.setBorder(b);
		lblYellow.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellow.setFont(new Font("Javanese Text", Font.BOLD, 14));
		lblYellow.setText("Yellow=Right Color Wrong Place");
		
		pnlJudge.add(lblYellow);
		
		JLabel lblRed=new JLabel();
		lblRed.setBorder(b);
		lblRed.setHorizontalAlignment(SwingConstants.CENTER);
		lblRed.setFont(new Font("Javanese Text", Font.BOLD, 14));
		lblRed.setText("Red=Right Color Right Place");
		pnlJudge.add(lblRed);
		
		pnlColorsCard.add(pnlJudge,"judge");

		
	
		
	}
		
		
	public void createChooseColourPanel() {
		GridLayout grid=new GridLayout(2,4,15,15);
		
		pnlColors.setLayout(grid);
		
		
		Border b=BorderFactory.createLineBorder(Color.BLACK, 5, true);
		
		JButton btnYellow=new JButton();
		btnYellow.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.YELLOW);
			}
		});
		
		btnYellow.setName("btnYellow");
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setBorder(b);
		pnlColors.add(btnYellow);
		
		JButton btnGreen=new JButton();
		btnGreen.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.GREEN);
			}
		});
		btnGreen.setName("btnGreen");
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setBorder(b);
		pnlColors.add(btnGreen);
		
		JButton btnMagenta=new JButton();
		btnMagenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.MAGENTA);
			}
		});
		btnMagenta.setName("btnMagenta");
		btnMagenta.setBackground(Color.MAGENTA);
		btnMagenta.setBorder(b);
		pnlColors.add(btnMagenta);

		JButton btnBlue=new JButton();
		btnBlue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.BLUE);
			}
		});
		btnBlue.setName("btnBlue");
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setBorder(b);
		pnlColors.add(btnBlue);
		
		JButton btnWhite=new JButton();
		btnWhite.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.WHITE);
			}
		});
		btnWhite.setName("btnWhite");
		btnWhite.setBackground(Color.WHITE);
		btnWhite.setBorder(b);
		pnlColors.add(btnWhite);
		
		JButton btnBlack=new JButton();

		btnBlack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.BLACK);
			}
		});
		btnBlack.setName("btnBlack");
		btnBlack.setBackground(Color.BLACK);
		btnBlack.setBorder(b);
		pnlColors.add(btnBlack);
		
		JButton btnRed=new JButton();
		btnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.RED);
			}
		});
		btnRed.setName("btnRed");
		btnRed.setBackground(Color.RED);
		btnRed.setBorder(b);
		pnlColors.add(btnRed);
		
		JButton btnGray=new JButton();
		btnGray.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.GRAY);
			}
		});
		btnGray.setName("btnGray");
		btnGray.setBackground(Color.GRAY);
		btnGray.setBorder(b);
		pnlColors.add(btnGray);
		
		
		pnlColorsCard.add(pnlColors,"colors");
	}
}