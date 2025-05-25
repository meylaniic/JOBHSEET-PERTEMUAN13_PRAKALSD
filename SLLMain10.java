public class SLLMain10 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        SingleLinkedList10 sll = new SingleLinkedList10();
        Mahasiswa10 mhs1 = new Mahasiswa10("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa10 mhs2 = new Mahasiswa10("23212201", "Bimon", "2B", 3.8);
        Mahasiswa10 mhs3 = new Mahasiswa10("22212202", "Cintia ", "3C", 3.5);
        Mahasiswa10 mhs4 = new Mahasiswa10("21212203", "Dirga", "4D", 3.6);

        sll.addLast(mhs4);
        sll.addLast(mhs3);
        sll.addLast(mhs2);
        sll.addLast(mhs1);

        System.out.println("Data index 1: ");
        sll.getData(1);
        System.out.println("Data mahasiswa Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();


        /*System.out.print("Masukkan jumlah data yang ingin dimasukkan : ");
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
        
        sll.print(); */
    }
}
