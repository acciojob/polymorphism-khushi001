package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(5, 3);

        p.product(2, 4, 3);

        p.product(2.5, 1.5);
    }
    public static class Product {
        public void product(int x, int y) {
            System.out.println( x * y);
        }

        public void product(int x, int y, int z) {
            System.out.println( x * y * z);
        }

        public void product(double x, double y) {
            System.out.println( x * y);
        }
    }
}


