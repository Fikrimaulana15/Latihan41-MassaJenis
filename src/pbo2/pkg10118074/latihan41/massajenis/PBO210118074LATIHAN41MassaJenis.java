/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan41.massajenis;

    import java.util.Scanner;
/**
 *
 * @author ASUS
 * NAMA     :fikri maulana
 * KELAS    :if-2
 * NIM      :10118074
 */
public class PBO210118074LATIHAN41MassaJenis {

        private static int volume, massaJenis;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
        Scanner scanner = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        kubus.setSisi(scanner.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scanner.nextInt());
        
        volume = kubus.hitungVolume(kubus.getSisi());
        massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + massaJenis);
        
        System.out.println("Developed by fikri maulana4"
                + "10");
    }   
    
}