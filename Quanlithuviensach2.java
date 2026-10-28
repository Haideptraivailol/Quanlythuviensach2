import java.util.Scanner;

public class Quanlithuviensach2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 1: nhap thong tin sach
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        // Bai 1: hien thi lai
        System.out.println();
        System.out.println("===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %,.2f dong%n", donGia);
        System.out.println("So luong: " + soLuong);

        // Bai 2: thanh tien = don gia x so luong
        double thanhTien = donGia * soLuong;

        // Bai 3: phi van chuyen = 5% gia tri sach
        double phiVanChuyen = thanhTien * 0.05;

        // Bai 4: tong tien nhap = thanh tien + phi van chuyen
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println();
        System.out.println("===== TIEN NHAP KHO =====");
        System.out.printf("Thanh tien: %,.2f dong%n", thanhTien);
        System.out.printf("Phi van chuyen (5%%): %,.2f dong%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %,.2f dong%n", tongTienNhap);
    }
}