package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class CreatingObjects {
    public static void main(String[] args) {
        Lens objectOfLens = new Lens("sony", "85 mm", true);
        Lens canonLens = new Lens("canon", "30 mm", true);
        Lens sonyLens = new Lens("sony", "24-70 mm", true);
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {

            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
