
import java.util.Scanner;
import java.sql.*;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M16Yusuf
 */
public class TambahDataDB { 
    SambungDB sambungan = new SambungDB();
    BersihkanConsole cls = new BersihkanConsole();
    Scanner keyboard = new Scanner(System.in);
    TampilData showdata = new TampilData();
    java.util.Date tgl = new java.util.Date();
    SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
    
    public void tambahtransaksi(){
        String tanggal = format.format(tgl);   
        cls.BersihkanConsole();
        System.out.println("|===============================================|");
        System.out.println("|               Transaksi baru                  |");
        System.out.println("|===============================================|");
        
        try{
            sambungan.sate  = sambungan.conn.createStatement();
            String sql_getIdTransaksi  = "SELECT * FROM transaksi";
            ResultSet Res       = sambungan.sate.executeQuery(sql_getIdTransaksi);
            Res.last();
            String id_transaksi = tanggal+(Res.getRow()+1);
            showdata.TampilPaketPS();
            System.out.print("Masukan Kode paket PS : "); String paket_ps = keyboard.nextLine();
            showdata.TampilDataMakanan();
            System.out.print("Masukan Kode Makanan  : "); String id_makanan = keyboard.nextLine();
            showdata.TampilDataMinuman();
            System.out.print("Masukan Kode Minuman  : "); String id_minuman = keyboard.nextLine();
            
            String sql_tambahTransaksi = "INSERT INTO transaksi VALUES('" +id_transaksi+ "','" +tanggal+ "','" +paket_ps+ "','" +id_makanan+ "','" +id_minuman+ "' );";
            sambungan.sate.execute(sql_tambahTransaksi);
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }    
    }
    
    public void tambahPaket(){
        cls.BersihkanConsole();
        System.out.println("|==============================================|");
        System.out.println("|         tambah Menu Paket PS baru            |");
        System.out.println("|==============================================|");
        
        try{
            showdata.TampilPaketPS();
            System.out.print("Masukan Kode Paket PS baru : "); String paket_ps = keyboard.nextLine();
            System.out.print("Masukan Jenis PS           : "); String jenis_ps = keyboard.nextLine();
            System.out.print("Masukan Waktu Perjam (Tulis angka saja) : "); int waktu_perjam = keyboard.nextInt();
            System.out.print("Masukan Harga paket        : "); double harga_perjam = keyboard.nextDouble();
            
            sambungan.sate = sambungan.conn.createStatement();
            String Sql_tambahMenuPaket = "INSERT INTO daftar_ps VALUES('" +paket_ps+ "','" +jenis_ps+ "','" +waktu_perjam+ "','" +harga_perjam+ "' );";
            sambungan.sate.execute(Sql_tambahMenuPaket);
            cls.BersihkanConsole();
            showdata.TampilPaketPS();
            System.out.println("|-----------------------------------------------|");
            System.out.println("|          PAKET BERHASIL DITAMBAHKAN           |");
            System.out.println("|-----------------------------------------------|");
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }    
    }
    
    public void TambahMakanan(){
        cls.BersihkanConsole();
        System.out.println("|===============================================|");
        System.out.println("|          tambah Menu Makanan Baru             |");
        System.out.println("|===============================================|");
        
        try{
            showdata.TampilDataMakanan();
            System.out.print("Masukan Kode Makanan baru : "); String id_makanan = keyboard.nextLine();
            System.out.print("Masukan Nama Makanan      : "); String nama_makanan = keyboard.nextLine();
            System.out.print("Masukan Harga Makanan     : "); double harga_makanan = keyboard.nextDouble();
            
            sambungan.sate = sambungan.conn.createStatement();
            String Sql_tambahMakanan = "INSERT INTO tb_makanan VALUES('" +id_makanan+ "','" +nama_makanan+ "','" +harga_makanan+ "' );";
            sambungan.sate.execute(Sql_tambahMakanan);
            cls.BersihkanConsole();
            showdata.TampilDataMakanan();
            System.out.println("|-----------------------------------------------|");
            System.out.println("|        MAKANAN BERHASIL DITAMBAHKAN           |");
            System.out.println("|-----------------------------------------------|");
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }    
    }
    
    public void TambahMinuman(){
        cls.BersihkanConsole();
        System.out.println("|===============================================|");
        System.out.println("|          tambah Menu Minuman Baru             |");
        System.out.println("|===============================================|");
        
        try{
            showdata.TampilDataMinuman();
            System.out.print("Masukan Kode Minuman baru : "); String id_minuman = keyboard.nextLine();
            System.out.print("Masukan Nama Minuman      : "); String nama_minuman = keyboard.nextLine();
            System.out.print("Masukan Harga Minuman     : "); double harga_minuman = keyboard.nextDouble();
            
            sambungan.sate = sambungan.conn.createStatement();
            String Sql_tambahMinuman = "INSERT INTO tb_minuman VALUES('" +id_minuman+ "','" +nama_minuman+ "','" +harga_minuman+ "' );";
            sambungan.sate.execute(Sql_tambahMinuman);
            cls.BersihkanConsole();
            showdata.TampilDataMinuman();
            System.out.println("|-----------------------------------------------|");
            System.out.println("|        MINUMAN BERHASIL DITAMBAHKAN           |");
            System.out.println("|-----------------------------------------------|");
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        }    
    }
}
