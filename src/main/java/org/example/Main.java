package org.example;
import java.util.Scanner;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double convertToFarenheight(float celcius){
//        double celcius = celcius;
        double farenheight = (celcius * 9/5) + 32;
        return farenheight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float temp = scanner.nextFloat();
        System.out.printf("Temperature in Fahrenheit: %.2f",convertToFarenheight(temp));



    }
}