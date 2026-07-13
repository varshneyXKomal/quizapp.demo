
package quizz_app.quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Image Loading
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        // Heading Label (Fixed spacing here)
        JLabel heading = new JLabel("THANK YOU " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        // Score Label
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        // Submit Button (Fixed setEnabled here)
        JButton submit = new JButton("Play Again");
        submit.setBounds(350, 270, 160, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        submit.setBackground(new Color(30, 144, 255)); // Fixed color boundary if needed
        submit.setForeground(Color.WHITE);
        submit.setEnabled(true); // Changed to true so users can click it
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(); // Make sure your Login class exists in the same package!
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}