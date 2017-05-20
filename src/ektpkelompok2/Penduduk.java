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
                
                 if(b==1){
                    System.out.println("\tRT 1");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();                 
                    desa1rt1.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8);
                }
                else if (b==2) {
                    System.out.println("\tRT 2");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa1rt2.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8));
                }
                else if (b==3) {
                    System.out.println("\tRT 3");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa1rt3.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8));
                }
                else if (b==4){
                    System.out.println("\tRT 4");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa1rt4.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8));
                }
            }
                else if(a==2){
                System.out.println("\n2\tDesa 2");
                System.out.println("RT 1");
                System.out.println("RT 2");
                System.out.println("RT 3");
                System.out.println("RT 4");
                System.out.println("Pilih RT");c=scan.nextInt();scan.nextLine();
                if(c==1){
                    System.out.println("\tRT 1");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa2rt1.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8));
                }
                else if (c==2) {
                    System.out.println("\tRT 2");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa2rt3.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8));
                }
                else if (c==3) {
                    System.out.println("\tRT 3");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa2rt3.add(new Warga(data1, data2, data3, data4, data5, data6, data7, data8));
                }
                else if (c==4){
                    System.out.println("\tRT 4");
                    System.out.print("Nik : ");data1=scan.nextLine();
                    System.out.print("Nama : ");data2=scan.nextLine();
                    System.out.print("TTL : ");data3=scan.nextLine();
                    System.out.print("Jenis Kelamin : ");data4=scan.nextLine();          
                    System.out.print("Alamat : ");data5=scan.nextLine();
                    System.out.print("Agama : ");data6=scan.nextLine();
                    System.out.print("Pekerjaan : ");data7=scan.nextLine();
                    System.out.print("Kewarganegaraan : ");data8=scan.nextLine();  
                    desa2rt4.add(new Warga (data1, data2, data3, data4, data5, data6, data7, data8));
                }
            }
    
    
    
    
    
   
    
    
    
  
            
       
} 
