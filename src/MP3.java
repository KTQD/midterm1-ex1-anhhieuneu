public class MP3 extends item {
    private int duration;

    public MP3(String ten, String description, String ID, float gia, int duration) {
        super(ten, description, ID, gia);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + ten);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + gia);
        System.out.println("Duration: " + duration);
    }
}
