/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

/**
 *
 * @author SYARIF
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private Double ipk;
    
    //Buat inteface untukmengambil dan menset nilai atribusi
    //method setter
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setIpk(Double ipk){
        if(ipk >=0.0 && ipk<=4.0){
        this.ipk = ipk;
        }
        else{
            System.out.println("Error Nilai Diluar Range");
        }
    }
     public String getNim(){
        return this.nim;
    }
    public String getNama(){
        return this.nama;
    }
     public String getProdi(){
        return this.prodi;
    }
      public Double getIpk(){
        return this.ipk;
    }
      public void TampilData(){
          System.out.println("Data Mahasiswa");
          System.out.println("Nim = "+this.nim);
          System.out.println("Nim = "+this.nama);
          System.out.println("Nim = "+this.prodi);
          System.out.println("Nim = "+this.ipk);
      }
}
