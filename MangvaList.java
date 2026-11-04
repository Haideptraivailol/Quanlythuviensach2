import java.util.ArrayList;
import java.util.Scanner;

public class MangvaList {
    static Scanner sc = new Scanner(System.in);

    // Dữ liệu dùng chung
    static ArrayList<String> dsMa = new ArrayList<>();            // Bài 2: danh sách mã sách
    static ArrayList<String> danhSachSach = new ArrayList<>();    // Bài 3, 4: mỗi phần tử là "ma|ten|soLuong|gia"

    // Hàm đọc số cho gọn
    static int docSo() {
        return Integer.parseInt(sc.nextLine().trim());
    }

    static double docThuc() {
        return Double.parseDouble(sc.nextLine().trim());
    }

    // ========== BÀI 1: Mảng int[] soLuong (5 cuốn sách) ==========
    static void bai1() {
        int[] soLuong = new int[5];

        // Nhập số lượng
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhap so luong cuon sach thu " + (i + 1) + ": ");
            soLuong[i] = docSo();
        }

        // Hiển thị, tính tổng, tìm lớn nhất
        int tong = 0;
        int max = soLuong[0];
        System.out.println("Danh sach so luong:");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    // ========== BÀI 2: ArrayList<String> lưu mã sách ==========
    static void bai2() {
        int chon;
        do {
            System.out.println("\n--- BAI 2: QUAN LY MA SACH ---");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");
            chon = docSo();

            if (chon == 1) {
                System.out.print("Nhap ma sach: ");
                dsMa.add(sc.nextLine());
                System.out.println("Da them.");
            } else if (chon == 2) {
                if (dsMa.size() == 0) {
                    System.out.println("Danh sach rong.");
                }
                for (int i = 0; i < dsMa.size(); i++) {
                    System.out.println((i + 1) + ". " + dsMa.get(i));
                }
            } else if (chon == 3) {
                System.out.print("Nhap ma can tim: ");
                String ma = sc.nextLine();
                if (dsMa.contains(ma)) {
                    System.out.println("Tim thay o vi tri " + (dsMa.indexOf(ma) + 1));
                } else {
                    System.out.println("Khong tim thay.");
                }
            } else if (chon == 4) {
                System.out.print("Nhap ma can xoa: ");
                String ma = sc.nextLine();
                if (dsMa.remove(ma)) {
                    System.out.println("Da xoa.");
                } else {
                    System.out.println("Khong tim thay.");
                }
            }
        } while (chon != 0);
    }

    // ========== BÀI 3: ArrayList<String> danhSachSach ==========

    // Tìm vị trí sách theo mã, không thấy trả về -1
    static int timViTri(String ma) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|");
            if (p[0].equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    static void themSach() {
        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Ten sach: ");
        String ten = sc.nextLine();
        System.out.print("So luong: ");
        int sl = docSo();
        System.out.print("Gia: ");
        double gia = docThuc();
        danhSachSach.add(ma + "|" + ten + "|" + sl + "|" + gia);
        System.out.println("Da them sach.");
    }

    static void hienThiSach() {
        if (danhSachSach.size() == 0) {
            System.out.println("Danh sach rong.");
            return;
        }
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|");
            System.out.println((i + 1) + ". Ma: " + p[0] + " | Ten: " + p[1] + " | SL: " + p[2] + " | Gia: " + p[3]);
        }
    }

    static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        int vt = timViTri(sc.nextLine());
        if (vt == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            String[] p = danhSachSach.get(vt).split("\\|");
            System.out.println("Ma: " + p[0] + " | Ten: " + p[1] + " | SL: " + p[2] + " | Gia: " + p[3]);
        }
    }

    static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        int vt = timViTri(sc.nextLine());
        if (vt == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            danhSachSach.remove(vt);
            System.out.println("Da xoa sach.");
        }
    }

    static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            System.out.print("Ten sach moi: ");
            String ten = sc.nextLine();
            System.out.print("So luong moi: ");
            int sl = docSo();
            System.out.print("Gia moi: ");
            double gia = docThuc();
            danhSachSach.set(vt, ma + "|" + ten + "|" + sl + "|" + gia);
            System.out.println("Da sua sach.");
        }
    }

    static void bai3() {
        int chon;
        do {
            System.out.println("\n--- BAI 3: QUAN LY SACH ---");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");
            chon = docSo();

            if (chon == 1) {
                themSach();
            } else if (chon == 2) {
                hienThiSach();
            } else if (chon == 3) {
                timSach();
            } else if (chon == 4) {
                xoaSach();
            } else if (chon == 5) {
                suaSach();
            }
        } while (chon != 0);
    }

    // ========== BÀI 4: Menu hoàn chỉnh ==========
    static void tongSoLuong() {
        int tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|");
            tong += Integer.parseInt(p[2]);
        }
        System.out.println("Tong so luong: " + tong);
    }

    static void tongGiaTri() {
        double tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|");
            tong += Integer.parseInt(p[2]) * Double.parseDouble(p[3]);
        }
        System.out.println("Tong gia tri: " + tong);
    }

    static void bai4() {
        int chon;
        do {
            System.out.println("\n===== BAI 4: MENU THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            chon = docSo();

            if (chon == 1) {
                themSach();
            } else if (chon == 2) {
                hienThiSach();
            } else if (chon == 3) {
                timSach();
            } else if (chon == 4) {
                xoaSach();
            } else if (chon == 5) {
                suaSach();
            } else if (chon == 6) {
                tongSoLuong();
            } else if (chon == 7) {
                tongGiaTri();
            } else if (chon != 8) {
                System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }

    // ========== Chọn bài để chạy ==========
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== CHON BAI THUC HANH =====");
            System.out.println("1. Bai 1: Mang so luong");
            System.out.println("2. Bai 2: ArrayList ma sach");
            System.out.println("3. Bai 3: ArrayList danh sach sach");
            System.out.println("4. Bai 4: Menu hoan chinh");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = docSo();

            if (chon == 1) {
                bai1();
            } else if (chon == 2) {
                bai2();
            } else if (chon == 3) {
                bai3();
            } else if (chon == 4) {
                bai4();
            }
        } while (chon != 0);

        System.out.println("Da thoat chuong trinh.");
        sc.close();
    }
}