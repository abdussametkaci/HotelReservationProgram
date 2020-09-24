package HotelReservationProgram;

import java.util.ArrayList;

public class Otel {
    String ad, şehir;
    
    ArrayList<Oda> odalar = new ArrayList();
    
    public Otel(){
        
    }
    
    public Otel(String ad, String şehir){
        this.ad = ad;
        this.şehir = şehir;
    }
    
    @Override
    public String toString() {
        return ad; //To change body of generated methods, choose Tools | Templates.
    }
    

}
