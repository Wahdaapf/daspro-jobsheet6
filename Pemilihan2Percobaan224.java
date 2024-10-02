import java.util.Scanner;

public class Pemilihan2Percobaan224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        double diskon = 0, totalBayar = 0;
        int harga = 0;

        System.out.println("----------------------------------------");
        System.out.println("============= MENU KAFE JTI ============");
        System.out.println("----------------------------------------");
        System.out.println("1. RiceBowl\n2. Ice Tea\n3. Paket Bunding (RiceBowl + Ice Tea)");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan Nomor Menu yang mau Dipilih\t: ");
        int menu = input24.nextInt();
        input24.nextLine();
        System.out.print("Apakah Punya Member\t\t\t: ");
        String member = input24.nextLine();
        System.out.println("----------------------------------------");

        if(member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon\t\t\t\t: 10%");
            if(menu == 1) {
                harga = 14000;
                System.out.println("Harga RiceBowl\t\t\t\t: " + harga);
            } else if(menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea\t\t\t\t: " + harga);
            } else if(menu == 3) {
                harga = 15000;
                System.out.println("Paket Bunding (RiceBowl + Ice Tea)\t: " + harga);
            } else {
                System.out.println("Menu tidak ada didalam daftar");
                return;
            }
            totalBayar = harga - (harga * diskon);
        } else if(member.equalsIgnoreCase("n")) {
            if(menu == 1) {
                harga = 14000;
                System.out.println("Harga RiceBowl\t\t\t\t: " + harga);
            } else if(menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea\t\t\t\t: " + harga);
            } else if(menu == 3) {
                harga = 15000;
                System.out.println("Paket Bunding (RiceBowl + Ice Tea)\t: " + harga);
            } else {
                System.out.println("Menu tidak ada didalam daftar");
                return;
            }
            totalBayar = harga;
        } else {
            System.out.println("Member Tidak Valid");
        }

        System.out.print("Apakah Membayar Menggunakan QRIS?\t: ");
        boolean qris = input24.nextBoolean();

        System.out.println("----------------------------------------");
        
        if(qris == true) {
            System.out.println("Mendapatkan Potongan dari QRIS Rp.1000");
            totalBayar -= 1000;
        }

        System.out.println("----------------------------------------");

        System.out.printf("Total Bayar \t\t\t\t: %s", totalBayar);
        System.out.println("\n----------------------------------------");
    }
}