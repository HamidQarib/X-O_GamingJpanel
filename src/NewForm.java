import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

public class NewForm {
    JPanel panel1;
    private Player_1 player_1 = new Player_1();
    private Player_2 player_2 = new Player_2();
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JTextField textField1;
    private JTextField textField2;
    private JButton setButton;
    private JButton resetTableButton;
    private JTextArea textArea1;
    private JButton playAgainButton;
    private String change;
    private int u;
    private int w;
    private int n = 0;
    private String[] k = new String[3];
    private int score1;
    private int score2;


    private NewForm() {

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button3.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button3.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button5.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button5.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button9.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button9.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button8.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button8.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button1.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button1.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button7.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button7.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button6.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button6.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button4.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button4.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AvoidPlayingAgain();
                insert(u);
                if (button2.getText().equals("")) {
                    if (player_1.getName().equals("") || player_2.getName().equals("") || n == 2) {
                        return;
                    }
                    u++;
                    button2.setText(change);
                    SearchinForSameWord(w);
                    w++;
                }
            }
        });

        setButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField2.getText().equals("") && textField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(panel1, "choose your player's ", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                player_2.setName(textField2.getText());
                player_1.setName(textField1.getText());
                JOptionPane.showMessageDialog(panel1, player_1.getName() + "  it's your turn ", "Message",
                        JOptionPane.WARNING_MESSAGE);
                textArea1.setText(player_1.getName() + "  it's your turn");
            }
        });

        resetTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resetTableButton.getModel().isEnabled()) {
                    ButtonReset();
                    player_1.setName("");
                    player_2.setName("");
                    textField1.setText("");
                    textField2.setText("");
                    textArea1.setText("");
                    w = 0;
                    u = 0;
                    score1 = 0;
                    score2 = 0;
                    n = 0;
                }
            }
        });
        textArea1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (playAgainButton.getModel().isEnabled()) {
                    button1.setBackground(Color.YELLOW);
                    button2.setBackground(Color.YELLOW);
                    button3.setBackground(Color.YELLOW);
                    button4.setBackground(Color.YELLOW);
                    button5.setBackground(Color.YELLOW);
                    button6.setBackground(Color.YELLOW);
                    button7.setBackground(Color.YELLOW);
                    button8.setBackground(Color.YELLOW);
                    button9.setBackground(Color.YELLOW);
                    ButtonReset();
                    n = 0;
                }

            }
        });
    }
// ***********************************************00   Main   00******************************************************//

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("NewForm.java");
        jFrame.setContentPane(new NewForm().panel1);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
