package ektpkelompok2;

import java.util.ArrayList;
//import java.util.Iterator;


public class Penduduk {
    
    public static void main(String[] args) {
        ArrayList <Warga> wrg = new ArrayList<Warga>();
        ArrayList <Rt> rt = new ArrayList<Rt>();
        
      
        wrg.add(new Warga("001", "Muh. Faizal Anshori", "Tulungagung, 21 April 1997", "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("002", "Septian Rio",         "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("004", "Iwang",         "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("005", "Ridi", "Tulungagung, 21 April 1997", "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("006", "Malik",         "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));

        wrg.add(new Warga("003", "Falianda", "Tanggerang, 8 Agustus 1998"));
        wrg.add(new Warga("004", "M. yusuf Iwang", "Lamongan, 29 Januari 1998"));
        wrg.add(new Warga("005", "Malik Fajar", "Manado, 9 juni 1997"));
       
       /* rt.add(new Rt (wrg.get(3)));
        
        for (Rt r: rt ){
            System.out.println(r.getWarga().getNama()+"\n");
         */   
            
        
        for(Warga w: wrg ){
            System.out.print(w.getNik()+"\t");
            System.out.print(w.getNama()+"\t");
            System.out.print(w.getTtl()+"\t");
            System.out.print(w.getjenis()+"\t");
            System.out.print(w.getAlamat()+"\t");
            System.out.print(w.getAgama()+"\t");
            System.out.print(w.getstsPerkawinan()+"\t");
            System.out.print(w.getPekerjaan()+"\t");
            System.out.print(w.getKewarganegaraan()+"\t");
            System.out.println(w.getberlaku());
            
            
        /*    
        for(String nik: wrg0 ){
            System.out.println(nik);
         */
        /*
        Iterator it = wrg0.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        
        }
        */
        }
    }
    }
}
