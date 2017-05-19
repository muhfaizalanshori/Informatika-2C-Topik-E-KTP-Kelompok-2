package ektpkelompok2;

import java.util.ArrayList;
//import java.util.Iterator;


public class Penduduk {
    
    public static void main(String[] args) {
        ArrayList <Warga> wrg = new ArrayList<Warga>();
        ArrayList <Rt> rt = new ArrayList<Rt>();
        
      
        wrg.add(new Warga("001", "Muh. Faizal Anshori", "Tulungagung, 21 April 1997"));
        wrg.add(new Warga("002", "Septian Rio", "Tulungagung, 2 juni 1997"));
        wrg.add(new Warga("003", "Falianda", "Tanggerang, 8 Agustus 1998"));
        wrg.add(new Warga("004", "M. yusuf Iwang", "Lamongan, 29 Januari 1998"));
        wrg.add(new Warga("005", "Malik Fajar", "Manado, 9 juni 1997"));
       
        rt.add(new Rt (wrg.get(3)));
        
        for (Rt r: rt ){
            System.out.println(r.getWarga().getNama()+"\n");
            
            
        
        for(Warga w: wrg ){
            System.out.print(w.getNik()+"\t");
            System.out.print(w.getNama()+"\t");
            System.out.println(w.getTtl());
            
            
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
