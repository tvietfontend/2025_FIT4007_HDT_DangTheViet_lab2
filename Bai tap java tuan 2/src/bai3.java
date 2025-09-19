class Student {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String diaChi;

    public Student(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public Student(String maSV, String hoTen, int namSinh, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public int getNamSinh() { return namSinh; }
    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public int tinhTuoi() {
        int namHienTai = 2025;
        return namHienTai - namSinh;
    }

    public void inThongTin() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("- Mã SV: " + maSV);
        System.out.println("- Họ tên: " + hoTen);
        System.out.println("- Năm sinh: " + namSinh);
        System.out.println("- Địa chỉ: " + diaChi);
        System.out.println(" Tuổi: " + tinhTuoi());
    }

    public static void main(String[] args) {
        Student st = new Student("1871020650", "Đặng Thế Việt", 2006, "Nam Từ Liêm Tây Mỗ Hà Nội");
        st.inThongTin();
    }
}
