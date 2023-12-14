package me.raihanpratama.belajarjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Scanner;

public class Bard {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Hai, apa yang ingin kamu tanyakan?");

            while (true) {
                System.out.print("Masukkan pertanyaan: ");
                String pertanyaan = scanner.nextLine();

                if (pertanyaan.isEmpty()) {
                    System.out.println("Pertanyaan tidak boleh kosong.");
                    continue;
                }

                if (pertanyaan.equals("selesai")) {
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                }

                URL url = new URL("https://aemt.me/bard?text=" + pertanyaan.replace(" ", "%20"));
                URLConnection connection = url.openConnection();
                connection.connect();

                try (java.io.InputStream inputStream = connection.getInputStream()) {
                    ObjectMapper mapper = new ObjectMapper();
                    Map response = mapper.readValue(inputStream, Map.class);

                    if (response.get("status").equals(true)) {
                        System.out.println(response.get("result"));
                    } else {
                        System.out.println("Key 'result' not found in API response.");
                    }
                }
            }
        }
    }
}
