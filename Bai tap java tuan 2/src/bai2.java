
public class bai2 {
    private String maSach;
    private String tenSach;
    private double giaSach;
    private double giamGia;

    public bai2(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = 0;
        this.giamGia = 0;
    }

    public bai2(String maSach, String tenSach, double giaSach, double giamGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.giamGia = giamGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double tinhGiaBan() {
        return giaSach - (giaSach * giamGia);
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Giá sách: " + giaSach);
        System.out.println("Giảm giá: " + (giamGia * 100) + "%");
        System.out.println("Giá bán: " + tinhGiaBan());
    }


    public static void main(String[] args) {

        bai2 sach1 = new bai2("B001", "Lập trình Java", 100000, 0.1);

        System.out.println("Thông tin sách ban đầu");
        sach1.hienThiThongTin();

        sach1.setGiamGia(0.5);

        System.out.println("\nThông tin sách sau khi thay đổi giảm giá");
        sach1.hienThiThongTin();
    }
}
