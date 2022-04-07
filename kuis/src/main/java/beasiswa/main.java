package beasiswa;
import java.util.Scanner;
import beasiswa.BeasiswaMahasiswa;
import beasiswa.BeasiswaPelajar;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("selvi");
        System.out.println("123200026");
        
        System.out.println("Menu utama");
        System.out.println("1.Beasiswa Mahasiswa");
        System.out.println("2.Beasiswa Pelajar");
        System.out.println("pilih : ");
        int pilih = input.nextInt();
        
        if(pilih == 1){
            //input ketika edit
            System.out.println("Nilai struktur dan konten esai");
            int strukkon = data.nextInt();
            System.out.println("Teknik visualisasi");
            int tekvisul = data.nextInt();
            System.out.println("kemampuan design thinking");
            int kemdes = data.nextInt();
        
        do{
            //untuk beasiswa mahasiswa
            System.out.println("Menu");
            System.out.println("1.Edit");
            System.out.println("2.Tampilkan");
            System.out.println("3.Exit");
            System.out.println("pilih");
            int pilihmenu = input.nextInt();
        
        
            if (pilihmenu == 1) {
                System.out.println("Data");
                System.out.println("1.Nama Lengkap");
                String nama = data.next();
                System.out.println("2.Usia");
                int usia = data.next();
                System.out.println("3.Jenis Program Beasiswa");
                int jenis = data.next();
            }
            else if (pilihmenu == 2){
                System.out.println("1.Nilai yang diperoleh");
                System.out.println("2.Hasil Seleksi");
            }
            else {
                break;
            }
        }while(true);  
        
        }else if(pilih == 2){
            do{
           //untuk beasiswa pelajar
            System.out.println("Nilai struktur dan konten jurnal");
            int strukonju = data.nextInt();
            System.out.println("relevansi data");
            int reldat = data.nextInt();
            System.out.println("kemampuan problem solving");
            int kemprob = data.nextInt();
            
            
            //untuk beasiswa pelajar
             System.out.println("Menu");
            System.out.println("1.Edit");
            System.out.println("2.Tampilkan");
            System.out.println("3.Exit");
            System.out.println("pilih");
            int pilihmenu = input.nextInt();
        
        
            if (pilihmenu == 1) {
                System.out.println("Data");
                System.out.println("1.Nama Lengkap");
                String nama = data.next();
                System.out.println("2.Usia");
                int usia = data.next();
                System.out.println("3.Jenis Program Beasiswa");
                int jenis = data.next();
            }
            else if (pilihmenu == 2){
                System.out.println("1.Nilai yang diperoleh");
                System.out.println("2.Hasil Seleksi");
            }
            else {
                break;
            }
        }while(true);
        }
    }
    
}
    

