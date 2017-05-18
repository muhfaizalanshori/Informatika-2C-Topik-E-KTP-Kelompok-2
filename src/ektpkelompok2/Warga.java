package ektpkelompok2;
/**
 *
 * @author FAISTAR
 */
    public class Warga implements Comparable<Warga> {
private int nik;
private String nama;
private String tempatlahir;
private String tgllahir;
private String jeniskelamin;
private String goldarah;
private String alamat;
private String agama;
private String stsperkawinan;
private String pekerjaan;
private String kewarganegaraan;
private String berlaku;

public Warga(int nikWarga, String namaWarga, String tempatlahirWarga){
setNik(nikWarga);
setNama(namaWarga);
setTempatlahir(tempatlahirWarga);
}

public void setNik(int nikWarga){
    this.nik = nikWarga;
}
public int getNik(){
return nik;
}
public void setNama(String namaWarga) {
this.nama = namaWarga;
}
public String getNama() {
return nama;
}
public void setTempatlahir(String tempatlahirWarga) {
this.tempatlahir = tempatlahirWarga;
}
public String getTempatlahir() {
return tempatlahir;
}


@Override
public int compareTo(Warga w) {
if(nama.compareTo(w.getNama()) < 0 ) return -1;
if (nama.compareTo(w.getNama()) == 0) return 0;
return 1;
}

}
    

