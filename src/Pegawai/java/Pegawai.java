/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pegawai.java;

/**
 *
 * @author puput
 */
public class Pegawai {
    private String nama;
    private static int jumlahPegawai;
    //Overloading constructor
    //opsi 1
    public Pegawai(String nama){
        Pegawai.jumlahPegawai++;
        this.nama = nama;
    }
    
    //opsi 2
    public Pegawai(){
        Pegawai.jumlahPegawai++;
        this.nama = "pegawai" + Pegawai.jumlahPegawai;
    }
    
    void show(){
        System.out.println("Nama : " + this.nama);
    }
}
