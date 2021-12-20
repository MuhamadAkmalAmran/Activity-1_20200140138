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
        String nbuah = data.getParameter("var_namabuah");
        String hbuah = data.getParameter("var_hargakilo");
        Integer chbuah = Integer.valueOf(hbuah);
        String jbuah = data.getParameter("var_jumlahbeli");
        Double cjbuah = Double.valueOf(jbuah);
        Double jumlahbayar = chbuah * cjbuah;
        Double totalbayar = null;
        Integer diskon = 0;
        Double hargadiskon = 0.0;

        if(jumlahbayar < 16000){
            totalbayar = jumlahbayar - (jumlahbayar*0/100);
            hargadiskon = jumlahbayar*diskon/100;
            
        }else if( jumlahbayar < 25000){
            diskon = 10;
            totalbayar = jumlahbayar - (jumlahbayar*10/100);
            hargadiskon = jumlahbayar*diskon/100;
        }else {
            diskon = 15;
            totalbayar = jumlahbayar - (jumlahbayar*diskon/100);
            hargadiskon = jumlahbayar*diskon/100;
        }
        
        buah.addAttribute("name",nbuah);
        buah.addAttribute("price",chbuah);
        buah.addAttribute("kilo",cjbuah);
        buah.addAttribute("tbayar",totalbayar);
        buah.addAttribute("discountrp",hargadiskon);
        buah.addAttribute("disc",diskon);
        buah.addAttribute("total10",jumlahbayar);
        return "Akmal";
    }
}
