
import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList10 sll = new SingleLinkedList10();

        System.out.print("Masukkan jumlah data yang ingin dimasukkan : ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i+1));
            System.out.print("NIM\t:");
            String nim = sc.nextLine();
            System.out.print("Nama\t:");
            String nama = sc.nextLine();
            System.out.print("Kelas\t:");
            String kelas = sc.nextLine();
            System.out.print("IPK\t:");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            System.out.println();
        }
        
        sll.print();
    }
}
