package nhom02_quanlynhansu;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanSu {
    private final ArrayList<Thongtinnhanvien> danhSachNV = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public QuanLyNhanSu() {
        danhSachNV.add(new Thongtinnhanvien("NV01", "Nguyen Van An", 5000000, 2.5));
        danhSachNV.add(new Thongtinnhanvien("NV02", "Tran Thi Binh", 6000000, 3.0));
    }

    public void themNhanVien() {
        System.out.println("\n--- THÊM NHÂN VIÊN MỚI ---");
        System.out.print("Nhập mã nhân viên: ");
        String maNV = scanner.nextLine().trim();

        for (Thongtinnhanvien emp : danhSachNV) {
            if (emp.getMaNV().equalsIgnoreCase(maNV)) {
                System.out.println("❌ Mã nhân viên đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine().trim();
        System.out.print("Nhập lương cơ bản: ");
        double luongCB = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số lương: ");
        double heSo = Double.parseDouble(scanner.nextLine());

        danhSachNV.add(new Thongtinnhanvien(maNV, hoTen, luongCB, heSo));
        System.out.println("✅ Thêm thành công!");
    }

    public void hienThiDanhSach() {
        System.out.println("\n================================ DANH SÁCH NHÂN VIÊN ================================");
        if (danhSachNV.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("+------------+------------------------+--------------+------------+----------------+");
        System.out.println("| Mã NV      | Họ và Tên              | Lương CB     | Hệ Số      | Thực Lĩnh (VND)|");
        System.out.println("+------------+------------------------+--------------+------------+----------------+");
        danhSachNV.forEach((emp) -> {
            emp.hienThi();
        });
        System.out.println("+------------+------------------------+--------------+------------+----------------+");
    }

    public void timKiemNhanVien() {
        System.out.println("\n--- TÌM KIẾM NHÂN VIÊN ---");
        System.out.print("Nhập mã hoặc tên cần tìm: ");
        String tuKhoa = scanner.nextLine().trim().toLowerCase();

        boolean timThay = false;
        System.out.println("+------------+------------------------+--------------+------------+----------------+");
        for (Thongtinnhanvien emp : danhSachNV) {
            if (emp.getMaNV().toLowerCase().contains(tuKhoa) || emp.getHoTen().toLowerCase().contains(tuKhoa)) {
                emp.hienThi();
                timThay = true;
            }
        }
        System.out.println("+------------+------------------------+--------------+------------+----------------+");
        if (!timThay) System.out.println("❌ Không tìm thấy nhân viên phù hợp!");
    }

    public void xoaNhanVien() {
        System.out.println("\n--- XÓA NHÂN VIÊN ---");
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String maNV = scanner.nextLine().trim();

        Thongtinnhanvien nvXoa = null;
        for (Thongtinnhanvien emp : danhSachNV) {
            if (emp.getMaNV().equalsIgnoreCase(maNV)) {
                nvXoa = emp;
                break;
            }
        }

        if (nvXoa != null) {
            danhSachNV.remove(nvXoa);
            System.out.println("✅ Đã xóa thành công nhân viên: " + maNV);
        } else {
            System.out.println("❌ Không tìm thấy mã nhân viên!");
        }
    }
}