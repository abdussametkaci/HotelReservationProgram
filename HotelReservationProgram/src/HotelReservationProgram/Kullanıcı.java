package HotelReservationProgram;

import java.util.ArrayList;

public class Kullanıcı {
    String ad , soyad , email, cinsiyet , kullanıcıAdı , şifre, tc, tel, odayıTuttuğuTarihlerarası;
    int yaş, fatura;
    Otel otel;
    Oda oda;
    
    ArrayList<String> aldığıHizmetler = new ArrayList();
    
    public Kullanıcı(){
        
    }
    
    public Kullanıcı(String ad, String soyad, String email, String cinsiyet, String tel, String tc, int yaş){
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.tel = tel;
        this.tc = tc;
        this.yaş = yaş;
    }
    
    public Kullanıcı(String ad, String soyad, String email, String cinsiyet, String tel, String tc, int yaş, String kullanıcıAdı, String şifre){
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.tel = tel;
        this.tc = tc;
        this.yaş = yaş;
        this.kullanıcıAdı = kullanıcıAdı;
        this.şifre = şifre;
    }
    
    public boolean müşteriBilgileriBoşMu(){
        return oda == null && otel == null;
    }
    

}
