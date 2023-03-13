package quizgame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerQuestion2 extends JFrame {

	private JPanel contentPane;
    private CalculateScore calculateScore;

    public PerQuestion2(CalculateScore calculateScore) {
        this.calculateScore = calculateScore;
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
    		btnQuit.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerQuit.png")));
    		contentPane.add(btnQuit);

    		JButton A = new JButton("");
    		A.setBounds(174, 251, 43, 43);
    		A.setBorder(null);
    		A.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent arg0) {
    				calculateScore.addPoints(6);
    				calculateScore.getTotalPoints();
    				new PerQuestion3(calculateScore);
    				setVisible(false);
    				
    			}
    		});
    		A.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerA.png")));
    		contentPane.add(A);

    		JButton B = new JButton("");
    		B.setBounds(174, 317, 43, 43);
    		B.setBorder(null);
    		B.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(4);
    				calculateScore.getTotalPoints();
    				new PerQuestion3(calculateScore);
    				setVisible(false);
    			}
    		});
    		B.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerB.png")));
    		contentPane.add(B);

    		JButton C = new JButton("");
    		C.setBounds(174, 381, 43, 43);
    		C.setBorder(null);
    		C.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(2);
    				calculateScore.getTotalPoints();
    				new PerQuestion3(calculateScore);
    				setVisible(false);
    			}
    		});
    		C.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerC.png")));
    		contentPane.add(C);
    		
    		JButton D = new JButton("");
    		D.setBorder(null);
    		D.setBounds(529, 251, 43, 43);
    		D.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(6);
    				calculateScore.getTotalPoints();
    				new PerQuestion3(calculateScore);
    				setVisible(false);
    			}
    		});
    		D.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerD.png")));
    		contentPane.add(D);
    		
    		JButton E = new JButton("");
    		E.setBorder(null);
    		E.setBounds(529, 317, 43, 43);
    		E.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(7);
    				calculateScore.getTotalPoints();
    				new PerQuestion3(calculateScore);
    				setVisible(false);
    			}
    		});
    		E.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerE.png")));
    		contentPane.add(E);
    		
    		JLabel lblBg = new JLabel("");
    		lblBg.setBounds(0, 0, 946, 540);
    		lblBg.setIcon(new ImageIcon(PerQuestion2.class.getResource("/quizgame/PerQuestion2.png")));
    		contentPane.add(lblBg);
    		


    	}
    }	 