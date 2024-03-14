public class book extends item {
    private String tacgia;
    private int trang;
    private String genre;

    public book(String ten, String description, String ID, float gia, String tacgia, int trang, String genre) {
        super(ten, description, ID, gia);
        this.tacgia = tacgia;
        this.trang = trang;
        this.genre = genre;
    }

    public String gettacgia() {
        return tacgia;
    }

    public void settacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int gettrang() {
        return trang;
    }

    public void settrang(int trang) {
        this.trang = trang;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + ten);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + gia);
        System.out.println("Author: " + tacgia);
        System.out.println("Number of Pages: " + trang);
        System.out.println("Genre: " + genre);
    }
}
