package tugas3.bidang;

public class PersegiPanjang implements MenghitungBidang {
     private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return (panjang + lebar)*2;
    }
    
    
}
    
