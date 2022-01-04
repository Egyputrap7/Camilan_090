/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camilan.Camilan;

/**
 *
 * @author asus
 */
public class ClassProses {
        public int hitung(int harga, int jumlah){
        int discount;
        int total = harga * jumlah;
        
        
        if(total < 16000){
            discount = total * 0/100;
            //total = total - discount;
           
        }else if (total < 25000){
            discount = total * 10/100;
            //total = total-discount;
        }else{
            discount = total * 15/100;
            //total = total-discount;
            
        }
        return  discount ;
        
    }
}
