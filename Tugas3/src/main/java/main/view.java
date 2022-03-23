package main;

import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import tugas3.ruang.Balok;

public class view  extends JFrame implements ActionListener {
    JLabel lJudul = new JLabel("COBULD CALCULATOR");
    JLabel lPanjang = new JLabel("Length");
    JTextField fPanjang = new JTextField(8);
    
    JLabel lLebar = new JLabel("Widht");
    JTextField fLebar = new JTextField(8);
    
    JLabel lTinggi = new JLabel("Height");
    JTextField fTinggi = new JTextField(8);
    
    JLabel lHasil = new JLabel("Results :");
    
    JLabel lLuasP = new JLabel(); 
    
    JLabel lKelilingP = new JLabel();
    
    JLabel lVolumeB = new JLabel();
    
    JLabel lLuasPer = new JLabel();

    JButton bHitung = new JButton ("Count");
    JButton bReset = new JButton("Reset");
    
    
    view(){
        setTitle("Tugas Pertemuan 5");
        setSize(450,550);
        setLayout(null);

        add(lJudul);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(bHitung);
        add(bReset);
        
        lJudul.setBounds(125,0,250,20);
        lPanjang.setBounds(10,30,250,20);
        fPanjang.setBounds(90, 30, 250, 20);
        lLebar.setBounds(10,70,150,20);
        fLebar.setBounds(90, 70, 250, 20);
        lTinggi.setBounds(10,110,150,20);
        fTinggi.setBounds(90, 110, 250, 20);
        lHasil.setBounds(50, 140, 150, 20);
        bHitung.setBounds(45, 350, 120, 50);
        bReset.setBounds(200, 350, 120, 50);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bHitung) {
            
            try{
                double panjang = Double.parseDouble(fPanjang.getText());
                double lebar = Double.parseDouble(fLebar.getText());
                double tinggi = Double.parseDouble(fTinggi.getText());

                Balok balok = new Balok(tinggi, panjang, lebar);
      
                lLuasP.setText      ("Square Area                    : " + Double.toString(balok.luas()));
                add(lLuasP);
                lLuasP.setBounds(30, 170, 300, 30);
                
                lKelilingP.setText  ("Square Circumference           : " + Double.toString(balok.keliling()));
                add(lKelilingP);
                lKelilingP.setBounds(30, 210, 300, 30);
                
                lVolumeB.setText    ("Cuboid Volume                  : " + Double.toString(balok.volume()));
                add(lVolumeB);
                lVolumeB.setBounds(30, 250, 300, 30);
                
                lLuasPer.setText    ("Cuboid Surface area            : " + Double.toString(balok.luasPermukaan()));
                add(lLuasPer);
                lLuasPer.setBounds(30, 290, 300, 30);
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Silakan di isi terlebih dahulu :V");
            }
            
        }
        
        if (ae.getSource() == bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            lLuasP.setText(null);
            lKelilingP.setText(null);
            lVolumeB.setText(null);
            lLuasPer.setText(null);
        }
    }

    
    
}
    
