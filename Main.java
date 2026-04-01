public class Main {
    public static void main(String[] argas) {
        Penumpang p1 = new Penumpang("001", "Thomas", "089000000001");
        Penumpang p2 = new Penumpang("002", "Hasyifa", "089000000002");
        Penumpang p3 = new Penumpang("003", "Cellomita", "089000000003");

        Tiket t1 = new TiketEkonomi ("BK0001", "Bandung", 150000);
        Tiket t2 = new TiketBisnis ("BK0002", "Yogyakarta", 150000);
        Tiket t3 = new TiketLuxury ("BK0003", "Surabaya", 150000);

        Pembayaran bayar1 = new ByrTunai();
        Pembayaran bayar2 = new ByrTransfer();

        PenjualanService service = new PenjualanService();

        service.cetakTiket(p1, t1, bayar1);
        service.cetakTiket(p2, t2, bayar1);
        service.cetakTiket(p3, t3, bayar2);
    }
}