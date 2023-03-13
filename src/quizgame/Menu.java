package quizgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private static Menu frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Psychology Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setVisible(true);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Category();
				setVisible(false);
			}
		});
		btnStart.setBorder(null);
		btnStart.setIcon(new ImageIcon(Menu.class.getResource("/quizgame/btnStart.png")));
		btnStart.setBounds(367, 363, 209, 97);
		contentPane.add(btnStart);

		JButton btnQuit = new JButton("");
		btnQuit.setBorder(null);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnQuit.setIcon(new ImageIcon(Menu.class.getResource("/quizgame/lblquit.png")));
		btnQuit.setBounds(851, 10, 85, 62);
		contentPane.add(btnQuit);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(Menu.class.getResource("/quizgame/MainMenu.png")));
		lblBg.setBounds(0, 0, 946, 503);
		contentPane.add(lblBg);
		
		
	}
}