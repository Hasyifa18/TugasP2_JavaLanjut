abstract class Tiket {
    protected String kodeBooking;
    protected Kereta kereta;

    public Tiket(String kodeBooking, Kereta kereta) {
        this.kodeBooking = kodeBooking;
        this.kereta = kereta;
    }

    abstract String getJenis();
    abstract double hitungHarga();

    public void tampilInfo(Penumpang p){
        System.out.println("Kode Booking      : " + kodeBooking);
        System.out.println("Nama              : " + p.getNama());
        System.out.println("Kereta            : " + kereta.getNamaKereta());
        System.out.println("Rute              : " + kereta.getRute());
        System.out.println("Jenis Tiket       : " + getJenis());
    }
}
