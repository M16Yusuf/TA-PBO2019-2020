import java.util.Scanner;

/**
 *
 * @author M16yusuf
 */
public class Menutampilan {
    SambungDB sambungan = new SambungDB();
    BersihkanConsole cls = new BersihkanConsole();
    Scanner keyboard = new Scanner(System.in);
    TampilData showdata = new TampilData();
    TambahDataDB addData = new TambahDataDB();
    HapusData delData = new HapusData();
    
    
    public void MenuUtama(){
        cls.BersihkanConsole();
        System.out.println("=================================================");
        System.out.println("||   Selamat datang diaplikasi Arsip rental PS ||");
        System.out.println("=================================================");
        System.out.println("| 1. Transaksi Baru                             |");
        System.out.println("| 2. Tampilkan Transaksi yang sudah terekam     |");
        System.out.println("| 3. Opsi tambahan                              |");
        System.out.println("| 0. keluar Aplikasi                            |");
        System.out.println("-------------------------------------------------");
        System.out.print("| Masukan pilihan anda  :  "); int pilihan = keyboard.nextInt();
        switch(pilihan){
            case 0:
                System.exit(0);
                break;
            case 1:
                addData.tambahtransaksi();
                break;
            case 2:
                showdata.TampilTransaksi();
                break;
            case 3:
                MenuOpsiTambahan();
                break;    
            default:
                System.out.println("Pilihan tidak ada!");
        }
    }
    
    public void MenuOpsiTambahan(){
        cls.BersihkanConsole();
        System.out.println("=================================================");
        System.out.println("||              Opsi khusus                    ||");
        System.out.println("=================================================");
        System.out.println("| 1. Tambah data menu paketPS/Makanan/minuman   |");
        System.out.println("| 2. Hapus data paketPS/makanan/minuman         |");
        System.out.println("| 3. Lihat data paketPS/makanan/minuman         |");
        System.out.println("| 0. Kembali ke Menu utama                      |");
        System.out.println("-------------------------------------------------");
        System.out.print("| Masukan pilihan anda  :  "); int pilihan = keyboard.nextInt();
        switch(pilihan){
            case 0:
                MenuUtama();
                break;
            case 1:
                MenuTambahData();
                break;
            case 2:
                MenuHapusData();
                break;
            case 3:
                MenuLihatData();
                break;
            default:
                System.out.println("Pilihan tidak ada!");   
        }
    }
    
    
    public void MenuTambahData(){
        cls.BersihkanConsole();
        System.out.println("=================================================");
        System.out.println("||            Tambah Data Menu                 ||");
        System.out.println("=================================================");
        System.out.println("| 1. Tambah Data menu Paket PS                  |");
        System.out.println("| 2. Tambah Data Menu Makanan                   |");
        System.out.println("| 3. Tambah Data Menu Minuman                   |");
        System.out.println("| 0. Kembali ke Menu Sebelumya                  |");
        System.out.println("-------------------------------------------------");
        System.out.print("| Masukan pilihan anda  :  "); int pilihan = keyboard.nextInt();
        switch(pilihan){
            case 0:
                MenuOpsiTambahan();
                break;
            case 1:
                addData.tambahPaket();
                break;
            case 2:
                addData.TambahMakanan();
                break;
            case 3:
                addData.TambahMinuman();
                break;
            default:
                System.out.println("Pilihan tidak ada!");   
        }   
    }
    
     public void MenuHapusData(){
        cls.BersihkanConsole();
        System.out.println("=================================================");
        System.out.println("||            Hapus Data menu                  ||");
        System.out.println("=================================================");
        System.out.println("| 1. Hapus Data menu Paket PS                   |");
        System.out.println("| 2. Hapus Data Menu Makanan                    |");
        System.out.println("| 3. Hapus Data Menu Minuman                    |");
        System.out.println("| 4. Hapus Data Transaksi                       |");
        System.out.println("| 0. Kembali ke Menu Sebelumya                  |");
        System.out.println("-------------------------------------------------");
        System.out.print("| Masukan pilihan anda  :  "); int pilihan = keyboard.nextInt();
        switch(pilihan){
            case 0:
                MenuOpsiTambahan();
                break;
            case 1:
                delData.HapusPaketPS();
                break;
            case 2:
                delData.HapusMenuMakanan();
                break;
            case 3:
                delData.HapusMenuMinuman();
                break;
            case 4:
                delData.HapusTransaksi();
                break;
            default:
                System.out.println("Pilihan tidak ada!");   
        }       
     }
     
     public void MenuLihatData(){
        cls.BersihkanConsole();
        System.out.println("=================================================");
        System.out.println("||      Lihat Data Menu Yang Tersedia          ||");
        System.out.println("=================================================");
        System.out.println("| 1. Lihat Data menu Paket PS                   |");
        System.out.println("| 2. Lihat Data Menu Makanan                    |");
        System.out.println("| 3. Lihat Data Menu Minuman                    |");
        System.out.println("| 0. Kembali ke Menu Sebelumya                  |");
        System.out.println("-------------------------------------------------");
        System.out.print("| Masukan pilihan anda  :  "); int pilihan = keyboard.nextInt();
        switch(pilihan){
            case 0:
                MenuOpsiTambahan();
                break;
            case 1:
                showdata.TampilPaketPS();
                break;
            case 2:
                showdata.TampilDataMakanan();
                break;
            case 3:
                showdata.TampilDataMinuman();
                break;
            default:
                System.out.println("Pilihan tidak ada!");   
        }   
    }
    
}
