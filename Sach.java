public class Sach {
    // Yêu cầu 1: thuộc tính (public để bảo vệ dữ liệu)
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    // Constructor: gán giá trị khi tạo đối tượng
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 2: in thông tin sách
    public void hienThiThongTin() {
        System.out.println("Mã sách     : " + maSach);
        System.out.println("Tiêu đề     : " + tieuDe);
        System.out.println("Tác giả     : " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng    : " + soLuong);
        System.out.println("-----------------------------");
    }
}