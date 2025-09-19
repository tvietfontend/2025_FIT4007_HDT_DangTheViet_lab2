public class bai1 {
    private String maSoTaikhoan;
    private double soTien;
    public bai1(String maSoTaikhoan, double soTien) {
        this.maSoTaikhoan = maSoTaikhoan;
        this.soTien = soTien;
    }

    public String getMaSoTaikhoan() {
        return maSoTaikhoan;
    }

    public void setMaSoTaikhoan(String maSoTaikhoan) {
        this.maSoTaikhoan = maSoTaikhoan;
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    public static void main(String[] args) {
        bai1 acc = new bai1("123456",1000000);
        System.out.println("Thông tin tài khảon");
        System.out.println("Mã số"+acc.getMaSoTaikhoan());
        System.out.println("Số tiền"+acc.getSoTien());
        acc.setSoTien(800000);
        System.out.println("\nSau khi cập nhật");
        System.out.println("Mã số: "+acc.getMaSoTaikhoan());
        System.out.println("số tiền: "+acc.getSoTien()+ "VND");
    }

}
