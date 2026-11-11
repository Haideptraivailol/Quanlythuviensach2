import java.time.Year;

public class Sach {
    // Yêu cầu 1: tất cả thuộc tính là private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Yêu cầu 4: constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);   // gọi setter để được kiểm tra hợp lệ
        setSoLuong(soLuong);         // gọi setter để được kiểm tra hợp lệ
    }

    // Yêu cầu 2: getters
    public String getMaSach() {
        return maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 2: setters
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Yêu cầu 3: kiểm tra năm xuất bản
    public void setNamXuatBan(int namXuatBan) {
        int namHienTai = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= namHienTai) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ: " + namXuatBan);
        }
    }

    // Yêu cầu 3: kiểm tra số lượng không âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng không được âm: " + soLuong);
        }
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách     : " + maSach);
        System.out.println("Tiêu đề     : " + tieuDe);
        System.out.println("Tác giả     : " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng    : " + soLuong);
    }
}