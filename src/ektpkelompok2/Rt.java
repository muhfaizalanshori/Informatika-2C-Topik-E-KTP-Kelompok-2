
package ektpkelompok2;


public class Rt implements Comparable<Rt>{
    private Warga warga, warga2, warga3, warga4, warga5;
    
    public Rt(Warga warga){
        this.warga = warga;   
    }
    
       public Rt(Warga warga,Warga warga2 ){
        this.warga = warga;
        this.warga2 = warga2;
    }
       public Rt(Warga warga,Warga warga2,Warga warga3 ){
        this.warga = warga;
        this.warga2 = warga2;
        this.warga3 = warga3;
    }
          public Rt(Warga warga,Warga warga2,Warga warga3, Warga warga4 ){
        this.warga = warga;
        this.warga2 = warga2;
        this.warga3 = warga3;
        this.warga4 = warga4;
    }
           public Rt(Warga warga,Warga warga2,Warga warga3, Warga warga4, Warga warga5 ){
        this.warga = warga;
        this.warga2 = warga2;
        this.warga3 = warga3;
        this.warga4 = warga4;
        this.warga5 = warga5;
           }
    
    public void setWarga(Warga warga){
        this.warga= warga;
    }
    
    public Warga getWarga(){
        return warga;
    }
    
    public void setWarga2(Warga warga2){
        this.warga2= warga2;
    }
    
    public Warga getWarga2(){
        return warga2;
    }
      public void setWarga3(Warga warga3){
        this.warga3= warga3;
    }
    
    public Warga getWarga3(){
        return warga3;
    }
    public void setWarga4(Warga warga4){
    this.warga4= warga4;
    }
    
    public Warga getWarga4(){
        return warga4;
    }
      public void setWarga5(Warga warga5){
        this.warga5= warga5;
    }
    public Warga getWarga5(){
        return warga5;
    }
    
    @Override
public int compareTo(Rt r) {
return 1;
    
}
}
