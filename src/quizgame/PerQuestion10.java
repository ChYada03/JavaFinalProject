package quizgame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerQuestion10 extends JFrame {

	private JPanel contentPane;
    private CalculateScore calculateScore;

    public PerQuestion10(CalculateScore calculateScore) {
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
    		btnQuit.setIcon(new ImageIcon(PerQuestion9.class.getResource("/quizgame/PerQuit.png")));
    		contentPane.add(btnQuit);

    		JButton A = new JButton("");
    		A.setBounds(149, 242, 43, 43);
    		A.setBorder(null);
    		A.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent arg0) {
    				calculateScore.addPoints(4);
    				calculateScore.getTotalPoints();
    				if (calculateScore.getTotalPoints() >= 61 && calculateScore.getTotalPoints() <= 80) {
    					new PerResult60(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 51 && calculateScore.getTotalPoints() <= 60) {
    					new PerResult50(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 41 && calculateScore.getTotalPoints() <= 50) {
    					new PerResult40(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 31 && calculateScore.getTotalPoints() <= 40) {
    					new PerResult30(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 21 && calculateScore.getTotalPoints() <= 30) {
    					new PerResult20(calculateScore);    					
    				}else if(calculateScore.getTotalPoints() <= 20) {
    					new PerResult10(calculateScore);
    				}
    				setVisible(false);
    				
    			}
    		});
    		A.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerA.png")));
    		contentPane.add(A);


    		JButton B = new JButton("");
    		B.setBounds(149, 308, 43, 43);
    		B.setBorder(null);
    		B.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(2);
    				calculateScore.getTotalPoints();
    				if (calculateScore.getTotalPoints() >= 61 && calculateScore.getTotalPoints() <= 80) {
    					new PerResult60(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 51 && calculateScore.getTotalPoints() <= 60) {
    					new PerResult50(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 41 && calculateScore.getTotalPoints() <= 50) {
    					new PerResult40(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 31 && calculateScore.getTotalPoints() <= 40) {
    					new PerResult30(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 21 && calculateScore.getTotalPoints() <= 30) {
    					new PerResult20(calculateScore);    					
    				}else if(calculateScore.getTotalPoints() <= 20) {
    					new PerResult10(calculateScore);
    				}
    				setVisible(false);
    			}
    		});
    		B.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerB.png")));
    		contentPane.add(B);
    		
    		JButton C = new JButton("");
    		C.setBounds(149, 373, 43, 43);
    		C.setBorder(null);
    		C.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(3);
    				calculateScore.getTotalPoints();
    				if (calculateScore.getTotalPoints() >= 61 && calculateScore.getTotalPoints() <= 80) {
    					new PerResult60(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 51 && calculateScore.getTotalPoints() <= 60) {
    					new PerResult50(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 41 && calculateScore.getTotalPoints() <= 50) {
    					new PerResult40(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 31 && calculateScore.getTotalPoints() <= 40) {
    					new PerResult30(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 21 && calculateScore.getTotalPoints() <= 30) {
    					new PerResult20(calculateScore);    					
    				}else if(calculateScore.getTotalPoints() <= 20) {
    					new PerResult10(calculateScore);
    				}
    				setVisible(false);
    			}
    		});
    		C.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerC.png")));
    		contentPane.add(C);
    		
    		JButton D = new JButton("");
    		D.setBounds(525, 242, 43, 43);
    		D.setBorder(null);
    		D.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(5);
    				calculateScore.getTotalPoints();
    				if (calculateScore.getTotalPoints() >= 61 && calculateScore.getTotalPoints() <= 80) {
    					new PerResult60(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 51 && calculateScore.getTotalPoints() <= 60) {
    					new PerResult50(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 41 && calculateScore.getTotalPoints() <= 50) {
    					new PerResult40(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 31 && calculateScore.getTotalPoints() <= 40) {
    					new PerResult30(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 21 && calculateScore.getTotalPoints() <= 30) {
    					new PerResult20(calculateScore);    					
    				}else if(calculateScore.getTotalPoints() <= 20) {
    					new PerResult10(calculateScore);
    				}
    				setVisible(false);
    			}
    		});
    		D.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerD.png")));
    		contentPane.add(D);

    		
    		JButton E = new JButton("");
    		E.setBounds(525, 308, 43, 43);
    		E.setBorder(null);
    		E.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(6);
    				calculateScore.getTotalPoints();
    				if (calculateScore.getTotalPoints() >= 61 && calculateScore.getTotalPoints() <= 80) {
    					new PerResult60(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 51 && calculateScore.getTotalPoints() <= 60) {
    					new PerResult50(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 41 && calculateScore.getTotalPoints() <= 50) {
    					new PerResult40(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 31 && calculateScore.getTotalPoints() <= 40) {
    					new PerResult30(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 21 && calculateScore.getTotalPoints() <= 30) {
    					new PerResult20(calculateScore);    					
    				}else if(calculateScore.getTotalPoints() <= 20) {
    					new PerResult10(calculateScore);
    				}
    				setVisible(false);
    			}
    		});
    		E.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerE.png")));
    		contentPane.add(E);
    		
    		JButton F = new JButton("");
    		F.setBounds(525, 373, 43, 43);
    		F.setBorder(null);
    		F.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				calculateScore.addPoints(1);
    				calculateScore.getTotalPoints();
    				if (calculateScore.getTotalPoints() >= 61 && calculateScore.getTotalPoints() <= 80) {
    					new PerResult60(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 51 && calculateScore.getTotalPoints() <= 60) {
    					new PerResult50(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 41 && calculateScore.getTotalPoints() <= 50) {
    					new PerResult40(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 31 && calculateScore.getTotalPoints() <= 40) {
    					new PerResult30(calculateScore);
    				}else if (calculateScore.getTotalPoints() >= 21 && calculateScore.getTotalPoints() <= 30) {
    					new PerResult20(calculateScore);    					
    				}else if(calculateScore.getTotalPoints() <= 20) {
    					new PerResult10(calculateScore);
    				}
    				setVisible(false);
    			}
    		});
    		F.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerF.png")));
    		contentPane.add(F);
    		
    		JLabel lblBg = new JLabel("");
    		lblBg.setBounds(0, 0, 946, 540);
    		lblBg.setIcon(new ImageIcon(PerQuestion10.class.getResource("/quizgame/PerQuestion10.png")));
    		contentPane.add(lblBg);
    		


    	}
    }	 