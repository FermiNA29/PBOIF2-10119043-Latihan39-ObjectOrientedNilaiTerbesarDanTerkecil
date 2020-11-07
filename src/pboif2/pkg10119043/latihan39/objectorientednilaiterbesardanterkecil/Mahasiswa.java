/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan39.objectorientednilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program mencari nilai terbesar dan terkecil dengan object oriented
 */
public class Mahasiswa {
    private int min, max;
    
    public int[] inputNilai(int jmlhMhs) {
        Scanner scanner = new Scanner(System.in);
        int[] nilaiMhs = new int[jmlhMhs];
        for(int i=0; i<jmlhMhs; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            int nilai = scanner.nextInt();
            nilaiMhs[i] = nilai;
        }
        return nilaiMhs;
    }
    
    private void hasilNilaiTerbesarTerkecil(int[] nilaiMhs, String petugas) {
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        min = nilaiMhs[0];
        max = nilaiMhs[0];
        for (int i=0; i<nilaiMhs.length;i++) {
            System.out.println("Nilai mahasiswa ke-"+i+" : "+nilaiMhs[i]);
            if(max < nilaiMhs[i]){
                max = nilaiMhs[i];
            } else if (min > nilaiMhs[i]){
                min = nilaiMhs[i];
            }
        }
       
        System.out.println();
        System.out.println("Nilai terbesar : " + max);
        System.out.println("Nilai terkecil : " + min);
        System.out.println();
        System.out.println("Petugas : " + petugas);
    }
    
    public void cariNilaiTerbesarTerkecil(int jmlhMhs, String namaPetugas) {
            hasilNilaiTerbesarTerkecil(inputNilai(jmlhMhs), namaPetugas);
    }
}
