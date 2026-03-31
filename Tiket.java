abstract class Tiket {
    protected String kodeBooking;
    protected String tujuan;
    protected double harga;

    public Tiket(String kodeBooking, String tujuan, double harga) {
        this.kodeBooking = kodeBooking;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    abstract String getJenis();
    abstract double hitungHarga();

    public void tampilInfo(Penumpang p){
        System.out.println("Kode Booking : " + kodeBooking);
        System.out.println("Nama         : " + p.getNama());
        System.out.println("Tujuan       : " + tujuan);
        System.out.println("Jenis Tiket  : " + getJenis());
    }
}
