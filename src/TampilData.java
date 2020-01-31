
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
public class TampilData {
    SambungDB sambungan = new SambungDB();
    Scanner keyboard = new Scanner(System.in);
    
    public void TampilPaketPS(){
        System.out.println("=================================================");
        System.out.println("||               Menu Paket PS                 ||");
        System.out.println("=================================================");
        System.out.println("| Kode | Jenis PS | Waktu |       harga         |");
        System.out.println("-------------------------------------------------");
        try{
            sambungan.sate = sambungan.conn.createStatement();
            String sql_tampilPaketPS = "SELECT paket_ps,jenis_ps,waktu_perjam,harga_perjam from daftar_ps";
            ResultSet rs = sambungan.sate.executeQuery(sql_tampilPaketPS);
            while (rs.next()) {
                System.out.println("|  "+ rs.getString("paket_ps")+ "   |   " + rs.getString("jenis_ps") + "    | " + rs.getInt("waktu_perjam") + " jam |  Rp. " + rs.getDouble("harga_perjam") + "    |");
            }
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
    public void TampilDataMakanan(){
        System.out.println("=================================================");
        System.out.println("||               Menu Makanan                  ||");
        System.out.println("=================================================");
        System.out.println("| Kode |   Nama Makanan   |    Harga Makanan    |");
        System.out.println("-------------------------------------------------");
        try{
            sambungan.sate = sambungan.conn.createStatement();
            String sql_tampilmakanan = "SELECT id_makanan,nama_makanan,harga_makanan from tb_makanan";
            ResultSet rs = sambungan.sate.executeQuery(sql_tampilmakanan);
            while (rs.next()) {
                System.out.println("|  "+ rs.getString("id_makanan")+ " |  " + rs.getString("nama_makanan") + "  |  Rp. " + rs.getDouble("harga_makanan") + "    |");
            }
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
    public void TampilDataMinuman(){
        System.out.println("=================================================");
        System.out.println("||               Menu Minuman                  ||");
        System.out.println("=================================================");
        System.out.println("| Kode |   Nama Minuman   |    Harga Minuman    |");
        System.out.println("-------------------------------------------------");
        try{
            sambungan.sate = sambungan.conn.createStatement();
            String sql_tampilminuman = "SELECT id_minuman,nama_minuman,harga_minuman from tb_minuman";
            ResultSet rs = sambungan.sate.executeQuery(sql_tampilminuman);
            while (rs.next()) {
                System.out.println("|  "+ rs.getString("id_minuman")+ " |    " + rs.getString("nama_minuman") + "  |  Rp. " + rs.getDouble("harga_minuman") + "    |");
            }
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
    
    public void TampilTransaksi(){
        System.out.println("===============================================================");
        System.out.println("||              Transaksi yang Sudah Dilakukan               ||");
        System.out.println("===============================================================");
        System.out.println("| IDtransaksi | tanggal | paket | Kode makanan | kode Minuman |");
        System.out.println("---------------------------------------------------------------");
        try{
            sambungan.sate = sambungan.conn.createStatement();
            String sql_tampilPaketPS = "SELECT id_transaksi,tanggal,paket_ps,id_makanan,id_minuman from transaksi";
            ResultSet rs = sambungan.sate.executeQuery(sql_tampilPaketPS);
            while (rs.next()) {
                System.out.println("|  "+ rs.getString("id_transaksi")+ "  |  " + rs.getString("tanggal") + "  |   " + rs.getString("paket_ps") + "   |     " + rs.getString("id_makanan") + "     |     "+ rs.getString("id_minuman") + "     |");
            }
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }
}
