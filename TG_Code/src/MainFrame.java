import javax.swing.*;
import java.awt.event.ActionEvent;
//import java.io.Serial;

public class MainFrame extends JFrame {

    //@Serial
    private static final long serialVersionUID = 1L;

    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu personMenu = new JMenu("사용자");
        JMenuItem loginMenuItem = new JMenuItem("로그인...");
        JMenuItem logoutMenuItem = new JMenuItem("로그아웃...");
        personMenu.add(loginMenuItem);
        personMenu.add(logoutMenuItem);

        JMenu memberMenu = new JMenu("계정");
        JMenuItem membersMenuItem = new JMenuItem("목록...");
        memberMenu.add(membersMenuItem);

        JMenu bookMenu = new JMenu("도서");
        JMenuItem bookAddMenuItem = new JMenuItem("추가...");
        JMenuItem bookMenuItem = new JMenuItem("목록...");
        JMenuItem bookSearchItem = new JMenuItem("검색...");
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
