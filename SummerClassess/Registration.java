package SummerClassess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame implements ActionListener {

    public Registration() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        set = new javax.swing.JPanel();
        l_middle = new javax.swing.JLabel();
        t_middle = new javax.swing.JTextField();
        l_last = new javax.swing.JLabel();
        t_last = new javax.swing.JTextField();
        t_first = new javax.swing.JTextField();
        l_name = new javax.swing.JLabel();
        l_first = new javax.swing.JLabel();
        l_username = new javax.swing.JLabel();
        l_repassword = new javax.swing.JLabel();
        t_email = new javax.swing.JTextField();
        t_username = new javax.swing.JTextField();
        l_email = new javax.swing.JLabel();
        t_repassword = new javax.swing.JPasswordField();
        l_password = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();
        l_phone = new javax.swing.JLabel();
        t_phone = new javax.swing.JTextField();
        b_register = new javax.swing.JButton();
        b_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        set.setLayout(null);

        l_middle.setText("Middle");
        set.add(l_middle);
        l_middle.setBounds(190, 50, 50, 30);

        t_middle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_middleActionPerformed(evt);
            }
        });
        set.add(t_middle);
        t_middle.setBounds(240, 50, 90, 30);

        l_last.setText("Last");
        set.add(l_last);
        l_last.setBounds(350, 50, 50, 30);

        t_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_lastActionPerformed(evt);
            }
        });
        set.add(t_last);
        t_last.setBounds(400, 50, 100, 30);

        t_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_firstActionPerformed(evt);

            }
        });
        set.add(t_first);
        t_first.setBounds(70, 50, 100, 30);

        l_name.setText("Name");
        set.add(l_name);
        l_name.setBounds(20, 24, 53, 20);

        l_first.setText("First");
        set.add(l_first);
        l_first.setBounds(20, 50, 50, 30);

        l_username.setText("User Name");
        set.add(l_username);
        l_username.setBounds(20, 100, 70, 30);

        l_repassword.setText("Re- Password");
        set.add(l_repassword);
        l_repassword.setBounds(260, 150, 80, 30);

        t_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_emailActionPerformed(evt);
            }
        });
        set.add(t_email);
        t_email.setBounds(100, 200, 100, 30);

        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        set.add(t_username);
        t_username.setBounds(100, 100, 100, 30);

        l_email.setText("Email");
        set.add(l_email);
        l_email.setBounds(20, 200, 53, 30);
        set.add(t_repassword);
        t_repassword.setBounds(360, 150, 100, 30);

        l_password.setText("Password");
        set.add(l_password);
        l_password.setBounds(20, 150, 70, 30);
        set.add(t_password);
        t_password.setBounds(100, 150, 100, 30);

        l_phone.setText("Phone");
        set.add(l_phone);
        l_phone.setBounds(260, 200, 80, 30);

        t_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_phoneActionPerformed(evt);

            }
        });
        set.add(t_phone);
        t_phone.setBounds(360, 200, 100, 30);

        b_register.setText("Register");
        set.add(b_register);
        b_register.setBounds(120, 290, 110, 40);

        b_clear.setText("Clear");
        set.add(b_clear);
        b_clear.setBounds(300, 290, 100, 40);

        b_register.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                String first_name = t_first.getText();
                String middle_name = t_middle.getText();
                String last_name = t_last.getText();
                String user_name = t_username.getText();
                String password = t_password.getText();
                String re_password = t_repassword.getText();
                String email = t_email.getText();
                String phone = t_phone.getText();
                
                String code = (String) UUID.randomUUID().toString().substring(0,8);
                String Id = code;

                Pattern patt = Pattern.compile("[0-9,%@!()*~^!#$%&+/-]");
                Matcher n1 = patt.matcher(first_name);
                Matcher n2 = patt.matcher(middle_name);
                Matcher n3 = patt.matcher(last_name);

                Pattern pattern = Pattern.compile("(\\d-)?(\\d{10})");
                Matcher ph = pattern.matcher(phone);
                boolean b = ph.matches();

                Pattern patn = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                Matcher em = patn.matcher(email);
                boolean b2 = em.matches();

                if (first_name.equals("") || last_name.equals("") || user_name.equals("")
                        || password.equals("") || re_password.equals("") || email.equals("") || phone.equals("")) {
                    JOptionPane.showMessageDialog(null, "can not accept blank input");
                } else if (n1.find() || n2.find() || n3.find()) {
                    JOptionPane.showMessageDialog(null, "Name only content characters");
                } else if (!(new String(password)).equals(new String(re_password))) {
                    JOptionPane.showMessageDialog(null, "Password and re password must be same");
                } else if ((email.length() < 10) || (b2 == false)) {
                    JOptionPane.showMessageDialog(null, "Unauthorized Email");
                } else if ((phone.length() != 10) || (b == false) || (phone.equals("0000000000"))) {
                    JOptionPane.showMessageDialog(null, "Invalid Phone Number");
                } else {

                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_register", "root", "");

                        String query = "insert into registration values(?,?,?,?,?,?,?,?,?)";
                        PreparedStatement statement = connection.prepareStatement(query);
                        statement.setString(1, Id);
                        statement.setString(2, first_name);
                        statement.setString(3, middle_name);
                        statement.setString(4, last_name);
                        statement.setString(5, user_name);
                        statement.setString(6, password);
                        statement.setString(7, re_password);
                        statement.setString(8, email);
                        statement.setString(9, phone);

                        statement.execute();

                        LoginPage loginpageObj = new LoginPage();
                        dispose();
                        connection.close();
                    } catch (ClassNotFoundException e) {
                        JOptionPane.showMessageDialog(null, " "+e);
                    } catch (SQLException e1) {
                       JOptionPane.showMessageDialog(null, " "+e1);
                    }

                }

                
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void t_middleActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_lastActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_firstActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_emailActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_phoneActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public javax.swing.JButton b_clear;
    public javax.swing.JButton b_register;
    public javax.swing.JLabel l_email;
    public javax.swing.JLabel l_first;
    public javax.swing.JLabel l_last;
    public javax.swing.JLabel l_middle;
    public javax.swing.JLabel l_name;
    public javax.swing.JLabel l_password;
    public javax.swing.JLabel l_phone;
    public javax.swing.JLabel l_repassword;
    public javax.swing.JLabel l_username;
    public javax.swing.JPanel set;
    private javax.swing.JTextField t_email;
    private javax.swing.JTextField t_first;
    private javax.swing.JTextField t_last;
    private javax.swing.JTextField t_middle;
    public javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_phone;
    public javax.swing.JPasswordField t_repassword;
    private javax.swing.JTextField t_username;

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
