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

public class LoveResultD extends JFrame {
    private JPanel contentPane;
    private PointDistribution pointDistribution;

//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    PointDistribution pointDistribution = new PointDistribution();
//                    LoveResultD frame = new LoveResultD(pointDistribution);
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

    public LoveResultD(PointDistribution pointDistribution) {
        this.pointDistribution = pointDistribution;
        setTitle("Psychology Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 982, 540);
        setLocationRelativeTo(null);
        setVisible(true);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnYes = new JButton();
        btnYes.setBounds(324, 444, 117, 49);
        btnYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	pointDistribution.resetPoints();
                new Menu();
				setVisible(false);
            }
        });
        btnYes.setBorder(null);
        btnYes.setIcon(new ImageIcon("D:\\JavaFinalProject\\JavaFinalProject\\src\\quizgame\\TryagainYes.png"));
        contentPane.add(btnYes);

        JButton btnNo = new JButton();
        btnNo.setBounds(519, 444, 117, 49);
        btnNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNo.setBorder(null);
        btnNo.setIcon(new ImageIcon("D:\\JavaFinalProject\\JavaFinalProject\\src\\quizgame\\TryagainNo.png"));
        contentPane.add(btnNo);

        JLabel lblResult = new JLabel("");
        lblResult.setBounds(842, -14, 89, 81);
        lblResult.setHorizontalAlignment(SwingConstants.TRAILING);
        lblResult.setFont(new Font("OCR A Extended", Font.BOLD, 36));
        contentPane.add(lblResult);

        // Create an instance of ScoreCalculator or PointDistribution
        // Call getTotalPoints() and format the result
        DecimalFormat frmNumber = new DecimalFormat("#,###");
        String totalPoints = frmNumber.format(pointDistribution.getTotalPoints());

        // Set the result as the text of the lblResult label
        lblResult.setText(totalPoints);

        JLabel lblBg = new JLabel();
        lblBg.setBounds(0, 0, 958, 503);
        lblBg.setIcon(new ImageIcon("D:\\JavaFinalProject\\JavaFinalProject\\src\\quizgame\\ResultD.png"));
        contentPane.add(lblBg);
    }
}