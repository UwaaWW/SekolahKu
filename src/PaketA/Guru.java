/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaketA;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Guru extends Sekolah{
    private int NIP;
    private String mapel;
    
    Guru(){}
    
    public void setDataGuru(){
        Scanner baca = new Scanner (System.in);
        System.out.print("input NIP :"); this.NIP=baca.nextInt();
        System.out.print("input Nama Guru :");this.nama=baca.next();
        System.out.print("Input Mata Pelajaran :");this.mapel=baca.next();
    }
    
    public int getNIP(){
        return NIP;
    }
    public String getNama(){
        return nama;
    }
    public String getMapel(){
        return mapel;
    }
    public void infoGuru(){
        System.out.println(String.format("%1$-5s %2$-20s %3$-20s %4$-2s","| "+getNIP(),"| "+getNama(),"| "+getMapel()," |"));
    }
}
