package login;

import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tampilanGUI extends JFrame {
    JLabel ltitle = new JLabel("Menu Login",SwingConstants.LEFT);
    JLabel luser = new JLabel("Username     : ");
    JLabel lpass = new JLabel("Password      : ");
    JLabel lOr = new JLabel("<3~~~~Register Dulu ya Sebelum Login~~~~:)",SwingConstants.CENTER);
    JLabel ldaftar = new JLabel("Menu Register",SwingConstants.CENTER);
    JLabel lnuser = new JLabel("Username    : ");
    JLabel lnpass = new JLabel("Password     : ");
    JTextField tfUser = new JTextField();
    JTextField tfPass = new JTextField();
    JTextField tfnuser = new JTextField();
    JTextField tfnpass = new JTextField();

    JButton btnLogin = new JButton("Login");
    JButton btnRegis = new JButton("Register");
    String dbtabel = "login";
    String query;
    String[][] data = new String[2][2];

    koneksi konek = new koneksi();
    public tampilanGUI(){
        setTitle("Login");
        setLayout(null);
        setSize(500 , 500);

        add(ltitle);
        add(luser);
        add(lpass);
        add(lnuser);
        add(lnpass);
        add(lOr);
        add(ldaftar);
        add(tfPass);
        add(tfUser);
        add(tfnuser);
        add(tfnpass);
        add(btnLogin);
        add(btnRegis);

        ltitle.setBounds(65 , 10 ,480,20);
        luser.setBounds(20,50,100,25);
        tfUser.setBounds(120 ,50,150,25);
        lpass.setBounds(20,90,100,25);
        tfPass.setBounds(120,90,150,25);
        btnLogin.setBounds(60,140,80,30);
        lOr.setBounds(0,180,480,20);
        ldaftar.setBounds(80,220,480,20);
        lnuser.setBounds(200,260,150,25);
        tfnuser.setBounds(300 ,260,150,25);
        lnpass.setBounds(200,300,100,25);
        tfnpass.setBounds(300,300,150,25);
        btnRegis.setBounds(270,360,100,30);


        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    konek.statement = konek.konek.createStatement();
                    query = "select 'username' from " + dbtabel + " where username = '" + getUser() + "';";
                    ResultSet result_user = konek.statement.executeQuery(query);
                    while (result_user.next())
                        data[0][0] = result_user.getString("username");
                    query = "select 'password' from " + dbtabel + " where password = '" + getPass() + "';";
                    ResultSet result_pass = konek.statement.executeQuery(query);
                    while (result_pass.next())
                        data[0][1] =result_pass.getString("password");
                    if (getUser().isEmpty()|| getPass().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Isi Semua Data");
                    }else if (data[0][0] == null){
                        JOptionPane.showMessageDialog(null,"Username tidak ditemukan");
                    } else if (data[0][1] == null){
                        JOptionPane.showMessageDialog(null,"Password Salah");
                    } else {
                        JOptionPane.showMessageDialog(null,"Login Berhasil");
                    }
                    data[0][0]= null; data[0][1]= null;

                } catch (SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });

        btnRegis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    konek.statement = konek.konek.createStatement();
                    query = "select 'username' from " + dbtabel + " where username = '" + getnuser() + "';";
                    ResultSet result_user = konek.statement.executeQuery(query);
                    while (result_user.next())
                        data[0][0] = result_user.getString("username");
                    if (getnuser().isEmpty()|| getnpass().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Isi semua Data");
                    }else if(data[0][0] != null){
                        JOptionPane.showMessageDialog(null,"Username Telah digunakan");
                    } else {
                        query = "Insert  into " + dbtabel + " (username, password) Values ('" + getnuser() + "','" + getnpass() + "')";
                        konek.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Registrasi Berhasil");
                    }
                    data[0][0] = null;
                }catch (SQLException e2){
                    System.out.println(e2.getMessage());
                }

            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUser(){
        return tfUser.getText();
    }

    public String getPass(){
        return tfPass.getText();
    }

    public String getnuser(){return tfnuser.getText();}

    public String getnpass(){return tfnpass.getText();}
}
