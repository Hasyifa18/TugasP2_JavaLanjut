class ByrTunai implements Pembayaran{
    @Override
    public void bayar(double jumlah){
        System.out.println("Metode Pembayaran : Tunai");
        //System.out.println("Jumlah Bayar  : " + (int)jumlah);
    }
}
