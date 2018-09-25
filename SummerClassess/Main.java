package SummerClassess;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JRadioButton;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void initComponents() {

        t_first4 = new javax.swing.JTextField();
        l_first5 = new javax.swing.JLabel();
        l_name2 = new javax.swing.JLabel();
        t_middle1 = new javax.swing.JTextField();
        t_last1 = new javax.swing.JTextField();
        l_middle1 = new javax.swing.JLabel();
        l_last1 = new javax.swing.JLabel();
        l_ticketdetail = new javax.swing.JLabel();
        l_middle = new javax.swing.JLabel();
        t_middle = new javax.swing.JTextField();
        l_last = new javax.swing.JLabel();
        t_last = new javax.swing.JTextField();
        l_sex = new javax.swing.JLabel();
        t_phone = new javax.swing.JTextField();
        l_time = new javax.swing.JLabel();
        b_day = new javax.swing.JComboBox<>();
        l_phone = new javax.swing.JLabel();
        r_female = new javax.swing.JRadioButton();
        r_confirm = new javax.swing.JRadioButton();
        l_age = new javax.swing.JLabel();
        t_first = new javax.swing.JTextField();
        l_contact = new javax.swing.JLabel();
        t_email = new javax.swing.JTextField();
        l_email = new javax.swing.JLabel();
        p_contact = new javax.swing.JTextField();
        t_contact = new javax.swing.JTextPane();
        l_name = new javax.swing.JLabel();
        l_first = new javax.swing.JLabel();
        b_age = new javax.swing.JComboBox<>();
        b_to = new javax.swing.JComboBox<>();
        b_ampm = new javax.swing.JComboBox<>();
        l_to = new javax.swing.JLabel();
        b_month = new javax.swing.JComboBox<>();
        b_hour = new javax.swing.JComboBox<>();
        l_date = new javax.swing.JLabel();
        b_year = new javax.swing.JComboBox<>();
        l_seaatno = new javax.swing.JLabel();
        b_from = new javax.swing.JComboBox<>();
        l_from = new javax.swing.JLabel();
        b_seatno = new javax.swing.JComboBox<>();
        b_side = new javax.swing.JComboBox<>();
        r_male = new javax.swing.JRadioButton();
        r_reserve = new javax.swing.JRadioButton();
        b_submit = new javax.swing.JButton();
        b_clear = new javax.swing.JButton();
        Seat = new javax.swing.JPanel();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        AB = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        Dateandtime = new javax.swing.JPanel();

        t_first4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_first4ActionPerformed(evt);
            }
        });

        l_first5.setText("First");

        l_name2.setText("Name");

        t_middle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_middle1ActionPerformed(evt);
            }
        });

        t_last1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_last1ActionPerformed(evt);
            }
        });

        l_middle1.setText("Middle");

        l_last1.setText("Last");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l_ticketdetail.setText("Ticket Detail");
        getContentPane().add(l_ticketdetail);
        l_ticketdetail.setBounds(20, 260, 80, 30);

        l_middle.setText("Middle");
        getContentPane().add(l_middle);
        l_middle.setBounds(200, 40, 40, 30);

        t_middle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_middleActionPerformed(evt);
            }
        });
        getContentPane().add(t_middle);
        t_middle.setBounds(260, 40, 100, 30);

        l_last.setText("Last");
        getContentPane().add(l_last);
        l_last.setBounds(380, 40, 30, 30);

        t_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_lastActionPerformed(evt);
            }
        });
        getContentPane().add(t_last);
        t_last.setBounds(410, 40, 110, 30);

        l_sex.setText("Sex");
        getContentPane().add(l_sex);
        l_sex.setBounds(200, 90, 30, 30);

        t_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_phoneActionPerformed(evt);
            }
        });
        getContentPane().add(t_phone);
        t_phone.setBounds(280, 140, 100, 30);

        l_time.setText("Time");
        getContentPane().add(l_time);
        l_time.setBounds(270, 300, 40, 30);

        b_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06",
            "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "29", "20", "21", "22", "23",
            "24", "25", "26", "27", "28", "29", "30", "31"}));
        getContentPane().add(b_day);
        b_day.setBounds(190, 300, 50, 30);

        l_phone.setText("Phone no.");
        getContentPane().add(l_phone);
        l_phone.setBounds(220, 140, 60, 30);

        r_female.setText("Female");
        getContentPane().add(r_female);
        r_female.setBounds(320, 90, 90, 30);

        ButtonGroup b2 = new ButtonGroup();
        b2.add(r_male);
        b2.add(r_female);

        r_confirm.setText("Confirm");
        r_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_confirmActionPerformed(evt);
            }
        });
        getContentPane().add(r_confirm);
        r_confirm.setBounds(360, 400, 80, 30);

        l_age.setText("Age");
        getContentPane().add(l_age);
        l_age.setBounds(20, 90, 40, 30);

        t_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_firstActionPerformed(evt);
            }
        });
        getContentPane().add(t_first);
        t_first.setBounds(60, 40, 120, 30);

        l_contact.setText("Contact Address");
        getContentPane().add(l_contact);
        l_contact.setBounds(20, 190, 100, 30);

        t_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_emailActionPerformed(evt);
            }
        });
        getContentPane().add(t_email);
        t_email.setBounds(70, 140, 140, 30);

        l_email.setText("Email");
        getContentPane().add(l_email);
        l_email.setBounds(20, 140, 50, 30);

