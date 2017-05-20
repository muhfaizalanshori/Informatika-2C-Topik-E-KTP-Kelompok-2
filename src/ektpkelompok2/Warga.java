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
        
public Warga(String nikWarga, String namaWarga, String ttlWarga, String jenisWarga, String goldarahWarga, String alamatWarga, String agamaWarga, String stsperkawinanWarga, String pekerjaanWarga, String kewarganegaraanWarga, String berlakuWarga){
    setNik(nikWarga);
    setNama(namaWarga);
    setTtl(ttlWarga);
    setJenis(jenisWarga);
    setgolDarah(goldarahWarga);
    setAlamat(alamatWarga);
    setAgama(agamaWarga);
    setstsPerkawinan(stsperkawinanWarga);
    setPekerjaan(pekerjaanWarga);
    setKewarganegaraan(kewarganegaraanWarga);
    setBerlaku(berlakuWarga);
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

public void setJenis(String jenisWarga) {
    this.jenis = jenisWarga;
}
    
public String getjenis() {
    return jenis;
}
    
public void setgolDarah(String goldarahWarga) {
    this.goldarah = goldarahWarga;
}
    
public String getgolDarah() {
    return goldarah;
}
    
public void setAlamat(String alamatWarga) {
    this.alamat = alamatWarga;
}
    
public String getAlamat() {
    return alamat;
}
    
public void setAgama(String agamaWarga) {
    this.agama = agamaWarga;
}
    
public String getAgama() {
    return agama;
}
    
public void setstsPerkawinan(String stsperkawinanWarga) {
    this.stsperkawinan = stsperkawinanWarga;
}
    
public String getstsPerkawinan() {
    return stsperkawinan;
}
    
public void setPekerjaan(String pekerjaanWarga) {
    this.pekerjaan = pekerjaanWarga;
}
    
public String getPekerjaan() {
    return pekerjaan;
}
    
public void setKewarganegaraan(String kewarganegaraanWarga) {
    this.kewarganegaraan = kewarganegaraanWarga;
}
    
public String getKewarganegaraan() {
    return kewarganegaraan;
}
    
public void setBerlaku(String berlakuWarga) {
    this.berlaku = berlakuWarga;
}
    
public String getberlaku() {
    return berlaku;
}        

@Override
public int compareTo(Warga w) {
        if(nik.compareTo(w.getNik()) < 0 ) return -1;
        if (nik.compareTo(w.getNik()) == 0) return 0;          
        if(nama.compareTo(w.getNama()) < 0 ) return -1;
        if (nama.compareTo(w.getNama()) == 0) return 0;          
        if(ttl.compareTo(w.getTtl()) < 0 ) return -1;
        if (ttl.compareTo(w.getTtl()) == 0) return 0;
        if(jenis.compareTo(w.getjenis()) < 0 ) return -1;
        if (jenis.compareTo(w.getjenis()) == 0) return 0;
        if(goldarah.compareTo(w.getgolDarah()) < 0 ) return -1;
        if (goldarah.compareTo(w.getgolDarah()) == 0) return 0;
        if(alamat.compareTo(w.getAlamat()) < 0 ) return -1;
        if (alamat.compareTo(w.getAlamat()) == 0) return 0;
        if(agama.compareTo(w.getAgama()) < 0 ) return -1;
        if (agama.compareTo(w.getAgama()) == 0) return 0;
        if(stsperkawinan.compareTo(w.getstsPerkawinan()) < 0 ) return -1;
        if (stsperkawinan.compareTo(w.getstsPerkawinan()) == 0) return 0;
        if(pekerjaan.compareTo(w.getPekerjaan()) < 0 ) return -1;
        if (pekerjaan.compareTo(w.getPekerjaan()) == 0) return 0;
        if(kewarganegaraan.compareTo(w.getKewarganegaraan()) < 0 ) return -1;
        if (kewarganegaraan.compareTo(w.getKewarganegaraan()) == 0) return 0;
        if(berlaku.compareTo(w.getberlaku()) < 0 ) return -1;
        if (berlaku.compareTo(w.getberlaku()) == 0) return 0;
return 1;
}

}
    

