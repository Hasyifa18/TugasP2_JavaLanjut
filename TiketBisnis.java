class TiketBisnis extends Tiket {
    public TiketBisnis(String kodeBooking, String tujuan, double harga){
        super(kodeBooking, tujuan, harga);
    }

    @Override
    double hitungHarga(){
        return harga;
    }

    @Override
    public String getJenis(){
        return "Bisnis";
    }
}