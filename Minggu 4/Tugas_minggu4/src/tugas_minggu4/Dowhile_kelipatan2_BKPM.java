/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu4;

/**
 *
 * @author Lenovo
 */
public class Dowhile_kelipatan2_BKPM {
    public static void main(String[] args) {

        System.out.println("                Do_While                         ");
        System.out.println("        Bilangan Kelipatan 2 (1-100)             ");
        System.out.println("=================================================");

        int i = 1;
        int angka= 1;
        do {
            angka *= 2;
            System.out.print(angka + " ");
            i++;
        } while (i <= 6);

    }
}

