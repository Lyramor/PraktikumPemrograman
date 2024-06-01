package Tubes;

public class DataNasabah {
    private String deskripsi;
    private int rekening;

    public DataNasabah(String deskripsi, int rekening) {
        this.deskripsi = deskripsi;
        this.rekening = rekening;
    }

    public String toString() {
        return "Data Nasabah{deskripsi='" + deskripsi + "', rekening=" + rekening + "}";
    }
}
