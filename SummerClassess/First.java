package SummerClassess;

import javax.swing.JFrame;

public class First extends javax.swing.JFrame {

    public First() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        b_login = new javax.swing.JButton();
        b_signup = new javax.swing.JButton();
        l_dialog = new javax.swing.JLabel();
        quote1 = new javax.swing.JLabel();
        quote2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logo.setIcon(new javax.swing.ImageIcon("D:\\Images\\Bus\\logo.PNG")); // NOI18N

        title.setBackground(java.awt.Color.magenta);
        title.setFont(new java.awt.Font("Harlow Solid Italic", 2, 45)); // NOI18N
        title.setForeground(new java.awt.Color(153, 0, 0));
        title.setText("Virtual Brothers Bus Ticketing");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 830, 160);

        b_login.setBackground(new java.awt.Color(153, 255, 255));
        b_login.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        b_login.setForeground(new java.awt.Color(255, 51, 0));
        b_login.setText("Login");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
                
                LoginPage loginpageObj = new LoginPage();
                dispose();
            }
        });
        jPanel1.add(b_login);
        b_login.setBounds(470, 430, 100, 40);

        b_signup.setBackground(new java.awt.Color(102, 255, 255));
        b_signup.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        b_signup.setForeground(new java.awt.Color(255, 102, 102));
        b_signup.setText("Sign Up");
        b_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_signupActionPerformed(evt);
                b_signup.setText("Sign Up");
                Registration registrationObj = new Registration();
                dispose();
            }
        });
        jPanel1.add(b_signup);
        b_signup.setBounds(290, 430, 110, 40);

        l_dialog.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        l_dialog.setForeground(new java.awt.Color(102, 0, 102));
        l_dialog.setText("Does not have account yet . Sign up now...It is free");
        jPanel1.add(l_dialog);
        l_dialog.setBounds(130, 470, 600, 50);

        quote1.setIcon(new javax.swing.ImageIcon("D:\\Images\\Bus\\udeshya-k-linu.jpg")); // NOI18N
        jPanel1.add(quote1);
        quote1.setBounds(-30, 160, 470, 310);

        quote2.setIcon(new javax.swing.ImageIcon("D:\\Images\\Bus\\3b0be855f54f6e252ba7863d743ccf02--bus-driver-gifts-school-bus-driver.jpg")); // NOI18N
        jPanel1.add(quote2);
        quote2.setBounds(440, 160, 390, 310);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void b_signupActionPerformed(java.awt.event.ActionEvent evt) {

    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
            }
        });
    }
                     
    public javax.swing.JButton b_login;
    public javax.swing.JButton b_signup;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel l_dialog;
    public javax.swing.JLabel logo;
    public javax.swing.JLabel quote1;
    public javax.swing.JLabel quote2;
    public javax.swing.JLabel title;
                       
}
