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

public class LoveQuestion8 extends JFrame {

	private JPanel contentPane;	
	private PointDistribution pointDistribution;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoveQuestion8 frame = new LoveQuestion8();
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
	public LoveQuestion8(PointDistribution pointDistribution) {
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
				pointDistribution.addPoints(5);
				pointDistribution.getTotalPoints();
				if (pointDistribution.getTotalPoints() >= 60 && pointDistribution.getTotalPoints() <= 80) {
					new LoveResultA(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 45 && pointDistribution.getTotalPoints() <= 59) {
					new LoveResultB(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 20 && pointDistribution.getTotalPoints() <= 44) {
					new LoveResultC(pointDistribution);
				}else if (pointDistribution.getTotalPoints() <= 19) {
					new LoveResultD(pointDistribution);
				}
				setVisible(false);
			}
		});
		A.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/A.png")));
		A.setBounds(201, 275, 56, 57);
		contentPane.add(A);
		
		JButton B = new JButton();
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pointDistribution.getTotalPoints() >= 60 && pointDistribution.getTotalPoints() <= 80) {
					new LoveResultA(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 45 && pointDistribution.getTotalPoints() <= 59) {
					new LoveResultB(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 20 && pointDistribution.getTotalPoints() <= 44) {
					new LoveResultC(pointDistribution);
				}else if (pointDistribution.getTotalPoints() <= 19) {
					new LoveResultD(pointDistribution);
				}
				setVisible(false);
			}
		});
		B.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/B.png")));
		B.setBounds(522, 275, 56, 57);
		contentPane.add(B);
		
		JButton C = new JButton();
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(5);
				pointDistribution.getTotalPoints();
				if (pointDistribution.getTotalPoints() >= 60 && pointDistribution.getTotalPoints() <= 80) {
					new LoveResultA(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 45 && pointDistribution.getTotalPoints() <= 59) {
					new LoveResultB(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 20 && pointDistribution.getTotalPoints() <= 44) {
					new LoveResultC(pointDistribution);
				}else if (pointDistribution.getTotalPoints() <= 19) {
					new LoveResultD(pointDistribution);
				}
				setVisible(false);
			}
		});
		C.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/C.png")));
		C.setBounds(201, 342, 56, 57);
		contentPane.add(C);
		
		JButton D = new JButton();
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointDistribution.addPoints(1);
				pointDistribution.getTotalPoints();
				if (pointDistribution.getTotalPoints() >= 60 && pointDistribution.getTotalPoints() <= 80) {
					new LoveResultA(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 45 && pointDistribution.getTotalPoints() <= 59) {
					new LoveResultB(pointDistribution);
				}else if (pointDistribution.getTotalPoints() >= 20 && pointDistribution.getTotalPoints() <= 44) {
					new LoveResultC(pointDistribution);
				}else if (pointDistribution.getTotalPoints() <= 19) {
					new LoveResultD(pointDistribution);
				}
				setVisible(false);
			}
		});
		D.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/D.png")));
		D.setBounds(522, 342, 56, 57);
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
		lblBg.setIcon(new ImageIcon(LoveQuestions1.class.getResource("/quizgame/LoveQuestion8.png")));
		lblBg.setBounds(0, 0, 946, 503);
		contentPane.add(lblBg);
	}

}
