package quizgame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoveQuestions7 extends JFrame {

	private JPanel contentPane;
    private PointDistribution pointDistribution;

    public LoveQuestions7(PointDistribution pointDistribution) {
        this.pointDistribution = pointDistribution;
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
		btnQuit.setIcon(new ImageIcon("src/quizgame/LoveQuit.png"));
		contentPane.add(btnQuit);

		JButton A = new JButton("");
		A.setBorder(null);
		A.setBounds(202, 286, 65, 65);
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pointDistribution.addPoints(5);
				pointDistribution.getTotalPoints();
				new LoveQuestions8(pointDistribution);
				setVisible(false);
				
			}
		});
		A.setIcon(new ImageIcon("src/quizgame/A.png"));
		contentPane.add(A);

		JButton B = new JButton("");
		B.setBorder(null);
		B.setBounds(531, 286, 65, 65);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(5);
				pointDistribution.getTotalPoints();
				new LoveQuestions8(pointDistribution);
				setVisible(false);
			}
		});
		B.setIcon(new ImageIcon("src/quizgame/B.png"));
		contentPane.add(B);

		JButton C = new JButton("");
		C.setBorder(null);
		C.setBounds(202, 355, 65, 65);
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(10);
				pointDistribution.getTotalPoints();
				new LoveQuestions8(pointDistribution);
				setVisible(false);
			}
		});
		C.setIcon(new ImageIcon("src/quizgame/C.png"));
		contentPane.add(C);

		JButton D = new JButton("");
		D.setBorder(null);
		D.setBounds(531, 355, 65, 65);
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(1);
				pointDistribution.getTotalPoints();
				new LoveQuestions8(pointDistribution);
				setVisible(false);
			}
		});
		D.setIcon(new ImageIcon("src/quizgame/D.png"));
		contentPane.add(D);

		JLabel lblBg = new JLabel("");
		lblBg.setBounds(0, 0, 982, 540);
		lblBg.setIcon(new ImageIcon("src/quizgame/LoveQuestion7.png"));
		contentPane.add(lblBg);

	}
}

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