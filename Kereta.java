class Kereta {
    private String kode;
    private String namaKereta;
    private String rute;
    private double hargaDasar;

    public Kereta(String kode, String namaKereta, String rute, double hargaDasar){
        this.kode = kode;
        this.namaKereta = namaKereta;
        this.rute = rute;
        this.hargaDasar = hargaDasar;
    }

    public String getKode(){
        return kode;
    }

    public String getNamaKereta(){
        return namaKereta;
    }

    public String getRute(){
        return rute;
    }

    public double getHargaDasar(){
        return hargaDasar;
    }
}