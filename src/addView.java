import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class addView extends JFrame {
    private final JTextField nameField = new JTextField(15);
    private final JTextField heightField = new JTextField(15);
    private final JTextField weightField = new JTextField(15);
    private final JTextField classNameField = new JTextField(15);
    private final JTextField phoneField = new JTextField(15);
    private final JTextField IDField = new JTextField(15);
    private final JTextField EnglishField = new JTextField(15);
    private final JTextField ChineseField = new JTextField(15);
    private final JTextField MathField = new JTextField(15);
    private final JTextField PhysicsField = new JTextField(15);
    private final JTextField chemicalField = new JTextField(15);
    private final JTextField BiologyField = new JTextField(15);
    private final JTextField HistoryField = new JTextField(15);
    private final JTextField ComputerField = new JTextField(15);
    private final JTextField SportsField = new JTextField(15);
    private final JTextField WorldField = new JTextField(15);

    private final JButton jButton = new JButton("提交修改");
    private final static String newline = "\n";

    public addView() {
        this.setTitle("添加学生信息");
        this.setSize(200,500);
        this.setVisible(true);
        setLayout(new BorderLayout());

        nameField.setToolTipText("名字");
        heightField.setToolTipText("身高");
        weightField.setToolTipText("体重");
        classNameField.setToolTipText("class name");
        phoneField.setToolTipText("phone");
        IDField.setToolTipText("ID");
        EnglishField.setToolTipText("English score");
        ChineseField.setToolTipText("chinese score");
        MathField.setToolTipText("math score");
        PhysicsField.setToolTipText("physics score");
        chemicalField.setToolTipText("chemical score");
        BiologyField.setToolTipText("Biology score");
        HistoryField.setToolTipText("history score");
        ComputerField.setToolTipText("computer score");
        SportsField.setToolTipText("Sports score");
        WorldField.setToolTipText("world score");


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(nameField);
        add(heightField);
        add(weightField);
        add(classNameField);
        add(phoneField);
        add(IDField);
        add(EnglishField);
        add(ChineseField);
        add(MathField);
        add(PhysicsField);
        add(chemicalField);
        add(BiologyField);
        add(HistoryField);
        add(ComputerField);
        add(SportsField);
        add(WorldField);
        add(jButton);

    }
}
