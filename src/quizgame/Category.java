package quizgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Category extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Category frame = new Category();
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
	public Category() {
		setTitle("Psychology Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setVisible(true);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAbbreviate = new JButton();
		btnAbbreviate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				setVisible(false);
			}
		});
		btnAbbreviate.setBorder(null);
		btnAbbreviate.setIcon(new ImageIcon("D:\\JavaFinalProject\\JavaFinalProject\\src\\quizgame\\-.png"));
		btnAbbreviate.setBounds(756, 53, 65, 53);
		contentPane.add(btnAbbreviate);
	
		JButton btnQuit = new JButton();
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBorder(null);
		btnQuit.setIcon(new ImageIcon("D:\\JavaFinalProject\\JavaFinalProject\\src\\quizgame\\x.png"));
		btnQuit.setBounds(829, 53, 58, 53);
		contentPane.add(btnQuit);
		
		JButton btnPersional = new JButton();
		btnPersional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new PerQuestion1();
			setVisible(false);
			}
		});
		btnPersional.setBorder(null);
		btnPersional.setIcon(new ImageIcon(Category.class.getResource("/quizgame/p.png")));
		btnPersional.setBounds(134, 318, 716, 53);
		contentPane.add(btnPersional);
		
		JButton btnLove = new JButton();
		btnLove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoveQuestions1();
				setVisible(false);
			}
		});
		btnLove.setBorder(null);
		btnLove.setIcon(new ImageIcon(Category.class.getResource("/quizgame/Love.png")));
		btnLove.setBounds(134, 229, 687, 47);
		contentPane.add(btnLove);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(Category.class.getResource("/quizgame/Category.png")));
		lblBg.setBounds(0, 0, 946, 503);
		contentPane.add(lblBg);
		
		
	}

}
