package View;

import Model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER E15
 */
public class AdminPannel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPannel
     */
    ButtonGroup buttonGroup = new ButtonGroup();
    String gender;

    public AdminPannel() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup.add(male_rb);
        buttonGroup.add(female_rb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        account_id_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        account_name_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phone_number_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password_tf = new javax.swing.JTextField();
        add_user_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        clear_fields_btn = new javax.swing.JButton();
        male_rb = new javax.swing.JRadioButton();
        female_rb = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        user_account_id_tf = new javax.swing.JTextField();
        delete_account_btn = new javax.swing.JButton();
        exit2_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        search_id_tf = new javax.swing.JTextField();
        print_account_btn = new javax.swing.JButton();
        exit2_btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_ta = new javax.swing.JTextArea();
        clear2_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin DashBoard");

        jLabel1.setText("Account ID :");

        account_id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_id_tfActionPerformed(evt);
            }
        });

        jLabel2.setText("Account Holder Name :");

        jLabel3.setText("Phone Number :");

        jLabel4.setText("Email :");

        jLabel5.setText("Password :");

        add_user_btn.setText("Add User");
        add_user_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_user_btnActionPerformed(evt);
            }
        });

        exit_btn.setText("Back To Main Menu");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        clear_fields_btn.setText("Clear Fields");
        clear_fields_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_fields_btnActionPerformed(evt);
            }
        });

        male_rb.setText("Male");
        male_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_rbActionPerformed(evt);
            }
        });

        female_rb.setText("Female");
        female_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_rbActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(add_user_btn)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(male_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(female_rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(password_tf)
                    .addComponent(email_tf)
                    .addComponent(phone_number_tf)
                    .addComponent(account_id_tf)
                    .addComponent(account_name_tf)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(clear_fields_btn)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_btn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male_rb)
                    .addComponent(female_rb)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_number_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_user_btn)
                    .addComponent(clear_fields_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(exit_btn)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Users", jPanel1);

        jLabel7.setText("User Account ID :");

        delete_account_btn.setText("Delete User Account");
        delete_account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_account_btnActionPerformed(evt);
            }
        });

        exit2_btn.setText("Back To Main Menu");
        exit2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_account_btn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(user_account_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit2_btn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(user_account_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(delete_account_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(exit2_btn)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Delete Users", jPanel2);

        jLabel8.setText("User Account ID :");

        print_account_btn.setText("Print User Info");
        print_account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_account_btnActionPerformed(evt);
            }
        });

        exit2_btn1.setText("Back To Main Menu");
        exit2_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2_btn1ActionPerformed(evt);
            }
        });

        info_ta.setEditable(false);
        info_ta.setColumns(20);
        info_ta.setRows(5);
        jScrollPane1.setViewportView(info_ta);

        clear2_btn.setText("Clear Fields");
        clear2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit2_btn1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(print_account_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clear2_btn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(search_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(search_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print_account_btn)
                    .addComponent(clear2_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(exit2_btn1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View User", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void account_id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_id_tfActionPerformed

    private void female_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_rbActionPerformed
        gender = "Female";
    }//GEN-LAST:event_female_rbActionPerformed

    private void male_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_rbActionPerformed
        gender = "Male";
    }//GEN-LAST:event_male_rbActionPerformed

    private void clear_fields_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_fields_btnActionPerformed
        account_id_tf.setText("");
        account_name_tf.setText("");
        buttonGroup.clearSelection();
        phone_number_tf.setText("");
        email_tf.setText("");
        password_tf.setText("");
    }//GEN-LAST:event_clear_fields_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        int x = JOptionPane.showConfirmDialog(
                this, "Confirm Exit!",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (x == 0) {
            MainPage mainPage = new MainPage();
            this.setVisible(false);
            mainPage.setVisible(true);
        }
    }//GEN-LAST:event_exit_btnActionPerformed

    private void add_user_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_user_btnActionPerformed
        try {
            List<User> usersList = Controller.Helper.searchUsers("eq", "account_id", account_id_tf.getText());

            if (account_id_tf.getText().equals("")
                    || account_name_tf.getText().equals("")
                    || phone_number_tf.getText().equals("")
                    || email_tf.getText().equals("")
                    || (male_rb.isSelected() == false && female_rb.isSelected() == false)
                    || password_tf.getText().equals("")) {

                JOptionPane.showMessageDialog(
                        this, "Please Fill All Required Feilds",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (!(account_id_tf.getText().matches("[0-9]*"))) {
                JOptionPane.showMessageDialog(
                        this, "Account ID Must Be Numric Digits",
                        "Invalid Data Type",
                        JOptionPane.ERROR_MESSAGE);
            } else if (!(phone_number_tf.getText().matches("[0-9]*"))) {
                JOptionPane.showMessageDialog(
                        this, "Phone Number Must Be Numric Digits",
                        "Invalid Data Type",
                        JOptionPane.ERROR_MESSAGE);
            } else if (account_id_tf.getText().length() != 10) {
                JOptionPane.showMessageDialog(
                        this, "Account ID Must Be 10 digts",
                        "Invalid ID length",
                        JOptionPane.ERROR_MESSAGE);
            } else if (!(email_tf.getText().matches("[A-Za-z0-9-_.]+@[A-Za-z0-9-_]+[.][a-zA-Z]{2,6}"))) {
                JOptionPane.showMessageDialog(
                        this, "Invalid Email Adress",
                        "Invalid Entry",
                        JOptionPane.ERROR_MESSAGE);
            } else if (usersList.size() >= 1) {
                JOptionPane.showMessageDialog(
                        this, "Accound ID is already used",
                        "Invalid Entry",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String userInput = password_tf.getText();
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(userInput.getBytes());
                BigInteger number = new BigInteger(1, messageDigest);
                String hashedText = number.toString(16);

                Controller.Helper.insertUser(new User(
                        account_id_tf.getText(),
                        hashedText,
                        account_name_tf.getText(),
                        gender,
                        phone_number_tf.getText(),
                        email_tf.getText(),
                        0));

                JOptionPane.showMessageDialog(
                        this, "User Account Created",
                        "Scucess",
                        JOptionPane.INFORMATION_MESSAGE);

                File logs = new File("E:\\Java\\AccountingSystemInMD\\src\\Controller\\logs.txt");
                if (!logs.exists()) {
                    logs.createNewFile();
                }

                String newLine = System.getProperty("line.separator");
                FileOutputStream fos = new FileOutputStream(logs, true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                PrintWriter pw = new PrintWriter(osw);

                String timeStamp = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss").format(Calendar.getInstance().getTime());
                pw.append("Account With ID : " + account_id_tf.getText() + " Has Been Created @ " + timeStamp + newLine);
                pw.close();

                account_id_tf.setText("");
                account_name_tf.setText("");
                buttonGroup.clearSelection();
                phone_number_tf.setText("");
                email_tf.setText("");
                password_tf.setText("");
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AdminPannel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_user_btnActionPerformed

    private void exit2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2_btnActionPerformed
        int x = JOptionPane.showConfirmDialog(
                this, "Confirm Exit!",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (x == 0) {
            MainPage mainPage = new MainPage();
            this.setVisible(false);
            mainPage.setVisible(true);
        }
    }//GEN-LAST:event_exit2_btnActionPerformed

    private void delete_account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_account_btnActionPerformed
        try {
            if (user_account_id_tf.getText().equals("")) {
                JOptionPane.showMessageDialog(
                        this, "Please Fill In The Feild",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                user_account_id_tf.setText("");
            } else if (!(user_account_id_tf.getText().matches("[0-9]*"))) {
                JOptionPane.showMessageDialog(
                        this, "Account ID Must Be Numric Digits",
                        "Invalid Data Type",
                        JOptionPane.ERROR_MESSAGE);
                user_account_id_tf.setText("");
            } else if (user_account_id_tf.getText().length() != 10) {
                JOptionPane.showMessageDialog(
                        this, "Account ID Must Be 10 digts",
                        "Invalid ID length",
                        JOptionPane.ERROR_MESSAGE);
                user_account_id_tf.setText("");
            } else {

                long flag = Controller.Helper.deleteUser("eq", "account_id", user_account_id_tf.getText());

                if (flag >= 1) {
                    JOptionPane.showMessageDialog(
                            this, "User Account Deleted",
                            "Scucess",
                            JOptionPane.INFORMATION_MESSAGE);

                    File logs = new File("E:\\Java\\AccountingSystemInMD\\src\\Controller\\logs.txt");
                    if (!logs.exists()) {
                        logs.createNewFile();
                    }

                    String newLine = System.getProperty("line.separator");
                    FileOutputStream fos = new FileOutputStream(logs, true);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    PrintWriter pw = new PrintWriter(osw);

                    String timeStamp = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss").format(Calendar.getInstance().getTime());
                    pw.append("Account With ID : " + account_id_tf.getText() + " Has Been Deleted @ " + timeStamp + newLine);
                    pw.close();
                    user_account_id_tf.setText("");
                    info_ta.setText("");
                } else {
                    JOptionPane.showMessageDialog(
                            this, "User Not Found",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                    user_account_id_tf.setText("");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(AdminPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_account_btnActionPerformed

    private void print_account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_account_btnActionPerformed

        if (search_id_tf.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this, "Please Fill The Feild",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            search_id_tf.setText("");
        } else if (!(search_id_tf.getText().matches("[0-9]*"))) {
            JOptionPane.showMessageDialog(
                    this, "Account ID Must Be Numric Digits",
                    "Invalid Data Type",
                    JOptionPane.ERROR_MESSAGE);
            search_id_tf.setText("");
        } else if (search_id_tf.getText().length() != 10) {
            JOptionPane.showMessageDialog(
                    this, "Account ID Must Be 10 digts",
                    "Invalid ID length",
                    JOptionPane.ERROR_MESSAGE);
            search_id_tf.setText("");
        } else {

            List<User> users = Controller.Helper.searchUsers("eq", "account_id", search_id_tf.getText());
            String info = "";
            if (users.isEmpty()) {
                JOptionPane.showMessageDialog(
                        this, "User Not Found",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                search_id_tf.setText("");

            } else {
                User user = users.get(0);

                info = "Account ID : " + user.getAccount_id()
                        + "\nName : " + user.getName()
                        + "\nGender : " + user.getGender()
                        + "\nPhone : " + user.getPhone()
                        + "\nEmail : " + user.getEmail();

                info_ta.setText(info);
            }
        }

    }//GEN-LAST:event_print_account_btnActionPerformed

    private void exit2_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2_btn1ActionPerformed
        int x = JOptionPane.showConfirmDialog(
                this, "Confirm Exit!",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (x == 0) {
            MainPage mainPage = new MainPage();
            this.setVisible(false);
            mainPage.setVisible(true);
        }
    }//GEN-LAST:event_exit2_btn1ActionPerformed

    private void clear2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2_btnActionPerformed
        search_id_tf.setText("");
        info_ta.setText("");
    }//GEN-LAST:event_clear2_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_id_tf;
    private javax.swing.JTextField account_name_tf;
    private javax.swing.JButton add_user_btn;
    private javax.swing.JButton clear2_btn;
    private javax.swing.JButton clear_fields_btn;
    private javax.swing.JButton delete_account_btn;
    private javax.swing.JTextField email_tf;
    private javax.swing.JButton exit2_btn;
    private javax.swing.JButton exit2_btn1;
    private javax.swing.JButton exit_btn;
    private javax.swing.JRadioButton female_rb;
    private javax.swing.JTextArea info_ta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton male_rb;
    private javax.swing.JTextField password_tf;
    private javax.swing.JTextField phone_number_tf;
    private javax.swing.JButton print_account_btn;
    private javax.swing.JTextField search_id_tf;
    private javax.swing.JTextField user_account_id_tf;
    // End of variables declaration//GEN-END:variables
}
