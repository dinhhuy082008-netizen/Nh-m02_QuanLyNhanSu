package nhom02_quanlynhansu;

public class Thongtinnhanvien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;

    public Thongtinnhanvien() {}

    public Thongtinnhanvien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public double getLuongCoBan() { return luongCoBan; }
    public void setLuongCoBan(double luongCoBan) { this.luongCoBan = luongCoBan; }
    public double getHeSoLuong() { return heSoLuong; }
    public void setHeSoLuong(double heSoLuong) { this.heSoLuong = heSoLuong; }

    public double tinhThucLinh() {
        return this.luongCoBan * this.heSoLuong;
    }

    public void hienThi() {
        System.out.printf("| %-10s | %-22s | %12.1f | %10.2f | %14.1f |\n",
                maNV, hoTen, luongCoBan, heSoLuong, tinhThucLinh());
    }
}