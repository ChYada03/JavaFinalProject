package quizgame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerQuestion1 extends JFrame {

	private JPanel contentPane;
	static CalculateScore calculateScore = new CalculateScore();

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { LoveQuestions frame = new
	 * LoveQuestions(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public PerQuestion1() {
		setTitle("Psychology Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setVisible(true);
		
		setContentPane(contentPane);

		JButton btnQuit = new JButton("");
		btnQuit.setBounds(768, 100, 50, 51);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.setLayout(null);
		btnQuit.setBorder(null);
		btnQuit.setIcon(new ImageIcon(PerQuestion1.class.getResource("/quizgame/PerQuit.png")));
		contentPane.add(btnQuit);

		JButton A = new JButton("");
		A.setBounds(196, 252, 43, 43);
		A.setBorder(null);
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculateScore.addPoints(2);
				calculateScore.getTotalPoints();
				new PerQuestion2(calculateScore);
				setVisible(false);
				
			}
		});
		A.setIcon(new ImageIcon(PerQuestion1.class.getResource("/quizgame/PerA.png")));
		contentPane.add(A);

		JButton B = new JButton("");
		B.setBounds(196, 313, 43, 43);
		B.setBorder(null);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateScore.addPoints(4);
				calculateScore.getTotalPoints();
				new PerQuestion2(calculateScore);
				setVisible(false);
			}
		});
		B.setIcon(new ImageIcon(PerQuestion1.class.getResource("/quizgame/PerB.png")));
		contentPane.add(B);

		JButton C = new JButton("");
		C.setBounds(196, 375, 43, 43);
		C.setBorder(null);
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateScore.addPoints(6);
				calculateScore.getTotalPoints();
				new PerQuestion2(calculateScore);
				setVisible(false);
			}
		});
		C.setIcon(new ImageIcon(PerQuestion1.class.getResource("/quizgame/PerC.png")));
		contentPane.add(C);

		JLabel lblBg = new JLabel("");
		lblBg.setBounds(0, 0, 982, 540);
		lblBg.setIcon(new ImageIcon(PerQuestion1.class.getResource("/quizgame/PerQuestion1.png")));
		contentPane.add(lblBg);

	}
}