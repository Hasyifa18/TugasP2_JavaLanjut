class Penumpang {
    private String id;
    private String nama;
    private String noTlp;
    
    public Penumpang(String id, String nama, String noTlp){
        this.id = id;
        this.nama = nama;
        this.noTlp = noTlp;
    }

    public String getId(){
        return id;
    }

    public String getNama(){
        return nama;
    }

    public String getNoTlp(){
        return noTlp;
    }
}