class TiketBisnis extends Tiket {
    public TiketBisnis(String kodeBooking, Kereta kereta){
        super(kodeBooking, kereta);
    }

    @Override
    double hitungHarga(){
        return kereta.getHargaDasar() + 100000;
    }

    @Override
    public String getJenis(){
        return "Bisnis";
    }
}