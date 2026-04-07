class TiketEkonomi extends Tiket {
    public TiketEkonomi(String kodeBooking, Kereta kereta){
        super(kodeBooking, kereta);
    }

    @Override
    double hitungHarga(){
        return kereta.getHargaDasar();
    }

    @Override
    public String getJenis(){
        return "Ekonomi";
    }
}