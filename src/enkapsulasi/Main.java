/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;
import datamodel.Mahasiswa;
/**
 *
 * @author SYARIF
 */
public class Main {
    static Mahasiswa mhs1, mhs2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     mhs1 = new Mahasiswa();
     mhs1.setNim("111");
     mhs1.setNama("syarif");
     mhs1.setProdi("Sistem Informasi");
     mhs1.setIpk(7.0);
     
        System.out.println("NIM = "+mhs1.getNim());
        System.out.println("NAMA = "+mhs1.getNama());
        System.out.println("Prodi = "+mhs1.getProdi());
        System.out.println("IPK = "+mhs1.getIpk());
    }
    
}
