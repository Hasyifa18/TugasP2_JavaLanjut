class TiketLuxury extends Tiket {
    public TiketLuxury(String kodeBooking, String tujuan, double harga){
        super(kodeBooking, tujuan, harga);
    }

    @Override
    double hitungHarga(){
        return harga + 300000;
    }

    @Override
    public String getJenis(){
        return "Luxury";
    }
}