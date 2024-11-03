/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Hansel Vallerio H
 */
public class hasilBMI {
    public static void main(String[] args) {
        hitungBMI htngBMI = new hitungBMI(62, 1.62);
        System.out.println("================= Body Mass Index Calculation =================");
        htngBMI.rumus();
        System.out.println("BMI = "+htngBMI.getBMI());
        htngBMI.status();
        System.out.println("===============================================================");
    }
}
