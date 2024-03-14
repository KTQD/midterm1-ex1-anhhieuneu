public abstract class Item {
    public String ten;
    private String description;
    protected String ID;
    float gia;

    public Item(String ten, String description, String ID, float gia) {
        this.ten = ten;
        this.description = description;
        this.ID = ID;
        this.gia = gia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void showInfo();
}

