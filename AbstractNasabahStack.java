package Tubes;

public abstract class AbstractNasabahStack {
    protected DataNasabah[] arr;
    protected int capacity;
    protected int TOP;

    public final int MIN = -1;

    public AbstractNasabahStack(int capacity) {
        arr = new DataNasabah[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public void push(DataNasabah transaksi) {
        if (!isFull()) {
            TOP++;
            arr[TOP] = transaksi;
        } else {
            System.out.println("Stack Penuh ... ");
        }
    }

    public DataNasabah pop() {
        DataNasabah transaksi = null;
        if (!isEmpty()) {
            transaksi = arr[TOP];
            TOP--;
        } else {
            System.out.println("Stack Kosong ... ");
        }
        return transaksi;
    }

    public boolean isFull() {
        return TOP == (capacity - 1);
    }

    public boolean isEmpty() {
        return TOP == MIN;
    }

    public int size() {
        return TOP + 1;
    }

    public DataNasabah top() {
        return isEmpty() ? null : arr[TOP];
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Tidak ada data nasabah.");
        } else {
            for (int i = TOP; i > MIN; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
