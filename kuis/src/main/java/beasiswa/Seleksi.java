package beasiswa;


public class Seleksi implements BeasiswaMahasiswa,BeasiswaPelajar {
    double a,b,c,x,y,z;
    String ket;
    double hasil;
    
public Seleksi(double strukkon, double tekvisual, double kemdes,double strukkonju,double reldat,double kompro) {
        this.a = strukkon;
        this.b = tekvisual;
        this.c = kemdes;
        this.x = strukkonju;
        this.y = reldat;
        this.z = kompro;
    }

    

    @Override
    public double strukkon() {
        x= x*0.5;
    return x;}

    @Override
    public double tekvisual() {
        y = y*0.2;
        return y;
             
     }

    @Override
    public double kemdes() {
        z = z*0.3;
        return z;
    }

    @Override
    public double strukkonju() {
        a = a*0.6;
        return a;
    }

    @Override
    public double reldat() {
        b = b*0.25;
        return b;
    }

    @Override
    public double kompro() {
        c = c*0.15;
        return c;
    }
    
    @Override
    public double hasilmahasiswa() {
        hasil = strukkon()+reldat()+kompro();
        return hasil;}
    
    @Override
    public double hasilpelajar() {
        hasil = strukkonju()+strukkonju()+kemdes();
        return hasil;  }
}

