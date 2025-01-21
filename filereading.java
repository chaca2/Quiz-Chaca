package quizcaca;

import java.io.*;

public class filereading {

    public static void main(String[] args) {
        String fileName = "data.txt";  // Nama file yang akan dibaca

        // Membuka file dan membaca data
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Memproses setiap baris (misal: mengonversi ke angka)
                try {
                    int number = Integer.parseInt(line);
                    System.out.println("Number: " + number);
                } catch (NumberFormatException e) {
                    System.err.println("Kesalahan parsing: " + line + " bukan angka yang valid.");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan: " + fileName);
        } catch (IOException e) {
            System.err.println("Kesalahan I/O saat membaca file: " + e.getMessage());
        } finally {
            System.out.println("Proses pembacaan file selesai.");
        }
    }
}