public class KyThuat extends  Nhanvien {
    private String ChuyenNganh;
    public KyThuat (){}

    public KyThuat(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }

    public KyThuat(String id, String name, String date, String dress, String chuyenNganh) {
        super(id, name, date, dress);
        ChuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }
    @Override
    public String motaCongViec() {
        return "Hacker";
    }

    @Override
    public String toString() {
        return super.toString()+ "\nKyThuat [ " +
                "ChuyenNganh =" + ChuyenNganh + "  " +
                "motacongviec : " + motaCongViec() +
                ']';
    }
}
