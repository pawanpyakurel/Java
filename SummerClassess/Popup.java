package SummerClassess;

import javax.swing.JOptionPane;

public class Popup extends javax.swing.JFrame {

    public Popup() {
        initComponents();
        setVisible(true);
        setSize(675, 500);
    }

    public void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        b_hour = new javax.swing.JComboBox<>();
        l_date = new javax.swing.JLabel();
        b_year = new javax.swing.JComboBox<>();
        b_month = new javax.swing.JComboBox<>();
        b_day = new javax.swing.JComboBox<>();
        l_time = new javax.swing.JLabel();
        b_ampm = new javax.swing.JComboBox<>();
        l_from = new javax.swing.JLabel();
        b_from = new javax.swing.JComboBox<>();
        l_to = new javax.swing.JLabel();
        b_to = new javax.swing.JComboBox<>();
        l_date1 = new javax.swing.JLabel();
        Check = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        showplce = new javax.swing.JPanel();
        seatshow = new javax.swing.JLabel();
        tseatno = new javax.swing.JTextField();
        lprice = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        Refress = new javax.swing.JButton();
        Process = new javax.swing.JButton();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        tprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpriceActionPerformed(evt);
            }
        });
        showplce.add(tprice);
        tprice.setBounds(20, 160, 70, 30);

        tseatno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tseatnoActionPerformed(evt);
            }
        });
        showplce.add(tseatno);
        tseatno.setBounds(30, 50, 50, 30);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 2, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 400));
        jPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 102)));
        jPanel4.setLayout(null);

        b_hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        jPanel4.add(b_hour);
        b_hour.setBounds(340, 30, 50, 30);

        l_date.setText("Date");
        jPanel4.add(l_date);
        l_date.setBounds(-40, 60, 50, 30);

        b_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2017", "2018", "2019", "2020"}));
        jPanel4.add(b_year);
        b_year.setBounds(70, 30, 70, 30);

        b_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        jPanel4.add(b_month);
        b_month.setBounds(140, 30, 50, 30);

        b_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "29", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        jPanel4.add(b_day);
        b_day.setBounds(190, 30, 50, 30);

        l_time.setText("Time");
        jPanel4.add(l_time);
        l_time.setBounds(300, 30, 40, 30);

        b_ampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"AM", "PM"}));
        b_ampm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ampmActionPerformed(evt);
            }
        });
        jPanel4.add(b_ampm);
        b_ampm.setBounds(390, 30, 50, 30);

        l_from.setText("From");
        jPanel4.add(l_from);
        l_from.setBounds(30, 110, 50, 30);

        b_from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kathmandu", "Biratnagar", "Pokhara", "Nepaljung"}));
        jPanel4.add(b_from);
        b_from.setBounds(80, 110, 120, 30);

        l_to.setText("To");
        jPanel4.add(l_to);
        l_to.setBounds(290, 110, 30, 30);

        b_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kathmandu", "Biratnagar", "Pokhara", "Nepaljung"}));
        jPanel4.add(b_to);
        b_to.setBounds(320, 110, 130, 30);

        l_date1.setText("Date");
        jPanel4.add(l_date1);
        l_date1.setBounds(20, 30, 50, 30);

        Check.setText("Confrm ");
        jPanel4.add(Check);
        Check.setBounds(220, 180, 120, 23);
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                String seat = "1";
                
                String year = (String) b_year.getSelectedItem();
                String month = (String) b_month.getSelectedItem();
                String day = (String) b_day.getSelectedItem();
                
                
                
                String time = (String) b_hour.getSelectedItem();;
                String ampm = (String) b_ampm.getSelectedItem();
                
                
                
                String from = (String) b_from.getSelectedItem();
                String to = (String) b_to.getSelectedItem();
         
                if (from == "Kathmandu" && to == "Biratnagar") {
                    String price = "1200";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Kathmandu" && to == "Pokhara") {
                    String price = "1000";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Kathmandu" && to == "Nepaljung") {
                    String price = "1500";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Biratnagar" && to == "Pokhara") {
                    String price = "1700";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Biratnagar" && to == "Kathmandu") {
                    String price = "1200";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Biratnagar" && to == "Nepaljung") {
                    String price = "2000";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Pokhara" && to == "Biratnagar") {
                    String price = "1700";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Pokhara" && to == "Nepaljung") {
                    String price = "1400";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Pokhara" && to == "Kathmandu") {
                    String price = "1000";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Nepaljung" && to == "Biratnagar") {
                    String price = "2000";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Nepaljung" && to == "Pokhara") {
                    String price = "1400";
                    tprice.setText(price);
                    tseatno.setText(seat);
                }

                else if (from == "Nepaljung" && to == "Kathmandu") {
                    String price = "1500";
                    tprice.setText(price);
                    tseatno.setText(seat);
                } 
                
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Selection");
                    
                    
                    Popup ObjPopup = new Popup();
                    dispose();

                }

            }
        }
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 150, 480, 210);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(22, 233, 233));
        jPanel3.setToolTipText("Source and Destination Information");

        jLabel1.setFont(new java.awt.Font("Lao UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Source and Destination Information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(116, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 650, 60);

        showplce.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        showplce.setForeground(new java.awt.Color(51, 51, 255));
        showplce.setLayout(null);

        seatshow.setText(" Avaliable Seat no.");
        showplce.add(seatshow);
        seatshow.setBounds(0, 10, 100, 29);

        lprice.setText("Price Per Seat");
        showplce.add(lprice);
        lprice.setBounds(20, 120, 90, 30);

        jPanel1.add(showplce);
        showplce.setBounds(520, 150, 110, 210);

        Refress.setBackground(new java.awt.Color(102, 102, 102));
        Refress.setForeground(new java.awt.Color(9, 9, 244));
        Refress.setText("Refress");
        jPanel1.add(Refress);
        Refress.setBounds(30, 80, 160, 40);
        Refress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Popup ObjPopup = new Popup();
                dispose();
            }
        }
        );

        Process.setBackground(new java.awt.Color(145, 145, 220));
        Process.setForeground(new java.awt.Color(146, 24, 55));
        Process.setText("Process");
        jPanel1.add(Process);
        Process.setBounds(190, 390, 200, 40);
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Main ObjMain = new Main();
                dispose();
            }
        }
        );

        getContentPane().add(jPanel1);

        pack();
    }

    private void b_ampmActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void tseatnoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void tpriceActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JButton Refress;
    private javax.swing.JCheckBox Check;
    private javax.swing.JButton Process;
    public javax.swing.JComboBox<String> b_ampm;
    public javax.swing.JComboBox<String> b_day;
    public javax.swing.JComboBox<String> b_from;
    public javax.swing.JComboBox<String> b_hour;
    public javax.swing.JComboBox<String> b_month;
    public javax.swing.JComboBox<String> b_to;
    public javax.swing.JComboBox<String> b_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel l_date;
    public javax.swing.JLabel l_date1;
    public javax.swing.JLabel l_from;
    public javax.swing.JLabel l_time;
    public javax.swing.JLabel l_to;
    private javax.swing.JLabel lprice;
    private javax.swing.JLabel seatshow;
    private javax.swing.JPanel showplce;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tseatno;

    String seat;
    String price;
}
