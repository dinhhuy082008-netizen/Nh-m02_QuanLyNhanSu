package nhom02_quanlynhansu;

import java.util.Scanner;

public class Nhom02_Quanlynhansu {
    public static void main(String[] args) {
        QuanLyNhanSu qlns = new QuanLyNhanSu();
        Scanner scanner = new Scanner(System.in);
        int chon = -1;

        do {
            System.out.println("\n=============================================");
            System.out.println("   HỆ THỐNG QUẢN LÝ NHÂN SỰ - NHÓM 2 (JAVA)");
            System.out.println("=============================================");
            System.out.println("1. Thêm nhân viên mới");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tìm kiếm nhân viên theo Mã / Tên");
            System.out.println("4. Xóa nhân viên theo Mã");
            System.out.println("0. Thoát chương trình");
            System.out.println("=============================================");
            System.out.print("Mời bạn chọn (0-4): ");

            try {
                String input = scanner.nextLine();
                chon = Integer.parseInt(input);
                
                switch (chon) {
                    case 1:
                        qlns.themNhanVien();
                        break;
                    case 2:
                        qlns.hienThiDanhSach();
                        break;
                    case 3:
                        qlns.timKiemNhanVien();
                        break;
                    case 4:
                        qlns.xoaNhanVien();
                        break;
                    case 0:
                        System.out.println("Tam biet!");
                        break;
                    default:
                        System.out.println("Vui long chon tu 0 den 4!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap vao mot so nguyen!");
            }
        } while (chon != 0);
    }
}