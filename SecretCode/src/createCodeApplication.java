import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;



import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;

public class createCodeApplication extends JFrame {

	private JPanel contentPane;
	static GameMethods gm=new GameMethods();
	private JLabel lblInstructions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createCodeApplication frame = new createCodeApplication();
					
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static class CustomPaintComponent extends Component {
		public void paint(Graphics g) {
			Graphics g2d=(Graphics2D)g;
			
			int x=8;
			int y=8;
			int w=getSize().width-20;
			int h=getSize().height-10;
			
			g2d.setColor(Color.BLACK);
			((Graphics2D) g2d).setStroke(new BasicStroke(5));
			
			g2d.drawOval(x, y, w, h);
		}
	}
	
	static class CustomPaintFillComponent extends Component {//fills the circle with the required colour
		public void paint(Graphics g) {
			
				Graphics g2d=(Graphics2D)g;
				
				int x=8;
				int y=8;
				int w=getSize().width-20;
				int h=getSize().height-10;
				
				
				g2d.setColor(gm.getSelectedColor());
				((Graphics2D) g2d).setStroke(new BasicStroke(5));
				
				g2d.fillOval(x, y, w, h);
			
		}
	}

	/**
	 * Create the frame.
	 */
	public createCodeApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeading = new JLabel("Create Your Code");
		lblHeading.setForeground(new Color(220, 20, 60));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setFont(new Font("Segoe Script", Font.BOLD, 46));
		lblHeading.setBounds(68, 0, 502, 93);
		contentPane.add(lblHeading);
		
		Border b=BorderFactory.createLineBorder(Color.BLACK, 5, true);
		
		JButton btnYellow = new JButton("");
		btnYellow.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.YELLOW);
			}
		});
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setBounds(10, 140, 139, 62);
		btnYellow.setBorder(b);
		contentPane.add(btnYellow);
		
		JButton btnBlack = new JButton("");
		btnBlack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.BLACK);
			}
		});
		btnBlack.setBackground(Color.BLACK);
		btnBlack.setBorder(b);
		btnBlack.setBounds(176, 140, 139, 62);
		contentPane.add(btnBlack);
		
		JButton btnGreen = new JButton("");
		btnGreen.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.GREEN);
			}
		});
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setBounds(339, 140, 139, 62);
		btnGreen.setBorder(b);
		contentPane.add(btnGreen);
		
		JButton btnGray = new JButton("");
		btnGray.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.GRAY);
			}
		});
		btnGray.setForeground(Color.BLACK);
		btnGray.setBackground(Color.GRAY);
		btnGray.setBounds(505, 140, 139, 62);
		btnGray.setBorder(b);
		contentPane.add(btnGray);
		
		JButton btnWhite = new JButton("");
		btnGray.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.GRAY);
			}
		});
		btnWhite.setForeground(Color.BLACK);
		btnWhite.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.WHITE);
			}
		});
		btnWhite.setBackground(Color.WHITE);
		btnWhite.setBounds(505, 231, 139, 62);
		btnWhite.setBorder(b);
		contentPane.add(btnWhite);
		
		JButton btnRed = new JButton("");
		btnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.RED);
			}
		});
		btnRed.setBackground(Color.RED);
		btnRed.setBounds(339, 231, 139, 62);
		btnRed.setBorder(b);
		contentPane.add(btnRed);
		
		JButton btnBlue = new JButton("");
		btnBlue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.BLUE);
			}
		});
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setBounds(176, 231, 139, 62);
		btnBlue.setBorder(b);
		contentPane.add(btnBlue);
		
		JButton btnMagenta = new JButton("");
		btnMagenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gm.setSelectedColor(Color.MAGENTA);
			}
		});
		btnMagenta.setBackground(Color.MAGENTA);
		btnMagenta.setBounds(10, 231, 139, 62);
		btnMagenta.setBorder(b);
		contentPane.add(btnMagenta);
		
		JPanel pnlCode0 = new JPanel();
		pnlCode0.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(gm.getSelectedColor()==null) {
					JOptionPane.showMessageDialog(null, "Please Select A Colour First");
				}
				else {
					pnlCode0.add(new CustomPaintFillComponent());
					revalidate();
				}
				
				
			}
		});
		pnlCode0.setBackground(Color.LIGHT_GRAY);
		pnlCode0.setLayout(new BorderLayout(0, 0));
		pnlCode0.add(new CustomPaintComponent());
		pnlCode0.setBounds(110, 325, 100, 80);
		
		contentPane.add(pnlCode0);
		
		JPanel pnlCode1 = new JPanel();
		pnlCode1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(gm.getSelectedColor()==null) {
					JOptionPane.showMessageDialog(null, "Please Select A Colour First");
				}
				else {
					pnlCode1.add(new CustomPaintFillComponent());
					revalidate();
				}
				
				
			}
		});
		pnlCode1.setBackground(Color.LIGHT_GRAY);
		pnlCode1.setLayout(new BorderLayout(0, 0));
		pnlCode1.setBounds(230, 325, 100, 80);
		pnlCode1.add(new CustomPaintComponent());
		contentPane.add(pnlCode1);
		
		JPanel pnlCode2 = new JPanel();
		pnlCode2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(gm.getSelectedColor()==null) {
					JOptionPane.showMessageDialog(null, "Please Select A Colour First");
				}
				else {
					pnlCode2.add(new CustomPaintFillComponent());
					revalidate();
				}
				
				
			}
		});
		pnlCode2.setBackground(Color.LIGHT_GRAY);
		pnlCode2.setBounds(350, 325, 100, 80);
		pnlCode2.setLayout(new BorderLayout(0, 0));
		pnlCode2.add(new CustomPaintComponent());
		contentPane.add(pnlCode2);
		
		JPanel pnlCode3 = new JPanel();
		pnlCode3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(gm.getSelectedColor()==null) {
					JOptionPane.showMessageDialog(null, "Please Select A Colour First");
				}
				else {
					pnlCode3.add(new CustomPaintFillComponent());
					revalidate();
				}
				
				
			}
		});
		pnlCode3.setBackground(Color.LIGHT_GRAY);
		pnlCode3.setBounds(470, 325, 100, 80);
		pnlCode3.setLayout(new BorderLayout(0, 0));
		pnlCode3.add(new CustomPaintComponent());
		contentPane.add(pnlCode3);
		
		lblInstructions = new JLabel("Select a colour, then select where you would like to place\r\n that colour in your code.");
		lblInstructions.setForeground(new Color(51, 0, 0));
		lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructions.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblInstructions.setBounds(10, 67, 634, 62);
		contentPane.add(lblInstructions);
		
		JButton btnNewButton = new JButton("READY!");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Javanese Text", Font.BOLD, 28));
		btnNewButton.setForeground(new Color(255, 102, 0));
		btnNewButton.setBounds(241, 431, 186, 52);
		contentPane.add(btnNewButton);
		
		
		
		
		
	}
	
	public void drawCircles(JPanel jp) {
		for(int i=0;i<4;i++) {
			jp.add(new CustomPaintComponent());
		}
	}
}
