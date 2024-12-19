/*
* File: CylinderCalculator.java
* Author: Mihucza Gergő
* Copyright: 2021, Mihucza Gergő
* Group: Szoft II-2-N
* Date: 2024-12-18
* Github: https://github.com/MihuczaGergo
* Licenc: MIT
*/
public class CylinderCalculator {
    public double calculateSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }
}
