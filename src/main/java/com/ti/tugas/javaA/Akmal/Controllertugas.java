/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ti.tugas.javaA.Akmal;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER_64
 */

@Controller
public class Controllertugas {
    
    
    
    @RequestMapping("/viewbayar")
    public String inputanuser(HttpServletRequest data, Model buah){
        
        prosesClass pc = new prosesClass();
        
        String nbuah = data.getParameter("var_namabuah");
        String hbuah = data.getParameter("var_hargakilo");
        String jbuah = data.getParameter("var_jumlahbeli");
        String customer = data.getParameter("var_uang");
        
        Double hargabuah = pc.getharga(jbuah);
        Double jumlahbuah = pc.getjumlah(hbuah);
        Double bayar = pc.getbayar(customer);
        Double jumlahbayar = pc.getjumlahbayar(hargabuah, jumlahbuah);
        String disc = pc.getdisc(jumlahbayar);
        
        Double hargadiskon = pc.gethargadisc(jumlahbayar, Integer.valueOf(disc));
        Double totalbayar =  pc.gettotalbayar(jumlahbayar, hargadiskon);
        String back = pc.getUang(bayar,totalbayar );
        
        buah.addAttribute("kembalian", back);
        buah.addAttribute("uang",customer);
        buah.addAttribute("name",nbuah);
        buah.addAttribute("price",hbuah);
        buah.addAttribute("kilo",jbuah);
        buah.addAttribute("tbayar",totalbayar);
        buah.addAttribute("hargadisc",hargadiskon);
        buah.addAttribute("disc",disc);
        buah.addAttribute("total10",jumlahbayar);
        return "Akmal";
    }
}
