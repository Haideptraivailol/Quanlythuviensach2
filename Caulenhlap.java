import java.util.Scanner;

public class Caulenhlap{
    static Scanner sc = new Scanner(System.in);

    // Mảng lưu thông tin sách (tối đa 100 cuốn)
    static String[] maSach = new String[100];
    static String[] tenSach = new String[100];
    static int[] soLuong = new int[100];
    static double[] giaTien = new double[100];
    static int n = 0;

    //  BÀI 1: Nhập n sách bằng vòng lặp 
    static void bai1() {
        System.out.print("Nhap so sach n: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("--- Sach thu " + (i + 1) + " ---");
            System.out.print("Ma sach: ");
            maSach[i] = sc.nextLine();
            System.out.print("Ten sach: ");
            tenSach[i] = sc.nextLine();
            System.out.print("So luong: ");
            soLuong[i] = sc.nextInt();
            System.out.print("Gia: ");
            giaTien[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    //  BÀI 2: Tính tổng số lượng và tổng giá trị 
    static void bai2() {
        int tongSL = 0;
        double tongGiaTri = 0;
        for (int i = 0; i < n; i++) {
            tongSL += soLuong[i];
            tongGiaTri += soLuong[i] * giaTien[i];
        }
        System.out.println("Tong so luong: " + tongSL);
        System.out.println("Tong gia tri: " + tongGiaTri);
    }

    //  BÀI 3: Menu lặp đến khi chọn Thoát 
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== QUAN LY THU VIEN =====");
            System.out.println("1. Nhap n sach (Bai 1)");
            System.out.println("2. Tinh tong so luong va gia tri (Bai 2)");
            System.out.println("3. Tim sach theo ma (Bai 4)");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            if (chon == 1) {
                bai1();
            } else if (chon == 2) {
                bai2();
            } else if (chon == 3) {
                bai4();
            } else if (chon != 0) {
                System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        System.out.println("Da thoat chuong trinh.");
        sc.close();
    }

    //  BÀI 4: Tìm sách theo mã 
    static void bai4() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        boolean timThay = false;
        for (int i = 0; i < n; i++) {
            if (maSach[i].equalsIgnoreCase(ma)) {
                System.out.println("Ten: " + tenSach[i] + " | SL: " + soLuong[i] + " | Gia: " + giaTien[i]);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }
    }
}