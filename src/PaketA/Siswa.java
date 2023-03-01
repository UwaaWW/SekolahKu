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
import PaketB.Rumus;
public class Siswa extends Sekolah implements Rumus{
    private int NIS,UAS,UTS;
    Siswa(){}
    
    public void inputDataSiswa(){
        Scanner baca=new Scanner(System.in);
        System.out.print("Inputkan NIS : ");NIS=baca.nextInt();
        System.out.print("Inputkan Nama Siswa : ");nama=baca.next();
        System.out.print("Inputkan NUTS : ");UTS=baca.nextInt();
        System.out.print("Inputkan NUAS : ");UAS=baca.nextInt();
    }
    
    public int getNIS(){
        return NIS;
    }
    public String getNama(){
        return nama;
    }
    public int getUTS(){
        return UTS;
    }
    public int getUAS(){
        return UAS;
    }
    
    @Override
    public double getNilAkhir(){
        double nilAkhir=(getUTS()+getUAS())/2;
        return nilAkhir;
    }
    
    @Override
    public double getAverage(Siswa a[]){
        double rerata, jml=0;
        for(int i=0;i<a.length;i++){
            jml=jml+getNilAkhir();
        }
        rerata=jml/a.length;
        return rerata;
    }
    
    @Override
    public void sortASC(Siswa a[]){
        int n=a.length;
        double NA[] = new double[n];
        double temp;
        for(int i=0;i<n;i++){
            NA[i] = a[i].getNilAkhir();
        }
        for(int x=0; x<n; x++){
            for(int z=0; z>n-1; z++){
                if(NA[z]<NA[z+1]){
                    temp=NA[z];
                    NA[z]=NA[z+1];
                    NA[z-1]=temp;
                }
            }
        }
        System.out.println("Data Nilai Setelah Di Urutkan");
        System.out.println("----------------------------");
        for(int y=0;y<n;y++){
            System.out.println("| "+NA[y]+" +");
        }
    }
    
    public String getNilHuruf(){
        String NilHuruf;
        if(getNilAkhir()>=90)NilHuruf="A";else
        if(getNilAkhir()>=80)NilHuruf="B";else
        if(getNilAkhir()>=70)NilHuruf="C";else
        if(getNilAkhir()>=60)NilHuruf="D";else
        if(getNilAkhir()>=50)NilHuruf="E";else
            NilHuruf="F";
        return NilHuruf;
    }
    
    /**
     *
     * @param b
     */
    @Override
    public void searching(Siswa b[]){
        Scanner baca= new Scanner(System.in);
        double min,max;
        System.out.print("Nilai Minimum :");min=baca.nextDouble();
        System.out.print("Nilai Maximum :");max=baca.nextDouble();
        for(int i=0;i<b.length;i++){
            if(b[i].getNilAkhir()>min && b[i].getNilAkhir()<max){
                b[i].info();
            }
        }
    }
    
    @Override
    public void info(){
        System.out.println(String.format("%1$-5s %2$-20s %3$-13s %4$-13s %5$-13s %6$-13s %7$-2s",
            "| "+getNIS(),"| "+getNama(),"| "+getUTS(),"| "+getUAS(),"| "+getNilAkhir(),"| "+getNilHuruf()," |"));
    }
    
}
