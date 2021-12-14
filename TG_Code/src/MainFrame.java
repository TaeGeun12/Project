import javax.swing.*;
import java.awt.event.ActionEvent;
//import java.io.Serial;

public class MainFrame extends JFrame {

    //@Serial
    private static final long serialVersionUID = 1L;

    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu personMenu = new JMenu("�����");
        JMenuItem loginMenuItem = new JMenuItem("�α���...");
        JMenuItem logoutMenuItem = new JMenuItem("�α׾ƿ�...");
        personMenu.add(loginMenuItem);
        personMenu.add(logoutMenuItem);

        JMenu memberMenu = new JMenu("����");
        JMenuItem membersMenuItem = new JMenuItem("���...");
        memberMenu.add(membersMenuItem);

        JMenu bookMenu = new JMenu("����");
        JMenuItem bookAddMenuItem = new JMenuItem("�߰�...");
        JMenuItem bookMenuItem = new JMenuItem("���...");
        JMenuItem bookSearchItem = new JMenuItem("�˻�...");
        bookMenu.add(bookAddMenuItem);
        bookMenu.add(bookMenuItem);
        bookMenu.add(bookSearchItem);


        mb.add(personMenu);
        mb.add(memberMenu);
        mb.add(bookMenu);

        MenuActionListener menuListener = new MenuActionListener(this);
        membersMenuItem.addActionListener(menuListener);
        loginMenuItem.addActionListener(menuListener);
        logoutMenuItem.addActionListener(menuListener);
        bookAddMenuItem.addActionListener(menuListener);
        bookMenuItem.addActionListener(menuListener);
        bookSearchItem.addActionListener(menuListener);
        setJMenuBar(mb);
    }

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GUI Test");
        createMenu();
        setSize(800, 500);
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
