package ektpkelompok2;

    public class Warga implements Comparable<Warga> {
private String nik;
private String nama;
private String ttl;
private String jeniskelamin;
private String goldarah;
private String alamat;
private String agama;
private String stsperkawinan;
private String pekerjaan;
private String kewarganegaraan;
private String berlaku;

public Warga(String nikWarga, String namaWarga, String ttlWarga){
setNik(nikWarga);
setNama(namaWarga);
setTtl(ttlWarga);
}

public void setNik(String nikWarga){
    this.nik = nikWarga;
}
public String getNik(){
return nik;
}
public void setNama(String namaWarga) {
this.nama = namaWarga;
}
public String getNama() {
return nama;
}
public void setTtl(String ttlWarga) {
this.ttl = ttlWarga;
}
public String getTtl() {
return ttl;
}
//selanjutnya belum


@Override
public int compareTo(Warga w) {
return 1;
}

}
    

