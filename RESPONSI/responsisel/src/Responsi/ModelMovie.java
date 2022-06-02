package Responsi;

import java.sql.*;
import javax.swing.JOptionPane;
public class ModelMovie {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/movie_db";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;
    
    public ModelMovie () {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
    
        }
    
    }

public String[][] readContact(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][5]; 
            
            String query = "SELECT * FROM movie"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("judul"); //harus sesuai judul kolom di mysql
                data[jmlData][1] = String.valueOf(resultSet.getDouble("alur"));                
                data[jmlData][2] = String.valueOf(resultSet.getDouble("penokohan"));
                data[jmlData][3] = String.valueOf(resultSet.getDouble("akting"));
                data[jmlData][4] = String.valueOf(resultSet.getDouble("nilai"));
                jmlData++;
            }
            return data;
            
            }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

public void insertData(String judul, double alur, double penokohan, double akting, double nilai){
        int jmlData=0;
        try {
           String query = "SELECT * FROM movie WHERE judul='" + judul+"'"; 
           System.out.println(judul + " " + alur + " " + penokohan + " " + akting);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {
                query = "INSERT INTO movie(judul,alur,penokohan,akting,nilai) VALUES('"+judul+"','"+alur+"','"+penokohan+"','"+akting+"','"+nilai+"')";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

public void updateData(String judul, double alur, double penokohan, double akting, double nilai){
        int jmlData=0;
         try {
           String query = "SELECT * FROM movie WHERE judul='" + judul+"'"; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE movie SET  akting='" + akting + "', alur='" + alur + "', penokohan='" + penokohan + "', nilai='"+ nilai+"' WHERE judul='" + judul+"'"; 
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "SELECT * FROM movie";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void deleteContact (String judul) {
        try{
            String query = "DELETE FROM movie WHERE judul = '"+judul+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}

            
