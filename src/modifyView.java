import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Comparator;

public class modifyView extends JFrame {
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

    public modifyView(Student temp) {
        this.setTitle("修改学生信息");
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


        nameField.setText(temp.getName());
        heightField.setText(String.valueOf(temp.getHeight()));
        weightField.setText(String.valueOf(temp.getWeight()));
        classNameField.setText(temp.getClassName());
        phoneField.setText(temp.getPhone());
        IDField.setText(temp.getID());
        IDField.setEnabled(false);
        EnglishField.setText(String.valueOf(temp.getEnglish()));
        ChineseField.setText(String.valueOf(temp.getChinese()));
        MathField.setText(String.valueOf(temp.getMath()));
        PhysicsField.setText(String.valueOf(temp.getPhysics()));
        chemicalField.setText(String.valueOf(temp.getChemical()));
        BiologyField.setText(String.valueOf(temp.getBiology()));
        HistoryField.setText(String.valueOf(temp.getHistory()));
        ComputerField.setText(String.valueOf(temp.getComputer()));
        SportsField.setText(String.valueOf(temp.getSports()));
        WorldField.setText(String.valueOf(temp.getWorld()));

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student tempStu = new Student();

                tempStu.setName(nameField.getText());
                tempStu.setHeight(Double.parseDouble(heightField.getText()));
                tempStu.setWeight(Double.parseDouble(weightField.getText()));
                tempStu.setClassName(classNameField.getText());
                tempStu.setPhone(phoneField.getText());
                tempStu.setID(IDField.getText());
                tempStu.setEnglish(Double.parseDouble(EnglishField.getText()));
                tempStu.setChinese(Double.parseDouble(ChineseField.getText()));
                tempStu.setMath(Double.parseDouble(MathField.getText()));
                tempStu.setPhysics(Double.parseDouble(PhysicsField.getText()));
                tempStu.setChemical(Double.parseDouble(chemicalField.getText()));
                tempStu.setBiology(Double.parseDouble(BiologyField.getText()));
                tempStu.setHistory(Double.parseDouble(HistoryField.getText()));
                tempStu.setComputer(Double.parseDouble(ComputerField.getText()));
                tempStu.setSports(Double.parseDouble(SportsField.getText()));
                tempStu.setWorld(Double.parseDouble(WorldField.getText()));

                try {
                    class_ temp = new class_(String::charAt);
                    temp.changeOne(tempStu);
                    new mainView();
                    dispose();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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
