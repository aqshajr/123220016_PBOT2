/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author ACER
 */
public class balok implements OperasiBalok{

    private double panjang, lebar, tinggi;
    
    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    //ambil nilai panjang
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    //ambil nilai lebar
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    //ambil nilai tinggi
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    //perhitungan
    @Override
    public double Volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double Lp() {
        return 2*((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
    }
    
}