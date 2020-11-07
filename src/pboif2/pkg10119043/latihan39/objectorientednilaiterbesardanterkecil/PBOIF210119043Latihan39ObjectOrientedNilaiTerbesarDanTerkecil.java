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
public class PBOIF210119043Latihan39ObjectOrientedNilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static String namaPetugas;
    public static int jmlhMhs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukan nama Petugas : ");
        namaPetugas = scanner.nextLine();
        
        System.out.print("Masukan banyak mahasiswa : ");
        jmlhMhs = scanner.nextInt();
        System.out.println();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.cariNilaiTerbesarTerkecil(jmlhMhs, namaPetugas);
    }
    
}
