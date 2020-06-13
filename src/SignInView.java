import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SignInView extends JFrame {
    private final JTextField textField = new JTextField(15);
    private final JPasswordField passwordField = new JPasswordField(15);
    private final JTextArea textArea = new JTextArea(6, 32);
    private final JButton jButton = new JButton("登录");
    private final static String newline = "\n";

    public SignInView() {
        setLayout(new BorderLayout());

        textArea.setEditable(false);
        textField.setToolTipText("接受文本输入");
        textField.setText("123456");
        passwordField.setToolTipText("接受密码输入");
        passwordField.setText("123456");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                String Username = textField.getText();
                if (Username.equals("123456") && password.equals("123456")){
                    dispose();
                    try {
                        new mainView();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    JOptionPane.showConfirmDialog(null, "账户或者密码错误", "请重试", JOptionPane.YES_NO_OPTION);
                }
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("用户输入的文本是" + textField.getText() + newline);
                textField.setText(null);
            }
        });

        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                String Username = textField.getText();

                if (Username.equals("123456") && password.equals("123456")){
                    dispose();
                    try {
                        new mainView();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }

//                textArea.append("用户输入的密码是:" + password + newline);
//                passwordField.setText(null);
            }
        });

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        northPanel.add(textField);
        northPanel.add(passwordField);
        add(northPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(new JScrollPane(textArea));
        centerPanel.add(new JScrollPane(jButton));
        add(centerPanel, BorderLayout.CENTER);

    }
}
