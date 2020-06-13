import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class randomStudentView extends JFrame {
    //    private final JTextField textField = new JTextField(35);
//    private final JPasswordField passwordField = new JPasswordField(15);
    private final JTextArea textArea = new JTextArea(20, 50);
    private final static String newline = "\n";


    public randomStudentView() {
        this.setSize(500,500);
        this.setVisible(true);
        class_ tempClass = new class_();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu1 = new JMenu("查看");
//        JMenu menu2 = new JMenu("编辑");
//        JMenu menu3 = new JMenu("视图");
        menuBar.add(menu1);
//        menuBar.add(menu2);
//        menuBar.add(menu3);
        JMenuItem item1 = new JMenuItem("查看所有学生");
        JMenuItem item2 = new JMenuItem("不想署名的作者：Hexagram");
        JMenuItem item3 = new JMenuItem("代码写的极其随意.jpg");
        JMenuItem item4 = new JMenuItem("但是能用");
        JMenuItem item5 = new JMenuItem("但是能用 嗯");
        JMenuItem item6 = new JMenuItem("swing这技术被淘汰不知道多少年了");
        JMenuItem item7 = new JMenuItem("我好像又说了一遍？？？");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.add(item5);
        menu1.addSeparator();
        menu1.add(item6);
        menu1.add(item7);

        item1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new mainView();
            }
        });

//        tempClass.output();
        this.setTitle("副窗口:正在查看随机学生的信息");
        setLayout(new BorderLayout());
//        textArea.setSize(100, 100);
        textArea.setEditable(false);
//        textArea.append(tempClass.randomGetFive());
        textArea.append(tempClass.randomGetFive());
//        System.out.println(tempClass.output());


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(new JScrollPane(textArea));
        add(centerPanel, BorderLayout.CENTER);
    }
}
