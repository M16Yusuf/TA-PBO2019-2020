
import java.util.Scanner;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M16Yusuf
 */
public class HapusData {
    SambungDB sambungan = new SambungDB();
    BersihkanConsole cls = new BersihkanConsole();
    Scanner keyboard = new Scanner(System.in);
    TampilData showdata = new TampilData();
    
    public void HapusTransaksi(){
        cls.BersihkanConsole();
        System.out.println("|=============================================================|");
        System.out.println("|                    Hapus Data Transaksi                     |");
        System.out.println("|=============================================================|");
        showdata.TampilTransaksi();
        System.out.print("| Masukan ID Transaksi yang akan di hapus : ");
        try{
            String input = keyboard.nextLine();
            sambungan.sate = sambungan.conn.createStatement();
            String sql_hapusTransaksi = "DELETE FROM transaksi where id_transaksi='" +input+ "'";
            sambungan.sate.execute(sql_hapusTransaksi);
            cls.BersihkanConsole();
            showdata.TampilTransaksi();
            System.out.println("|-------------------------------------------------------------|");
            System.out.println("|  TRANSAKSI DENGAN ID TRANSAKSI " + input + " TELAH DIHAPUS  |");
            System.out.println("|-------------------------------------------------------------|");
            
            
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
    
    public void HapusPaketPS(){
        cls.BersihkanConsole();
        System.out.println("|===============================================|");
        System.out.println("|            Hapus Menu Paket PS                |");
        System.out.println("|===============================================|");
        showdata.TampilPaketPS();
        System.out.print("| Masukan kode Paket yang akan di hapus : ");
        try{
            String input = keyboard.nextLine();
            sambungan.sate = sambungan.conn.createStatement();
            String sql_hapusPaket = "DELETE FROM daftar_ps where paket_ps='" +input+ "'";
            sambungan.sate.execute(sql_hapusPaket);
            cls.BersihkanConsole();
            showdata.TampilPaketPS();
            System.out.println("|-----------------------------------------------|");
            System.out.println("| PAKET PS DENGAN KODE "+input+" TELAH DIHAPUS  |");
            System.out.println("|-----------------------------------------------|");
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
    public void HapusMenuMakanan(){
        cls.BersihkanConsole();
        System.out.println("|===============================================|");
        System.out.println("|            Hapus Menu Makanan                 |");
        System.out.println("|===============================================|");
        showdata.TampilDataMakanan();
        System.out.print("| Masukan kode Makanan yang akan di hapus : ");
        try{
            String input = keyboard.nextLine();
            sambungan.sate = sambungan.conn.createStatement();
            String sql_hapusmakanan = "DELETE FROM tb_makanan where id_makanan='" +input+ "'";
            sambungan.sate.execute(sql_hapusmakanan);
            cls.BersihkanConsole();
            showdata.TampilDataMakanan();
            System.out.println("|-----------------------------------------------|");
            System.out.println("|     MAKANAN DENGAN KODE "+input+" TELAH DIHAPUS     |");
            System.out.println("|-----------------------------------------------|");
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
    public void HapusMenuMinuman(){
         cls.BersihkanConsole();
        System.out.println("|===============================================|");
        System.out.println("|            Hapus Menu Minuman                 |");
        System.out.println("|===============================================|");
        showdata.TampilDataMinuman();
        System.out.print("| Masukan kode Minuman yang akan di hapus : ");
        try{
            String input = keyboard.nextLine();
            sambungan.sate = sambungan.conn.createStatement();
            String sql_hapusMinuman = "DELETE FROM tb_minuman where id_minuman='" +input+ "'";
            sambungan.sate.execute(sql_hapusMinuman);
            cls.BersihkanConsole();
            showdata.TampilDataMinuman();
            System.out.println("|-----------------------------------------------|");
            System.out.println("|     MINUMAN DENGAN KODE "+input+" TELAH DIHAPUS     |");
            System.out.println("|-----------------------------------------------|");
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
}
