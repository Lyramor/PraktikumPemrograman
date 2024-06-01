package Tubes;

public class TambahNasabah extends AbstractNasabahStack {

    public TambahNasabah(int capacity) {
        super(capacity);
    }

    public void tambahNasabah(String deskripsi, int rekening) {
        push(new DataNasabah(deskripsi, rekening));
    }

    public DataNasabah batalkanNasabah() {
        return pop();
    }

    public void tampilkanNasabah() {
        displayStack();
    }
}

