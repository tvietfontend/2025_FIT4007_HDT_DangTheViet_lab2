class Circle {
    private double banKinh;

    public Circle() {
        this.banKinh = 1;
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() { return banKinh; }
    public void setBanKinh(double banKinh) { this.banKinh = banKinh; }

    public void xuat() {
        System.out.println("Thông tin hình tròn:");
        System.out.println("Bán kính r: " + banKinh);
    }

    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.xuat();
        System.out.println("Diện tích: " + c1.dienTich());
        System.out.println("Chu vi: " + c1.chuVi());

        System.out.println("---------------------");
        Circle c2 = new Circle(16);
        c2.xuat();
        System.out.println("Diện tích: " + c2.dienTich());
        System.out.println("Chu vi: " + c2.chuVi());
    }
}
