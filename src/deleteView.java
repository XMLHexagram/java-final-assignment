import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

            }
        });


        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(IDField);
        add(jButton);

    }
}
