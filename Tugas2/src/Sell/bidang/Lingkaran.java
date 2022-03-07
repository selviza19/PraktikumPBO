package Sell.bidang;

public class Lingkaran implements MenghitungBidang{
         private double jariJari;

    public Lingkaran(double jari) {
        this.jariJari = jari;
    }
    public double getJari() {
        return jariJari;
    }

    public void setJari(double jari) {
        this.jariJari = jari;
    }
    
    @Override
    public double luas() {
         if((jariJari % 7) == 0)            //untuk fungsi jika jari jari bisa di bagi 7
        {
         return (22*jariJari*jariJari)/7;
        }
        else                                //untuk fungsi jika jari jari tidak habis di bagi 7
        {
                
         return 3.14*jariJari*jariJari;    
        }
    }
    
    @Override
    public double keliling() {
      if((jariJari % 7) == 0)              //untuk fungsi jika jari jari bisa di bagi 7
        {
         return (22*2*jariJari)/7;
        }
          else                             //untuk fungsi jika jari jari bisa di bagi 7
         {
         return 3.14*2*jariJari;          
         }
    }
  
}

