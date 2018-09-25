package SummerClassess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l_password = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        l_usename = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();
        b_clear = new javax.swing.JButton();
        b_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        l_password.setText("Password");
        jPanel1.add(l_password);
        l_password.setBounds(70, 160, 60, 30);
        jPanel1.add(t_username);
        t_username.setBounds(170, 110, 150, 30);

        l_usename.setText("User Name");
        jPanel1.add(l_usename);
        l_usename.setBounds(70, 110, 90, 30);

        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(t_password);
        t_password.setBounds(170, 160, 150, 30);

        b_clear.setText("Clear");
        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearActionPerformed(evt);
            }
        });
        jPanel1.add(b_clear);
        b_clear.setBounds(250, 230, 70, 30);

        b_login.setText("Login");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
                String user_name = t_username.getText();
                String password = t_password.getText();

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_register", "root", "");

                    String query = "select * from registration where user_name=? and password =?";
                    PreparedStatement statement = connection.prepareStatement(query);
                    statement.setString(1, user_name);
                    statement.setString(2, password);

                    ResultSet set = statement.executeQuery();

                    if (set.next()) {

                        if (user_name.equals("") || password.equals("")) {
                            JOptionPane.showMessageDialog(null, "can not accept blank input");
                        } else {
                           Popup ObjPopup = new Popup();
                            dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password");
                    }
                  connection.close();
                } catch (ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null, " "+e);
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, " "+e1);
                }

            }
        }
        );
        jPanel1.add(b_login);

        b_login.setBounds(
                160, 230, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane()
                .setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void b_clearActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public javax.swing.JButton b_clear;
    public javax.swing.JButton b_login;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel l_password;
    public javax.swing.JLabel l_usename;
    public javax.swing.JPasswordField t_password;
    public javax.swing.JTextField t_username;

}
