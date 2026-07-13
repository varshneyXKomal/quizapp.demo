
package quizz_app.quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(30, 50, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();
        // HIGHLIGHT: Increased height to 380 and shifted Y up to 90 to give text more
        // breathing room
        rules.setBounds(40, 90, 720, 380);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));

        // HIGHLIGHT: Changed "<br><br>" to "<br>" so all 8 rules fit perfectly inside
        // the window
        rules.setText(
                "<html>" +
                        "1. You are trained to be a programmer and not a story teller, answer point to point." + "<br>"
                        +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer."
                        + "<br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory." + "<br>" +
                        "4. Crying is allowed but please do so quietly." + "<br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)." + "<br>" +
                        "6. Do not get nervous if your friend is answering more questions, maybe he/she is doing Jai Mata Di."
                        + "<br>" +
                        "7. Brace yourself, this paper is not for the faint hearted." + "<br>" +
                        "8. May you know more than what Jon Snow knows. Good Luck!" + "<br>" +
                        "</html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}