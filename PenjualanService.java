class PenjualanService {
    public void cetakTiket(Penumpang p, Tiket t) {
        System.out.println("===== E - TIKET KERETA API =====");
        t.tampilInfo(p);
        System.out.println("Harga        : Rp " + (int)t.hitungHarga());
        System.out.println("======== Selamat Jalan ========\n");
    }
}