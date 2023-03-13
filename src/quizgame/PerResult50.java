package quizgame;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Canvas;
import javax.swing.SwingConstants;

public class PerResult50 extends JFrame {
	private JPanel contentPane;
    private CalculateScore calculateScore;
  /*  public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	CalculateScore calculateScore = new CalculateScore();
                    PerResult50 frame = new PerResult50(calculateScore);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    public PerResult50(CalculateScore calculateScore) {
        this.calculateScore = calculateScore;
        setTitle("Psychology Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 582);
        setLocationRelativeTo(null);
        setVisible(true);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnYes = new JButton();
        btnYes.setBounds(319, 472, 117, 49);
        btnYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	calculateScore.resetPoints();
                new Menu();
				setVisible(false);
            }
        });
        btnYes.setBorder(null);
        btnYes.setIcon(new ImageIcon(PerResult50.class.getResource("/quizgame/TryagainPerYes.png")));
        contentPane.add(btnYes);

        JButton btnNo = new JButton();
        btnNo.setBounds(517, 472, 117, 49);
        btnNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
				setVisible(false);
            }
        });
        btnNo.setBorder(null);
        btnNo.setIcon(new ImageIcon(PerResult50.class.getResource("/quizgame/TryagainPerNo.png")));
        contentPane.add(btnNo);

        JLabel lblResult = new JLabel("");
        lblResult.setBounds(836, 0, 89, 81);
        lblResult.setHorizontalAlignment(SwingConstants.TRAILING);
        lblResult.setFont(new Font("OCR A Extended", Font.BOLD, 36));
        contentPane.add(lblResult);

        // Create an instance of ScoreCalculator or PointDistribution
        // Call getTotalPoints() and format the result
        DecimalFormat frmNumber = new DecimalFormat("#,###");
        String totalPoints = frmNumber.format(calculateScore.getTotalPoints());

        // Set the result as the text of the lblResult label
        lblResult.setText(totalPoints);

        JLabel lblBg = new JLabel();
        lblBg.setBounds(0, -11, 946, 556);
        lblBg.setIcon(new ImageIcon(PerResult50.class.getResource("/quizgame/PerResult50.png")));
        contentPane.add(lblBg);
    }
}