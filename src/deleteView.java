import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class deleteView extends JFrame {
    private final JTextField IDField = new JTextField(15);

    private final JButton jButton = new JButton("提交修改");
    private final static String newline = "\n";

    public deleteView() {
        this.setTitle("删除学生信息");
        this.setSize(200,200);
        this.setVisible(true);
        setLayout(new BorderLayout());

        IDField.setToolTipText("请输入ID");


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tempID = IDField.getText();
                try {
                    class_ temp = new class_(String::charAt);
                    if (!temp.deleteOne(tempID)){
                        JOptionPane.showConfirmDialog(null, "出现异常请重试", "请重试", JOptionPane.OK_OPTION);
                    }else {
                        JOptionPane.showConfirmDialog(null, "已经删除该学生信息", "success", JOptionPane.OK_OPTION);
                    }
                    new mainView();
                    dispose();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });


        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(IDField);
        add(jButton);

    }
}
