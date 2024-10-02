import java.util.Scanner;

public class Pemilihan2Percobaan424 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hari, tipeBuku;
        int totalDiskon = 0, hargaBuku = 20000, totalHarga, totalBuku;

        System.out.print("Masukkan Hari\t\t: ");
        hari = input.nextLine();
        System.out.print("Masukkan Tipe Buku\t: ");
        tipeBuku = input.nextLine();
        System.out.print("Masukkan Total Buku\t: ");
        totalBuku = input.nextInt();

        if(hari.equalsIgnoreCase("rabu") && tipeBuku.equalsIgnoreCase("kamus")) {
            totalDiskon += 10;
            if(totalBuku > 2) {
                totalDiskon += 2;
            }
        } else if(hari.equalsIgnoreCase("rabu") && tipeBuku.equalsIgnoreCase("novel")) {
            totalDiskon += 7;
            if(totalBuku > 3) {
                totalDiskon += 2;
            }
        } else if(hari.equalsIgnoreCase("rabu") && totalBuku > 3) {
            totalDiskon += 5;
        }

        totalHarga = totalBuku * hargaBuku;
        totalHarga -= totalHarga * totalDiskon /100;

        System.out.println("---- Output ----\nTotal Harga \tRp." + totalHarga + "\nTotal Diskon \t" + totalDiskon + "%");
    }
}