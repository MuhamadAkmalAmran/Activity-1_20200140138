/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ti.tugas.javaA.Akmal;

/**
 *
 * @author USER_64
 */
public class prosesClass {
    
    public Double getharga(String hbuah){
       
        Double hargabuah = Double.valueOf(hbuah);
        
        return hargabuah;
    }
    
    public Double getjumlah(String jbuah){
    
        Double jumlahbuah = Double.valueOf(jbuah);
    
        return jumlahbuah;
    }
    
    public Double gettotalbayar(Double jbayar, Double hdiskon){
    
        Double tbayar = jbayar - hdiskon;
        
        return tbayar;
    }
    
    public Double getjumlahbayar(Double hbuah, Double jbuah){
    
        Double jbayar = hbuah * jbuah;
    
        return jbayar;
    }
    
    public String getdisc(Double jbayar){
    
        String disc = null;
        
        if (jbayar <16000) {
            disc = "0";
        }else if (jbayar <25000){
            disc = "10";
        }else{
            disc = "15";
        }
        return disc;
    }
    
    public Double gethargadisc(Double jbayar, Integer disk){
        
        Double hdiskon = jbayar*disk/100;
    
        return hdiskon;
    }
    
    public void gettdiskon(Double tbayar, Double jumbayar, Double hdiskon, Integer diskon){
        
        if(jumbayar < 16000){
            diskon = 0;
            tbayar = jumbayar - (jumbayar*diskon/100);
            hdiskon = jumbayar*diskon/100;
            
        }else if( jumbayar < 25000){
            diskon = 10;
            tbayar = jumbayar - (jumbayar*diskon/100);
            hdiskon = jumbayar*diskon/100;
        }else {
            diskon = 15;
            tbayar = jumbayar - (jumbayar*diskon/100);
            hdiskon = jumbayar*diskon/100;
        }
    }
    
    public String getUang(double ucustomer, double tharga){
        double kembalian = 0.0;
        
        if(ucustomer >tharga){
            kembalian = ucustomer - tharga;
            return  "Uang kembalian Rp."  +kembalian;
        }else if(ucustomer <tharga){
             kembalian = tharga - ucustomer;
            return   "Jumlah Kekurangan Rp." +kembalian;
        }else{
            return  "Uang anda sudah pas" ;
        }
    }
    
    public Double getbayar(String customer){
        
        Double bayar = Double.valueOf(customer);
        
        return bayar;
    
    }
}
