/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class LinierEquationMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input\t: ");
        String masukkan = input.nextLine();
        String[] angka = masukkan.split("\\s");
        double Angka[] = new double[angka.length];
        for (int i = 0; i < angka.length; i++) {
            Angka[i] = Double.parseDouble(angka[i]);
        }
        if (Angka.length == 9) {
            LinierEquation test1 = new LinierEquation(Angka[0], Angka[1], Angka[2], Angka[3], Angka[6], Angka[7]);
            LinierEquation test2 = new LinierEquation(Angka[0], Angka[1], Angka[4], Angka[5], Angka[6], Angka[8]);
            LinierEquation test3 = new LinierEquation(Angka[2], Angka[3], Angka[4], Angka[5], Angka[7], Angka[8]);
            test1.output();
            test1.getPersamaan(angka[0], angka[1], angka[6]);
            test2.getPersamaan(angka[2], angka[3], angka[7]);
            test3.getPersamaan(angka[4], angka[5], angka[8]);
            test1.hasil();
            test1.cekSolusi();
            test2.cekSolusi();
            test3.cekSolusi();
        } else {
            LinierEquation test = new LinierEquation();
            test.output();
            test.getPersamaan(angka[0], angka[1], angka[4]);
            test.getPersamaan(angka[2], angka[3], angka[5]);
            test.setA(Angka[0]);
            test.setB(Angka[1]);
            test.setC(Angka[2]);
            test.setD(Angka[3]);
            test.setE(Angka[4]);
            test.setF(Angka[5]);
            test.hasil();
            test.cekSolusi();
        }
    }
}