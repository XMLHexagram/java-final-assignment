import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainView extends JFrame {
    //    private final JTextField textField = new JTextField(35);
//    private final JPasswordField passwordField = new JPasswordField(15);
    private final JTextArea textArea = new JTextArea(30, 50);
    private final static String newline = "\n";


    public mainView() {
        this.setSize(700,700);
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
        JMenuItem item1 = new JMenuItem("查看随机五名学生");
        JMenuItem item2 = new JMenuItem("不想署名的作者：Hexagram");
        JMenuItem item3 = new JMenuItem("代码写的极其随意.jpg");
        JMenuItem item4 = new JMenuItem("但是能用");
        JMenuItem item5 = new JMenuItem("但是能用 嗯");
        JMenuItem item6 = new JMenuItem("swing这技术被淘汰不知道多少年了");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.add(item5);
        menu1.addSeparator();
        menu1.add(item6);

        item1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new randomStudentView();
            }
        });
//        tempClass.output();
        this.setTitle("主菜单:正在查看所有学生信息");
        setLayout(new BorderLayout());
//        textArea.setSize(100, 100);
        textArea.setEditable(false);

        textArea.append(tempClass.output());
        System.out.println(tempClass.output());


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(new JScrollPane(textArea));
        add(centerPanel, BorderLayout.CENTER);
    }
}