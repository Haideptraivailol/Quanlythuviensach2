import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Yêu cầu 3: tạo đối tượng từ lớp Sach
        Sach s1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn A", 2020, 10);
        Sach s2 = new Sach("S02", "Cấu trúc dữ liệu", "Trần Thị B", 2018, 5);
        Sach s3 = new Sach("S03", "Cơ sở dữ liệu", "Lê Văn C", 2022, 8);

        System.out.println("=== Thông tin 1 cuốn sách ===");
        s1.hienThiThongTin();

        // Yêu cầu 4: quản lý danh sách bằng ArrayList
        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(s2);
        danhSach.add(s3);
        System.out.println("=== Danh sách tất cả sách ===");
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }

        System.out.println("Tổng số đầu sách: " + danhSach.size());
    }
}