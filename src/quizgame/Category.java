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

		JButton btnAbbreviate = new JButton("");
		btnAbbreviate.setBounds(756, 53, 65, 53);
		btnAbbreviate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
			}
		});
		contentPane.setLayout(null);
		btnAbbreviate.setBorder(null);
		btnAbbreviate.setIcon(new ImageIcon("src/quizgame/___.png"));
		contentPane.add(btnAbbreviate);
	
		JButton btnQuit = new JButton("");
		btnQuit.setBounds(829, 53, 58, 53);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBorder(null);
		btnQuit.setIcon(new ImageIcon("src/quizgame/x.png"));
		contentPane.add(btnQuit);
		
		JButton btnPersonal = new JButton("");
		btnPersonal.setBounds(113, 323, 733, 64);
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new PerQuestion1();
			setVisible(false);
			}
		});
		btnPersonal.setBorder(null);
		btnPersonal.setIcon(new ImageIcon("src/quizgame/btnPerChoice.png"));
		contentPane.add(btnPersonal);
		
		JButton btnLove = new JButton("");
		btnLove.setBounds(134, 225, 687, 47);
		btnLove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoveQuestions1();
				setVisible(false);
			}
		});
		btnLove.setBorder(null);
		btnLove.setIcon(new ImageIcon("src/quizgame/btnLoveChoice.png"));
		contentPane.add(btnLove);
		
		JLabel lblBg = new JLabel("");
		lblBg.setBounds(0, 0, 946, 503);
		lblBg.setIcon(new ImageIcon("src/quizgame/Category.png"));
		contentPane.add(lblBg);
	}
}