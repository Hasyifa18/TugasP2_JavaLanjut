import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("001", "Thomas", "089000000001");
        Penumpang p2 = new Penumpang("002", "Hasyifa", "089000000002");
        Penumpang p3 = new Penumpang("003", "Cellomita", "089000000003");

        Map<String, Kereta> daftarKereta = new HashMap<>();

        daftarKereta.put("K1", new Kereta("K1", "Argo Parahyangan", "Bandung - Jakarta", 135000));
        daftarKereta.put("K2", new Kereta("K2", "Bima", "Bandung - Yogyakarta", 250000));

        Pembayaran bayar1 = new ByrTunai();
        Pembayaran bayar2 = new ByrTransfer();
        PenjualanService service = new PenjualanService();
        
        try{
            Kereta k1 = daftarKereta.get("K1");
            Kereta k2 = daftarKereta.get("K5");

            Tiket t1 = new TiketEkonomi("BK001", k1);
            Tiket t2 = new TiketBisnis("BK002", k2);
            Tiket t3 = new TiketLuxury("BK003", k2);

            service.cetakTiket(p1, t1, bayar1);
            service.cetakTiket(p2, t2, bayar2);
            service.cetakTiket(p3, t3, bayar2);
        } catch (Exception e) {
            System.out.println("TERJADI KESALAHAN, SILAHKAN CEK KEMBALI\n");
        }     
    }
}