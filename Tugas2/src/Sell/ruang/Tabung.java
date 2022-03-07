package Sell.ruang;
import Sell.bidang.Lingkaran;

    
    public class Tabung  extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (luas()*tinggi);
       
    }

    @Override
    public double luasPermukaan() {
      return (2*luas())+(Math.PI*getJari()*tinggi);
    } 
       
}

