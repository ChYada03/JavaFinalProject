package quizgame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoveQuestions3 extends JFrame {

	private JPanel contentPane;
	private PointDistribution pointDistribution;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoveQuestions3 frame = new LoveQuestions3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public LoveQuestions3(PointDistribution pointDistribution) {
		this.pointDistribution = pointDistribution;
		setTitle("Psychology Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setVisible(true);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton A = new JButton();
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(1);
				pointDistribution.getTotalPoints();				
				new LoveQuestions4(pointDistribution);
				setVisible(false);
			}
		});
		A.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/A.png")));
		A.setBounds(212, 249, 56, 57);
		contentPane.add(A);
		
		JButton B = new JButton();
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(10);
				pointDistribution.getTotalPoints();	
				new LoveQuestions4(pointDistribution);
				setVisible(false);
			}
		});
		B.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/B.png")));
		B.setBounds(518, 249, 56, 57);
		contentPane.add(B);
		
		JButton C = new JButton();
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(5);
				pointDistribution.getTotalPoints();	
				new LoveQuestions4(pointDistribution);
				setVisible(false);
			}
		});
		C.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/C.png")));
		C.setBounds(212, 338, 56, 57);
		contentPane.add(C);
		
		JButton D = new JButton();
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(5);
				pointDistribution.getTotalPoints();	
				new LoveQuestions4(pointDistribution);
				setVisible(false);
			}
		});
		D.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/D.png")));
		D.setBounds(518, 338, 56, 57);
		contentPane.add(D);
		
		JButton x = new JButton();
		x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Category();
				setVisible(false);
			}
		});
		x.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/exit.png")));
		x.setBounds(768, 79, 51, 52);
		contentPane.add(x);

		JLabel lblBg = new JLabel();
		lblBg.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/LoveQuestion3.png")));
		lblBg.setBounds(0, 0, 946, 503);
		contentPane.add(lblBg);
	
	}

}
