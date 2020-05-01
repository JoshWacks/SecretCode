import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomeGUI {

	private JFrame frame;
	private JTextField txtFP1Username;
	private JTextField txtFP2Username;
	private GameMethods gm=new GameMethods();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeGUI window = new WelcomeGUI();
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
	public WelcomeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 771, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeading = new JLabel("Welcome To Mastermind");
		lblHeading.setBounds(26, 40, 707, 71);
		lblHeading.setForeground(new Color(220, 20, 60));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setFont(new Font("Segoe Script", Font.BOLD, 52));
		frame.getContentPane().add(lblHeading);
		
		JLabel lblPlayer1Username = new JLabel("Player 1 Username:");
		lblPlayer1Username.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1Username.setFont(new Font("MS Gothic", Font.BOLD, 26));
		lblPlayer1Username.setBackground(Color.CYAN);
		lblPlayer1Username.setForeground(Color.CYAN);
		lblPlayer1Username.setBounds(24, 178, 280, 37);
		frame.getContentPane().add(lblPlayer1Username);
		
		JLabel lblCode = new JLabel("You will be setting the code and judging");
		lblCode.setFont(new Font("Javanese Text", Font.BOLD, 14));
		lblCode.setForeground(Color.WHITE);
		lblCode.setBounds(26, 221, 308, 37);
		frame.getContentPane().add(lblCode);
		
		JLabel lblPlayer2Username = new JLabel("Player 2 Username:");
		lblPlayer2Username.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer2Username.setForeground(Color.CYAN);
		lblPlayer2Username.setFont(new Font("MS Gothic", Font.BOLD, 26));
		lblPlayer2Username.setBackground(Color.CYAN);
		lblPlayer2Username.setBounds(26, 296, 280, 37);
		frame.getContentPane().add(lblPlayer2Username);
		
		JLabel lbl1Attempt = new JLabel("You will be attempting to break the code");
		lbl1Attempt.setForeground(Color.WHITE);
		lbl1Attempt.setFont(new Font("Javanese Text", Font.BOLD, 14));
		lbl1Attempt.setBounds(26, 333, 306, 37);
		frame.getContentPane().add(lbl1Attempt);
		
		txtFP1Username = new JTextField();
		txtFP1Username.setFont(new Font("Javanese Text", Font.BOLD, 18));
		txtFP1Username.setHorizontalAlignment(SwingConstants.CENTER);
		txtFP1Username.setBounds(314, 185, 268, 30);
		frame.getContentPane().add(txtFP1Username);
		txtFP1Username.setColumns(10);
		
		txtFP2Username = new JTextField();
		txtFP2Username.setHorizontalAlignment(SwingConstants.CENTER);
		txtFP2Username.setFont(new Font("Javanese Text", Font.BOLD, 18));
		txtFP2Username.setColumns(10);
		txtFP2Username.setBounds(314, 303, 268, 30);
		frame.getContentPane().add(txtFP2Username);
		
		JButton btnReady = new JButton("Ready");
		btnReady.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String u1=txtFP1Username.getText().toString();
				String u2=txtFP2Username.getText().toString();
				if(u1.equals("")||u2.equals("")) {
					JOptionPane.showMessageDialog(frame, "Please enter a username");
				}
				else {
					gm.setP1Username(u1);
					gm.setP1Username(u2);
					
					createCodeApplication window=new createCodeApplication();
					frame.setVisible(false);
					window.setVisible(true);
				}
				
			}
		});
		btnReady.setForeground(new Color(0, 204, 0));
		btnReady.setFont(new Font("Segoe Script", Font.BOLD, 28));
		btnReady.setBounds(493, 395, 147, 57);
		btnReady.setBorder(BorderFactory.createLineBorder(new Color(0, 204, 0), 3, true));
		frame.getContentPane().add(btnReady);
	}
}
