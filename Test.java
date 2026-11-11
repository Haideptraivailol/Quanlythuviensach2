public class Test {
    public static void main(String[] args) {
        // Yêu cầu 4: tạo đối tượng bằng constructor đầy đủ
        Sach s1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn A", 2020, 10);
        System.out.println("=== Sách hợp lệ ===");
        s1.hienThiThongTin();

        // Yêu cầu 2: dùng getter/setter
        s1.setTieuDe("Java nâng cao");
        System.out.println("Tiêu đề mới: " + s1.getTieuDe());

        // Yêu cầu 3: thử dữ liệu sai
        System.out.println("\n=== Thử dữ liệu không hợp lệ ===");
        s1.setNamXuatBan(2100);   // lớn hơn năm hiện tại
        s1.setNamXuatBan(-5);     // âm
        s1.setSoLuong(-3);        // số lượng âm

        System.out.println("\n=== Sau khi thử (giá trị cũ phải giữ nguyên) ===");
        s1.hienThiThongTin();

        // Dữ liệu hợp lệ thì được cập nhật
        s1.setSoLuong(25);
        s1.setNamXuatBan(2023);
        s1.hienThiThongTin();
    }
}