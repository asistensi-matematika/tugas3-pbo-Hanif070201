/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author OWNER
 */
public class LinierEquation {

    private double a, b, c, d, e, f;

    public LinierEquation() {
    }

    public LinierEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public String hitungX() {
        double x;
        x = (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
        String X = String.format("%.2f", x);
        return X;
    }

    public String hitungY() {
        double y;
        y = (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
        String Y = String.format("%.2f", y);
        return Y;
    }

    public void output() {
        System.out.println();
        System.out.println("Output\t:");
        System.out.println("Sistem Persamaannya:");
    }

    public void getPersamaan(String p, String q, String r) {
        double cek = Double.parseDouble(q);
        if (cek >= 0) {
            System.out.println(p + "x" + " + " + q + "y = " + r);
        } else {
            String[] Q;
            Q = q.split("\\-");
            System.out.println(p + "x" + " - " + Q[1] + "y = " + r);
        }
    }

    public void hasil() {
        System.out.println();
        System.out.println("Hasilnya:");
    }

    public void cekSolusi() {
        if ((getA() * getD() - getB() * getC()) == 0) {
            System.out.println("Sistem tidak memiliki penyelesaian.");
        } else {
            System.out.println("x = " + hitungX() + " , " + "y = " + hitungY());
        }
    }
}