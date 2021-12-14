import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

public class LoginButtonListener extends IOException implements ActionListener {


    private LoginWindows window = null;

    public LoginButtonListener(LoginWindows window) {
        this.window = window;
    }

    private void closeWindow() {
        window.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals(Const.OK)) {
            if (LoginWindows.nameTextField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "�̸��� ��� �ֽ��ϴ�.");
                LoginWindows.nameTextField.requestFocus();
            } else if (LoginWindows.pwdTextField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "��й�ȣ�� ��� �ֽ��ϴ�.");
                LoginWindows.pwdTextField.requestFocus();
            } else {
                try {
                    if (Database.getInstance().checkExistMember(LoginWindows.nameTextField.getText().toString(), LoginWindows.pwdTextField.getText().toString())) {
                        new MainFrame();
                        closeWindow();
                    } else {
                        JOptionPane.showMessageDialog(null, "�̸� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
                    }
                } catch (SQLException | IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getActionCommand().equals(Const.JOIN)) {
            MemberJoinDialog dialog = new MemberJoinDialog();
            dialog.show();
            System.out.println("join");
        } else if (e.getActionCommand().equals(Const.CANCEL)) {
            closeWindow();
            System.out.println("cancel");
        }

    }
}
