package ektpkelompok2;

import.java.util.Warga;
/**
 *
 * @author FAISTAR
 */
public class Penduduk {
    
    public static void main(String[] args) {
Warga<Penduduk> dau  = new Warga<>();
dau.add(new Penduduk("Java","Agus"));
dau.add(new Penduduk("C++","Bagus"));
//Metode 1
for(Penduduk b:dau){
System.out.println(w.getNama());
}
}
}