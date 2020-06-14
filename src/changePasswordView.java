import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class changePasswordView extends JFrame {
    private final JTextField UserNameField = new JTextField(15);
    private final JPasswordField OldPasswordField = new JPasswordField(15);
    private final JPasswordField NewPasswordField = new JPasswordField(15);
    private final JButton jButton = new JButton("修改");
    private final static String newline = "\n";

    public changePasswordView() {

        this.setVisible(true);
        this.setSize(600,200);
        setLayout(new BorderLayout());

        UserNameField.setToolTipText("接受用户名输入");
        UserNameField.setText("123456");
        OldPasswordField.setToolTipText("接受旧密码输入");
        OldPasswordField.setText("123456");
        NewPasswordField.setToolTipText("输入新密码");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String OldPassword = new String(OldPasswordField.getPassword());
                String Username = UserNameField.getText();
                String NewPassword = new String(NewPasswordField.getPassword());
                UserAggregate tempUser = new UserAggregate();
                try {
                    if (!tempUser.ChangePassword(Username,OldPassword,NewPassword)){
                        JOptionPane.showConfirmDialog(null, "出现异常请重试", "请重试", JOptionPane.OK_OPTION);
                    }else {
                        JOptionPane.showConfirmDialog(null, "密码修改成功", "success", JOptionPane.OK_OPTION);
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                ;
            }
        });

        OldPasswordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(OldPasswordField.getPassword());
                String Username = UserNameField.getText();

                UserAggregate tempUser = new UserAggregate();
                if (!tempUser.isHasRightUser(Username, password)) {
                    dispose();
                    try {
                        new mainView();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }

            }
        });

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        northPanel.add(UserNameField);
        northPanel.add(OldPasswordField);
        northPanel.add(NewPasswordField);
        add(northPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(new JScrollPane(jButton));
        add(centerPanel, BorderLayout.CENTER);

    }
}
