import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class mainView extends JFrame {
    //    private final JTextField textField = new JTextField(35);
//    private final JPasswordField passwordField = new JPasswordField(15);
    private final JTextArea textArea = new JTextArea(30, 50);
    private final static String newline = "\n";


    public mainView() throws IOException {
        this.setSize(700,700);
        this.setVisible(true);
        class_ tempClass = new class_(String::charAt);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu1 = new JMenu("查看");
        JMenu menu2 = new JMenu("修改密码");
        JMenu menu4 = new JMenu("修改信息");
        JMenu menu3 = new JMenu("杂谈");
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu4);
        menuBar.add(menu3);
        JMenuItem item1 = new JMenuItem("查看随机五名学生");
        JMenuItem item2 = new JMenuItem("不想署名的作者：Hexagram");
        JMenuItem item3 = new JMenuItem("代码写的极其随意.jpg");
        JMenuItem item4 = new JMenuItem("但是能用");
        JMenuItem item5 = new JMenuItem("但是能用 嗯");
        JMenuItem item6 = new JMenuItem("swing这技术被淘汰不知道多少年了");
        menu1.add(item1);
        menu3.add(item2);
        menu3.add(item3);
        menu3.add(item4);
        menu3.add(item5);
        menu3.addSeparator();
        menu3.add(item6);

        JMenuItem item7 = new JMenuItem("添加学生信息");
        JMenuItem item8 = new JMenuItem("修改学生信息");
        JMenuItem item9 = new JMenuItem("删除学生信息");
        menu4.add(item7);
        menu4.add(item8);
        menu4.add(item9);

        item9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                new deleteView();
            }
        });

        item7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                new addView();
            }
        });

        item8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                new modifyView();
            }
        });

        menu2.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                new changePasswordView();
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });

        item1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                try {
                    new randomStudentView();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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
