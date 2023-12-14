package me.raihanpratama.belajarjava;

import java.util.HashMap;
import java.util.Map;

public class Kasir {

    protected static final Map<String, Integer> barangBarang = new HashMap<>();

    public static void main(String[] args) {
        barangBarang.put("Mie", 3500);
        barangBarang.put("Sabun", 4000);
        barangBarang.put("Shampoo", 8000);
        barangBarang.put("Air Mineral", 3000);
    }
}
