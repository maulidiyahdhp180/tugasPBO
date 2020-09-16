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
public class Main {
    public static void main(String[] args){
        //overloading pada constructor
        Pegawai p1 = new Pegawai("Maulidiyah Dwi Hernita P.");
        Pegawai p2 = new Pegawai ();
        Pegawai p3 = new Pegawai ();
        Pegawai p4 = new Pegawai("Widya Artikasari");
        
        p1.show();
        p2.show();
        p3.show();
        p4.show();
        
        //overloading methods
        
        int a = PBO.tambah(1, 19);
        System.out.println(a);
        double b = PBO.tambah(1, 0.98);
        System.out.println(b);
    }
}
