/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Hansel Vallerio H
 */
public class hitungBMI {
    double bmi, bb, tb;
    
    public hitungBMI (double bb, double tb) {
        this.bb = bb;
        this.tb = tb;
    }
    
    void rumus () {
        bmi = bb / (tb * tb);
        System.out.println("BMI = Berat Badan : Tinggi Badan^2");
        System.out.println("BMI = "+bb+" : "+tb+"^2");
    }
    
    void status () {
        if (bmi < 18.5) {
            System.out.println("Status Berat Badan : Kekurangan berat badan");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status Berat Badan : Normal (ideal)");
        } else if (bmi >=25 && bmi <= 29.9) {
            System.out.println("Status Berat Badan : Kelebihan berat badan");
        } else {
            System.out.println("Status Berat Badan : Kegemukan (obesitas)");
        }
    }
    
    double getBMI () {
        return bmi;
    }
}
