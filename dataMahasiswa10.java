public class dataMahasiswa10 {
    String nim;
    String nama;
    String kelas;

    public dataMahasiswa10() {
    }

    public dataMahasiswa10(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    void tampilInformasi() {
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
    }
    
}