import java.io.*;
import java.util.ArrayList;

public class QuanLyNhanSu {
    private ArrayList<NhanVien> danhSach;

    public QuanLyNhanSu() {
        this.danhSach = new ArrayList<>();
    }
    public void themNhanVien(NhanVien nv) {
        this.danhSach.add(nv);
    }
    public void inDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (NhanVien nv : this.danhSach) {
            System.out.println("Ten: " + nv.getTen() + ", Luong: " + nv.tinhLuong());
        }
    }
    public void luuFile(String tenFile) {
        try (FileOutputStream fos = new FileOutputStream(tenFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(this.danhSach);
            oos.flush();
            System.out.println("Luu file thanh cong: " + tenFile);

        } catch (IOException e) {
            System.out.println("Loi khi luu file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public void docFile(String tenFile) {
        try (FileInputStream fis = new FileInputStream(tenFile);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            this.danhSach = (obj == null) ? new ArrayList<>() : (ArrayList<NhanVien>) obj;
            System.out.println("Doc file thanh cong: " + tenFile);

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file de doc! Tao danh sach moi.");
            this.danhSach = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
            e.printStackTrace();
            if (this.danhSach == null) {
                this.danhSach = new ArrayList<>();
            }
        }
    }
}