//        p_contact.setViewportView(t_contact);
        getContentPane().add(p_contact);
        p_contact.setBounds(130, 190, 190, 30);

        l_name.setText("Name");
        getContentPane().add(l_name);
        l_name.setBounds(20, 30, 53, 14);

        l_first.setText("First");
        getContentPane().add(l_first);
        l_first.setBounds(20, 40, 30, 30);

        b_age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01" , "02" , "03" , "04" , "05" , "06" , 
        "07" , "08" , "09" , "10" , "11" , "12" , "13" , "14" ,  "15" ,  "16" ,  "17" ,  "18" ,  "19" ,  "20" ,  "21" ,  
        "22" ,  "23" , "24" ,  "25" ,  "26" ,  "27" ,  "28" , "29" ,  "30" ,  "31" ,  "32" ,  "33" ,  "34" ,  
        "35" ,  "36" , "37" ,  "38" ,  "39" ,  "40" ,  "41" ,  "42" ,  "43" ,  "44" ,  "45" ,  "46" ,  "47" ,  
        "48" ,  "49" ,  "50" ,  "51" ,  "52" , "53" ,  "54" ,  "55" ,  "56" ,  "57" ,  "58" ,  "59" ,  "60" ,  
        "61" ,  "62" ,  "63" ,  "64" ,  "65" ,  "66" ,  "67" ,  "68" ,  "69" ,  "70" ,  "71" ,  "72" ,  "73" ,  
        "74" ,  "75" ,  "76" ,  "77" ,  "78" ,  "79" ,  "80"  }));
        getContentPane().add(b_age);
        b_age.setBounds(60, 90, 70, 30);

        b_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kathmandu", "Biratnagar", "Pokhara", "Nepaljung"}));
        getContentPane().add(b_to);
        b_to.setBounds(300, 350, 130, 30);

        b_ampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"AM", "PM"}));
        b_ampm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ampmActionPerformed(evt);
            }
        });
        getContentPane().add(b_ampm);
        b_ampm.setBounds(380, 300, 50, 30);

        l_to.setText("To");
        getContentPane().add(l_to);
        l_to.setBounds(270, 350, 30, 30);

        b_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        getContentPane().add(b_month);
        b_month.setBounds(140, 300, 50, 30);

        b_hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        getContentPane().add(b_hour);
        b_hour.setBounds(330, 300, 50, 30);

        l_date.setText("Date");
        getContentPane().add(l_date);
        l_date.setBounds(20, 300, 50, 30);

        b_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2017", "2018", "2019", "2020"}));
        getContentPane().add(b_year);
        b_year.setBounds(70, 300, 70, 30);

        l_seaatno.setText("Seat No.");
        getContentPane().add(l_seaatno);
        l_seaatno.setBounds(30, 400, 60, 30);

        b_from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kathmandu", "Biratnagar", "Pokhara", "Nepaljung"}));
        getContentPane().add(b_from);
        b_from.setBounds(70, 350, 120, 30);
        b_from.getAccessibleContext().setAccessibleName("");

        l_from.setText("From");
        getContentPane().add(l_from);
        l_from.setBounds(20, 350, 50, 30);

        b_seatno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"}));
        getContentPane().add(b_seatno);
        b_seatno.setBounds(140, 400, 50, 30);

        b_side.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"A", "B"}));
        b_side.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sideActionPerformed(evt);
            }
        });
        getContentPane().add(b_side);
        b_side.setBounds(90, 400, 50, 30);

        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });
        getContentPane().add(r_male);
        r_male.setBounds(250, 90, 60, 30);

        r_reserve.setText("reserve");
        r_reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_reserveActionPerformed(evt);
            }
        });
        getContentPane().add(r_reserve);
        r_reserve.setBounds(260, 400, 90, 30);

        ButtonGroup b1 = new ButtonGroup();
        b1.add(r_reserve);
        b1.add(r_confirm);

        b_submit.setText("Submit");
        getContentPane().add(b_submit);
        b_submit.setBounds(150, 460, 90, 40);

        String value_of_days[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "29", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

        A1.setBackground(new java.awt.Color(0, 255, 0));
        A2.setBackground(new java.awt.Color(0, 255, 0));
        A3.setBackground(new java.awt.Color(0, 255, 0));
        A4.setBackground(new java.awt.Color(0, 255, 0));
        A5.setBackground(new java.awt.Color(0, 255, 0));
        A6.setBackground(new java.awt.Color(0, 255, 0));
        A7.setBackground(new java.awt.Color(0, 255, 0));
        A8.setBackground(new java.awt.Color(0, 255, 0));
        A9.setBackground(new java.awt.Color(0, 255, 0));
        A10.setBackground(new java.awt.Color(0, 255, 0));
        AB.setBackground(new java.awt.Color(0, 255, 0));

        B1.setBackground(new java.awt.Color(0, 255, 0));
        B2.setBackground(new java.awt.Color(0, 255, 0));
        B3.setBackground(new java.awt.Color(0, 255, 0));
        B4.setBackground(new java.awt.Color(0, 255, 0));
        B5.setBackground(new java.awt.Color(0, 255, 0));
        B6.setBackground(new java.awt.Color(0, 255, 0));
        B7.setBackground(new java.awt.Color(0, 255, 0));
        B8.setBackground(new java.awt.Color(0, 255, 0));
        B9.setBackground(new java.awt.Color(0, 255, 0));
        B10.setBackground(new java.awt.Color(0, 255, 0));
        
        Seat.setLayout(null);

        d1.setText("A");
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        Seat.add(d1);
        d1.setBounds(30, 0, 60, 30);

        d2.setText("B");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        Seat.add(d2);
        d2.setBounds(210, 0, 60, 30);

        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        Seat.add(A1);
        A1.setBounds(0, 60, 60, 30);

        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);

            }
        });
        Seat.add(A2);
        A2.setBounds(60, 60, 60, 30);

        AB.setText("AB");
        AB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABActionPerformed(evt);
            }
        });
        Seat.add(AB);
        AB.setBounds(120, 220, 50, 30);

        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        Seat.add(B1);
        B1.setBounds(170, 60, 60, 30);

        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        Seat.add(B2);
        B2.setBounds(230, 60, 60, 30);

        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        Seat.add(A3);
        A3.setBounds(0, 100, 60, 30);

        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        Seat.add(A4);
        A4.setBounds(60, 100, 60, 30);

        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        Seat.add(A5);
        A5.setBounds(0, 140, 60, 30);

        A6.setText("A6");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        Seat.add(A6);
        A6.setBounds(60, 140, 60, 30);

        A7.setText("A7");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        Seat.add(A7);
        A7.setBounds(0, 180, 60, 30);

        A8.setText("A8");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        Seat.add(A8);
        A8.setBounds(60, 180, 60, 30);

        A9.setText("A9");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });
        Seat.add(A9);
        A9.setBounds(0, 220, 60, 30);

        A10.setText("A10");
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });
        Seat.add(A10);
        A10.setBounds(60, 220, 60, 30);

        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        Seat.add(B4);
        B4.setBounds(230, 100, 60, 30);

        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        Seat.add(B3);
        B3.setBounds(170, 100, 60, 30);

        B6.setText("B6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        Seat.add(B6);
        B6.setBounds(230, 140, 60, 30);

        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        Seat.add(B5);
        B5.setBounds(170, 140, 60, 30);

        B8.setText("B8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        Seat.add(B8);
        B8.setBounds(230, 180, 60, 30);

        B7.setText("B7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        Seat.add(B7);
        B7.setBounds(170, 180, 60, 30);

        B10.setText("B10");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });
        Seat.add(B10);
        B10.setBounds(230, 220, 60, 30);

        B9.setText("B9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        Seat.add(B9);
        B9.setBounds(170, 220, 60, 30);

        getContentPane().add(Seat);
        Seat.setBounds(510, 250, 290, 260);
        getContentPane().add(Dateandtime);
        Dateandtime.setBounds(580, 50, 190, 140);

        setBounds(0, 0, 854, 561);

        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
//                String year_1 = Popup.year;
                

                String first_name = t_first.getText();
                String middle_name = t_middle.getText();
                String last_name = t_last.getText();
                
                String age = (String) b_age.getSelectedItem();
                String male = r_male.getText();
                String female = r_female.getText();
                
                String email_id = t_email.getText();
                String phone_no = t_phone.getText();

                String contact_address = p_contact.getText();
                
                String year = (String) b_year.getSelectedItem();
                String month = (String) b_month.getSelectedItem();
                String day = (String) b_day.getSelectedItem();

                String hour = (String) b_hour.getSelectedItem();
                String am_pm = (String) b_ampm.getSelectedItem();
                
                String from = (String) b_from.getSelectedItem();
                String to = (String) b_to.getSelectedItem();
                
                String seat_no = (String) b_seatno.getSelectedItem();
                String side_select = (String) b_side.getSelectedItem();

                String reserve = r_reserve.getText();
                String confirm = r_confirm.getText();

                Enumeration<AbstractButton> sex = b2.getElements();
                Enumeration<AbstractButton> set_status = b1.getElements();

                
                Pattern patt = Pattern.compile("[0-9,%@!()*~^!#$%&+/-]");
                Matcher n1 = patt.matcher(first_name);
                Matcher n2 = patt.matcher(middle_name);
                Matcher n3 = patt.matcher(last_name);

                Pattern pattern = Pattern.compile("(\\d-)?(\\d{10})");
                Matcher ph = pattern.matcher(phone_no);
                boolean b = ph.matches();

                Pattern patn = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                Matcher em = patn.matcher(email_id);
                boolean b2 = em.matches();

                Color c1 = A1.getBackground();
                Color c2 = A2.getBackground();
                Color c3 = A3.getBackground();
                Color c4 = A4.getBackground();
                Color c5 = A5.getBackground();
                Color c6 = A6.getBackground();
                Color c7 = A7.getBackground();
                Color c8 = A8.getBackground();
                Color c9 = A9.getBackground();
                Color c10 = A10.getBackground();
                Color c11 = AB.getBackground();
                Color c12 = B1.getBackground();
                Color c13 = B2.getBackground();
                Color c14 = B3.getBackground();
                Color c15 = B4.getBackground();
                Color c16 = B5.getBackground();
                Color c17 = B6.getBackground();
                Color c18 = B7.getBackground();
                Color c19 = B8.getBackground();
                Color c20 = B9.getBackground();
                Color c21 = B10.getBackground();

                Color Colred = new java.awt.Color(242, 9, 9);
                Color Colyellow = new java.awt.Color(255, 224, 61);
                
                String seatA1 = A1.getText();
                String seatA2 = A2.getText();
                String seatA3 = A3.getText();
                String seatA4 = A4.getText();
                String seatA5 = A5.getText();
                String seatA6 = A6.getText();
                String seatA7 = A7.getText();
                String seatA8 = A8.getText();
                String seatA9 = A9.getText();
                String seatA10 = A10.getText();
                String seatA11 = AB.getText();
                
                String seatB1 = A1.getText();
                String seatB2 = A2.getText();
                String seatB3 = A3.getText();
                String seatB4 = A4.getText();
                String seatB5 = A5.getText();
                String seatB6 = A6.getText();
                String seatB7 = A7.getText();
                String seatB8 = A8.getText();
                String seatB9 = A9.getText();
                String seatB10 = A10.getText();
                String seatB11 = AB.getText();
                
             

                if (from == "Kathmandu" && to == "Biratnagar") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                
                else if (from == "Kathmandu" && to == "Pokhara") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }
                } 
                else if (from == "Kathmandu" && to == "Nepaljung") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Biratnagar" && to == "Pokhara") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Biratnagar" && to == "Kathmandu") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Biratnagar" && to == "Nepaljung") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Pokhara" && to == "Biratnagar") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Pokhara" && to == "Nepaljung") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }
                }
                else if (from == "Pokhara" && to == "Kathmandu") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Nepaljung" && to == "Biratnagar") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else if (from == "Nepaljung" && to == "Pokhara") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                }
                else if (from == "Nepaljung" && to == "Kathmandu") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                }
               else if (from == "Neplajung" && to == "Pokhara") {
                    if (side_select == "A") {
                        if (seat_no == "1") {
                            if (c1.getRGB() == Colred.getRGB() || c1.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A1.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A1.setBackground(new java.awt.Color(242, 9, 9));
                            }

                        } else if (seat_no == "2") {
                            if (c2.getRGB() == Colred.getRGB() || c2.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            } else if (r_reserve.isSelected()) {
                                A2.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c3.getRGB() == Colred.getRGB() || c3.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A3.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c4.getRGB() == Colred.getRGB() || c4.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A4.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c5.getRGB() == Colred.getRGB() || c5.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A5.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c6.getRGB() == Colred.getRGB() || c6.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat are already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A6.setBackground(new java.awt.Color(255, 224, 61));
                            } else if (r_confirm.isSelected()) {
                                A6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c7.getRGB() == Colred.getRGB() || c7.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c8.getRGB() == Colred.getRGB() || c8.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c9.getRGB() == Colred.getRGB() || c9.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c10.getRGB() == Colred.getRGB() || c10.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                A10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                A10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    } 
                    if (side_select == "B") {
                        if (seat_no == "1") {
                            if (c12.getRGB() == Colred.getRGB() || c12.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B1.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B1.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "2") {
                            if (c13.getRGB() == Colred.getRGB() || c13.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B2.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B2.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "3") {
                            if (c14.getRGB() == Colred.getRGB() || c14.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B3.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B3.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "4") {
                            if (c15.getRGB() == Colred.getRGB() || c15.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B4.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B4.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "5") {
                            if (c16.getRGB() == Colred.getRGB() || c16.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B5.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B5.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "6") {
                            if (c17.getRGB() == Colred.getRGB() || c17.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B6.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B6.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "7") {
                            if (c18.getRGB() == Colred.getRGB() || c18.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B7.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B7.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "8") {
                            if (c19.getRGB() == Colred.getRGB() || c19.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B8.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B8.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "9") {
                            if (c20.getRGB() == Colred.getRGB() || c20.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B9.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B9.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "10") {
                            if (c21.getRGB() == Colred.getRGB() || c21.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                B10.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else if (r_confirm.isSelected()) {
                                B10.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        } else if (seat_no == "11") {
                            if (c11.getRGB() == Colred.getRGB() || c11.getRGB() == Colyellow.getRGB()) {
                                JOptionPane.showMessageDialog(null, "Seat is already taken by others ");
                            }
                            else if (r_reserve.isSelected()) {
                                AB.setBackground(new java.awt.Color(255, 224, 61));
                            }
                            else  if (r_confirm.isSelected()) {
                                AB.setBackground(new java.awt.Color(242, 9, 9));
                            }
                        }
                    }

                } 
                else {
                    JOptionPane.showMessageDialog(null, "Invalid selection");

                }

                

                if (first_name.equals("") || last_name.equals("") || age.equals("")
                        || (male.equals("") && female.equals("")) || email_id.equals("") || phone_no.equals("")
                        || contact_address.equals("") || year.equals("") || month.equals("") || female.equals("")
                        || year.equals("") || month.equals("") || day.equals("") || hour.equals("")
                        || am_pm.equals("") || from.equals("") || to.equals("") || seat_no.equals("")
                        || side_select.equals("") || (reserve.equals("") && reserve.equals(""))) {
                    JOptionPane.showMessageDialog(null, "can not accept blank input");
                } else if (n1.find() || n2.find() || n3.find()) {
                    JOptionPane.showMessageDialog(null, "Name only content characters");
                } else if ((email_id.length() < 10) || (b2 == false)) {
                    JOptionPane.showMessageDialog(null, "Unauthorized Email");
                } else if ((phone_no.length() != 10) || (b == false) || (phone_no.equals("0000000000"))) {
                    JOptionPane.showMessageDialog(null, "Invalid Phone Number");
                } else {
                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_register", "root", "");

                        String query = "insert into seat values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement statement = connection.prepareStatement(query);

                        statement.setString(1, first_name);
                        statement.setString(2, middle_name);
                        statement.setString(3, last_name);
                        statement.setString(4, age);
                        if (r_male.isSelected()) {
                            statement.setString(5, male);
                        }
                        if (r_female.isSelected()) {
                            statement.setString(5, female);
                        }
                        statement.setString(6, email_id);
                        statement.setString(7, phone_no);
                        statement.setString(8, contact_address);
                        statement.setString(9, year);
                        statement.setString(10, month);
                        statement.setString(11, day);
                        statement.setString(12, hour);
                        statement.setString(13, am_pm);
                        statement.setString(14, from);
                        statement.setString(15, to);
                        statement.setString(16, side_select);
                        statement.setString(17, seat_no);
                        if (r_reserve.isSelected()) {
                            statement.setString(18, reserve);
                        }
                        if (r_confirm.isSelected()) {
                            statement.setString(18, confirm);
                        }
                        statement.execute();
                        connection.close();
                    } catch (ClassNotFoundException e) {
                        JOptionPane.showMessageDialog(null, " "+e);
                    } catch (SQLException e1) {
                        JOptionPane.showMessageDialog(null, " "+e1);

                    }
                }
//                dispose();
            }
        });

        b_clear.setText("Clear");
        getContentPane().add(b_clear);
        b_clear.setBounds(280, 460, 90, 40);

        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main mainObj = new Main();
                dispose();

            }
        });

        

    }

    private void t_middleActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_lastActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_phoneActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_firstActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_emailActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void r_confirmActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void r_reserveActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_middle1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_last1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void t_first4ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void b_ampmActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void b_sideActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ABActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public javax.swing.JButton A1;
    public javax.swing.JButton A10;
    public javax.swing.JButton A2;
    public javax.swing.JButton A3;
    public javax.swing.JButton A4;
    public javax.swing.JButton A5;
    public javax.swing.JButton A6;
    public javax.swing.JButton A7;
    public javax.swing.JButton A8;
    public javax.swing.JButton A9;
    public javax.swing.JButton AB;
    public javax.swing.JButton B1;
    public javax.swing.JButton B10;
    public javax.swing.JButton B2;
    public javax.swing.JButton B3;
    public javax.swing.JButton B4;
    public javax.swing.JButton B5;
    public javax.swing.JButton B6;
    public javax.swing.JButton B7;
    public javax.swing.JButton B8;
    public javax.swing.JButton B9;
    public javax.swing.JPanel Dateandtime;
    public javax.swing.JPanel Seat;
    public javax.swing.JComboBox<String> b_age;
    public javax.swing.JComboBox<String> b_ampm;
    public javax.swing.JButton b_clear;
    public javax.swing.JComboBox<String> b_day;
    public javax.swing.JComboBox<String> b_from;
    public javax.swing.JComboBox<String> b_hour;
    public javax.swing.JComboBox<String> b_month;
    public javax.swing.JComboBox<String> b_seatno;
    public javax.swing.JComboBox<String> b_side;
    public javax.swing.JButton b_submit;
    public javax.swing.JComboBox<String> b_to;
    public javax.swing.JComboBox<String> b_year;
    public javax.swing.JButton d1;
    public javax.swing.JButton d2;
    public javax.swing.JLabel l_age;
    public javax.swing.JLabel l_contact;
    public javax.swing.JLabel l_date;
    public javax.swing.JLabel l_email;
    public javax.swing.JLabel l_first;
    public javax.swing.JLabel l_first5;
    public javax.swing.JLabel l_from;
    public javax.swing.JLabel l_last;
    public javax.swing.JLabel l_last1;
    public javax.swing.JLabel l_middle;
    public javax.swing.JLabel l_middle1;
    public javax.swing.JLabel l_name;
    public javax.swing.JLabel l_name2;
    public javax.swing.JLabel l_phone;
    public javax.swing.JLabel l_seaatno;
    public javax.swing.JLabel l_sex;
    public javax.swing.JLabel l_ticketdetail;
    public javax.swing.JLabel l_time;
    public javax.swing.JLabel l_to;
    private javax.swing.JTextField p_contact;
    public javax.swing.JRadioButton r_confirm;
    public javax.swing.JRadioButton r_female;
    public javax.swing.JRadioButton r_male;
    public javax.swing.JRadioButton r_reserve;
    public javax.swing.JTextPane t_contact;
    public javax.swing.JTextField t_email;
    public javax.swing.JTextField t_first;
    private javax.swing.JTextField t_first4;
    private javax.swing.JTextField t_last;
    private javax.swing.JTextField t_last1;
    public javax.swing.JTextField t_middle;
    private javax.swing.JTextField t_middle1;
    public javax.swing.JTextField t_phone;

}
