/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camilan.Camilan;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
public class SayurController {
    
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
    @RequestMapping("/input")
    @ResponseBody
    public String getHasil(HttpServletRequest data ){
        String getNama = data.getParameter("nmSayur");
        int getHarga = Integer.parseInt(data.getParameter("harga"));
        int getJumlah = Integer.parseInt(data.getParameter("jumlah"));
        int getBayar = Integer.parseInt(data.getParameter("bayar"));
        
        //SayurController ctr = new SayurController();
       

         int program = hitung(getHarga, getJumlah);
        return "Nama Sayur         : " + getNama +"<br>" + 
                "Harga             : " + String.valueOf(getHarga) +"<br>" +
                "Jumlah            : " + String.valueOf(getJumlah) +"<br>" +
                "Total discount    : " + String.valueOf(program)+"<br>" +
                "Total dibayar     : " + String.valueOf(getBayar-program)+"<br>" +
                "uang customer     : " + String.valueOf(getBayar) +"<br>" +
                "Kembalian         : " + String.valueOf(getBayar-(getBayar-program)) ;
    }
}
    

