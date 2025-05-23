public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa10() {
    }

    public Mahasiswa10(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilinformasi() {
        System.out.println("NIM:\t " + nim + "\t" + "Nama:\t" + nama + "\t" + "Kelas:\t" + kelas + "\t" + "IPK:\t" + ipk);
    }
    
}