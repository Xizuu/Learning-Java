package me.raihanpratama.belajarjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Scanner;

public class Contoh {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Hai, apa yang ingin kamu tanyakan?");

            while (true) {
                System.out.print("Masukkan pertanyaan: ");
                String pertanyaan = scanner.nextLine();

                URL url = new URL("https://aemt.me/bard?text=" + pertanyaan.replace(" ", "%20"));
                URLConnection connection = url.openConnection();
                connection.connect();

                try (java.io.InputStream inputStream = connection.getInputStream()) {
                    ObjectMapper mapper = new ObjectMapper();
                    Map response = mapper.readValue(inputStream, Map.class);

                    if (response.containsKey("result")) {
                        System.out.println(response.get("result"));
                    } else {
                        System.out.println("Key 'result' not found in API response.");
                    }
                }
            }
        }
    }
}
