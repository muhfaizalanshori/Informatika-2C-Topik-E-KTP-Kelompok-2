package ektpkelompok2;

import java.util.*;


public class Penduduk {
    
    private static ArrayList<Warga> desa1rt1 = new ArrayList();
    private static ArrayList<Warga> desa1rt2 = new ArrayList();
    private static ArrayList<Warga> desa1rt3 = new ArrayList();
    private static ArrayList<Warga> desa1rt4 = new ArrayList();
    private static ArrayList<Warga> desa2rt1 = new ArrayList();
    private static ArrayList<Warga> desa2rt2 = new ArrayList();
    private static ArrayList<Warga> desa2rt3 = new ArrayList();
    private static ArrayList<Warga> desa2rt4 = new ArrayList();
    
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,e;
        String data1,data2,data3,data4,data5,data6,data7,data8,data9, data10;
        do {            
            System.out.println("\tPendaftaran Penduduk\n");
            System.out.println("1. Masukan Data Desa 1");
            System.out.println("2. Masukan Data Desa 2");
            System.out.println("3. Daftar Data Warga Desa");
            System.out.println("4. Cek Data Warga setelah di Urutkan");
            System.out.println("5. Keluar");
            System.out.print("Pilih Kategori: ");a=scan.nextInt();
            if(a==1){
                System.out.println("\n\tDesa 1");
                System.out.println("RT 1");           
                System.out.println("RT 2");
                System.out.println("RT 3");
                System.out.println("RT 4");
                System.out.println("Pilih RT");b=scan.nextInt();scan.nextLine();
    
    
    
    
    
   
    
    
    
    
   /* public static void main(String[] args) {
        ArrayList <Warga> wrg = new ArrayList<Warga>();
        ArrayList <Rt> rt = new ArrayList<Rt>();
        
      
        wrg.add(new Warga("001", "Muh. Faizal Anshori", "Tulungagung, 21 April 1997", "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("002", "Septian Rio",         "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("003", "Falianda PW"   , "Tulungagung, 21 April 1997", "P", "O", "Pasar Kemis", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("004", "Yusuf Iwang"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("005", "Ridi Pratama"  , "Tulungagung, 21 April 1997", "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("006", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("007", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("008", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("009", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("010", "Riyantu K"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("011", "Sirril A"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("012", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("013", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("014", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("015", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("016", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("017", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("018", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("019", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("020", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("021", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("022", "Malik Fajar"   , "Tulungagung, 2 juni 1997" ,  "L", "A", "Ngunut", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        wrg.add(new Warga("023", "Falianda P W" , "Tangerang, 26 Maret 1998" , "P", "O", "Pasar Kemis", "Islam" , "Belum kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
       
       /* rt.add(new Rt (wrg.get(3)));
        
        for (Rt r: rt ){
            System.out.println(r.getWarga().getNama()+"\n");
         */   
            
        /*
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
        
        }
    }
    } */
} 
