class ByrTransfer implements Pembayaran {
    @Override
    public void bayar(double jumlah){
        System.out.println("Metode Pembayaran : Transfer");
        //System.out.println("Jumlah Bayar  : " + (int)jumlah);
    }
}
