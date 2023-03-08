public abstract class Nhanvien {
    private String id="1";
    private String name;
    private String date;
    private String dress;

    public Nhanvien() {
    }

    public Nhanvien(String id, String name, String date, String dress) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.dress = dress;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDress() {
        return dress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }
public abstract String motaCongViec();
    @Override
    public String toString() {
        return "Nhanvien [ " +
                "id='" + id + '\'' +
                ", name = '" + name + '\'' +
                ", date = '" + date + '\'' +
                ", dress ='" + dress + '\'' +
                ']';
    }
}
