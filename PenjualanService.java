class PenjualanService {
    public void cetakTiket(Penumpang p, Tiket t, Pembayaran pembayaran) {
        System.out.println("===== E - TIKET KERETA API =====");
        t.tampilInfo(p);
        
        double total = t.hitungHarga();
        pembayaran.bayar(total);
        System.out.println("Harga             : Rp " + (int)total);
        

        System.out.println("======== Selamat Jalan ========\n");
    }
}