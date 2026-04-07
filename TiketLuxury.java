class TiketLuxury extends Tiket {
    public TiketLuxury(String kodeBooking, Kereta kereta){
        super(kodeBooking, kereta);
    }

    @Override
    double hitungHarga(){
        return kereta.getHargaDasar() + 300000;
    }

    @Override
    public String getJenis(){
        return "Luxury";
    }
}