//********************************************   determinative X or O   **********************************************//

    private void insert(int y) {
        if (player_1.getName() == null && player_2.getName() == null) {
            JOptionPane.showMessageDialog(panel1, "choose your player's ", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        int i;
        for (i = y; i < 9; i++) {

            if (button1.getModel().isEnabled() || button2.getModel().isEnabled() || button3.getModel().isEnabled() || button4.getModel().isEnabled() || button5.getModel().isEnabled() || button6.getModel().isEnabled() || button7.getModel().isEnabled() || button8.getModel().isEnabled() || button9.getModel().isEnabled()) {
                if (i % 2 == 0) {
                    change = "x";
                    y = i;
                    if (n < 2) {
                        textArea1.setText(player_2.getName() + "  it's your turn");
                    }
                    return;
                } else {
                    textArea1.setText(player_1.getName() + "  it's your turn");
                    change = "o";
                    return;
                }
            }
        }
    }
    //************************************   searching for same words   **********************************************//

    private void SearchinForSameWord(int g) {
        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        int m = 0;
        for (int j = 0; j <= 2; j++) {

            //***************************************  searching in column  ******************************************//

            if (!buttons.get(j).getText().equals("") && !buttons.get(j + 3).getText().equals("") && !buttons.get(j + 6).getText().equals("")) {
                k = new String[3];
                k[0] = buttons.get(j).getText();
                k[1] = buttons.get(j + 3).getText();
                k[2] = buttons.get(j + 6).getText();
                CheckForWin();
                if (n == 2) {
                    buttons.get(j).setBackground(Color.red);
                    buttons.get(j + 3).setBackground(Color.red);
                    buttons.get(j + 6).setBackground(Color.red);
                    buttons.get(j).getText();
                    buttons.get(j + 3).getText();
                    buttons.get(j + 6).getText();
                    break;
                }
            }
            //***************************************  searching in row  *********************************************//

            if (j == 1) {
                m = 3;
            } else if (j == 2) {
                m = 6;
            }
            if (!buttons.get(m).getText().equals("") && !buttons.get(m + 1).getText().equals("") && !buttons.get(m + 2).getText().equals("")) {
                k = new String[3];
                k[0] = buttons.get(m).getText();
                k[1] = buttons.get(m + 1).getText();
                k[2] = buttons.get(m + 2).getText();
                CheckForWin();
                if (n == 2) {
                    buttons.get(m).setBackground(Color.red);
                    buttons.get(m + 1).setBackground(Color.red);
                    buttons.get(m + 2).setBackground(Color.red);
                    buttons.get(m).getText();
                    buttons.get(m + 1).getText();
                    buttons.get(m + 2).getText();
                    break;
                }
            }
            //***************************************  searching in diameter  ****************************************//

            m = 0;
            if (j == 1) {
                m = -2;
            }
            if (!buttons.get((m * (-1))).getText().equals("") && !buttons.get(4).getText().equals("") && !buttons.get(m + 8).getText().equals("")) {
                k = new String[3];
                k[0] = buttons.get((m * (-1))).getText();
                k[1] = buttons.get(4).getText();
                k[2] = buttons.get(m + 8).getText();
                CheckForWin();
                if (n == 2) {
                    buttons.get((m * (-1))).setBackground(Color.red);
                    buttons.get(4).setBackground(Color.red);
                    buttons.get(m + 8).setBackground(Color.red);
                    buttons.get((m * (-1))).getText();
                    buttons.get(4).getText();
                    buttons.get(m + 8).getText();
                    break;
                }
            }
            //************************************   when no one succeeded   *****************************************//

            if (!button1.getText().equals("") && !button2.getText().equals("") && !button3.getText().equals("") && !button4.getText().equals("") && !button5.getText().equals("") && !button6.getText().equals("") && !button7.getText().equals("") && !button8.getText().equals("") && !button9.getText().equals("")) {
                JOptionPane.showMessageDialog(panel1, "No one succeeded :( ", "Message",
                        JOptionPane.WARNING_MESSAGE);
                textArea1.setText("  :(  ");
                ButtonReset();
                u = 0;
                break;
            }
        }

    }
    //*******************************************   checking for win   **********************************************//

    private void CheckForWin() {

        String check;
        for (int r = 0; r < k.length; r++) {
            if (k[r].equals(k[r + 1]) && n < 2) {
                n++;
                check = k[r];
                if (n == 2) {
                    if (check.equalsIgnoreCase("x")) {
                        JOptionPane.showMessageDialog(panel1, player_1.getName() + "  is winner", "Message",
                                JOptionPane.WARNING_MESSAGE);
                        player_1.setScore(score1 += 100);
                        textArea1.setText(player_1.getName() + "  won  " + "\n" + player_1.getName() + "'s Score is :" + player_1.getScore());
                    } else {
                        JOptionPane.showMessageDialog(panel1, player_2.getName() + "  is winner", "Message",
                                JOptionPane.WARNING_MESSAGE);
                        player_2.setScore(score2 += 100);
                        textArea1.setText(player_2.getName() + "  won  " + "\n" + player_2.getName() + "'s Score is :" + player_2.getScore());
                    }
                    u = 0;
                    break;
                }
            } else {
                n = 0;
                return;
            }
        }
    }
    //*******************************************   reset buttons method  ****************************************//

    private void ButtonReset() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }

    private void AvoidPlayingAgain() {
        if (n == 2) {
            JOptionPane.showMessageDialog(panel1, " Please press the green button for play again :)", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public Boolean finded(int x){
        if(x ==0){
         return true;
        }else if(false){
            return false;
        }
        return true;
    }
}