/*
* File: Solution.java
* Author: Mihucza Gergő
* Copyright: 2021, Mihucza Gergő
* Group: Szoft II-2-N
* Date: 2024-12-18
* Github: https://github.com/MihuczaGergo
* Licenc: MIT
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Készítette: Mihucza Gergő");

        
        System.out.print("Kérem, adja meg a henger sugarát (r): ");
        double radius = scanner.nextDouble();

        
        System.out.print("Kérem, adja meg a henger hosszát (h): ");
        double height = scanner.nextDouble();

        
        CylinderCalculator calculator = new CylinderCalculator();
        double surfaceArea = calculator.calculateSurfaceArea(radius, height);

        
        System.out.printf("A henger felszíne: %.2f\n", surfaceArea);

        
        scanner.close();
    }
}
