/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaketA;

/**
 *
 * @author LENOVO
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ujisekolah {
    public static void main(String[]args){
        boolean kondisi = true;
        int pil;
        Sekolah v_Sek=new Sekolah();
        Guru gur[]=new Guru[3];
        Siswa sis[]=new Siswa[3];
        Scanner baca=new Scanner(System.in);
        try{
        while (kondisi){
        System.out.println("MENU SISTEM INFORMASI SEKOLAH");
        System.out.println("===============================");
        System.out.println("1. Input Data SEKOLAH");
        System.out.println("2. Input Data GURU");
        System.out.println("3. Tampil Data GURU");
        System.out.println("4. Input Data SISWA");
        System.out.println("5. Tampil Data SISWA");
        System.out.println("6. Menghitung Rerata NILAI SISWA");
        System.out.println("0. Keluar Program");
        System.out.print("Tentukan pilihan : ");pil = baca.nextInt();
        System.out.println("-----------------------");
            switch (pil) {
                case 1:{
                    v_Sek.info();
                    System.out.println("***************************************************");
                    break;
                }
                case 2:{
                    for(int i=0;i<gur.length;i++){
                        gur[i]= new Guru();
                        gur[i].setDataGuru();
                    }
                    break;
                }
                case 3:{
                    for(int i=0;i<gur.length;i++){
                        gur[i].infoGuru();
                    }
                    break;
                }
                case 4:{
                    for(int i=0;i<sis.length;i++){
                        sis[i]=new Siswa();
                        sis[i].inputDataSiswa();
                    }
                    break;
                }
                case 5:{
                    System.out.println("|-----+--------------------+-------------+-------------+-------------+--------------|");
                    System.out.println(String.format("%1$-5s %2$-20s %3$-13s %4$-13s %5$-13s %6$-13s %7$-2s",
                    "| NIS","| NAMA SISWA","| N UTS","| N UAS","| N AKHIR","| NILAI HURUF"," |"));
                    System.out.println("|-----+--------------------+-------------+-------------+-------------+--------------|");
                    for(int i=0;i<sis.length;i++){
//                        sis[i]=new Siswa();
                        sis[i].info();
                    }
                    System.out.println("|-----+--------------------+-------------+-------------+-------------+--------------|");
                    break;
                }
                case 6:{
                    double rata2=sis[1].getAverage(sis);
                    System.out.println("Rata Nilai Kelas : "+rata2);
                    break;
                }
                case 0:{
                    kondisi=false;
                    break;
                }
            }
        }   
        }catch(InputMismatchException e){
            System.out.print("Terdapat Kesalahan exceptsi" + e);
        }
    }
}

