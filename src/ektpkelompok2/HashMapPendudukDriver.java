/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektpkelompok2;

/**
 *
 * @author FAISTAR
 */
public class HashMapPendudukDriver {
    
        public static void main(String[] args) {
HashMap<String, Warga> dau = new HashMap<>();
dau.put("best seller", new Warga("Java", "Agus"));
dau.put("new", new Warga("C++", "Bagus"));
//metode 1
for(warga a : dau.values()){
System.out.println(a.getNama()); //tanpa cetak key
}
    
}
