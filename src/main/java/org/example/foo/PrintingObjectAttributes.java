package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class PrintingObjectAttributes {
    public static void main(String[] args) {
        CreatingObjects.Lens objectOfLens = new CreatingObjects.Lens("sony", "85 mm", true);
        CreatingObjects.Lens canonLens = new CreatingObjects.Lens("canon", "30 mm", true);
        CreatingObjects.Lens sonyLens = new CreatingObjects.Lens("sony", "24-70 mm", true);

        System.out.println("Lens 3");
        System.out.println(sonyLens.brand);
        System.out.println(sonyLens.focalLength);
        System.out.println(sonyLens.isPrime);

        System.out.println();

        System.out.println("Lens 2");
        System.out.println(canonLens.brand);
        System.out.println(canonLens.focalLength);
        System.out.println(canonLens.isPrime);
    }

    static class Lens {
        String brand;
        String model;
        String color;
        double price;
        double weight;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {

            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

        public Lens(String brand, String model, String color, double price, double weight, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
            this.weight = weight;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
