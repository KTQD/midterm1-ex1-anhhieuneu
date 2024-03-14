public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("thien ly", "jack music", "MP3-001", 0.0f, 240);
        book book = new book("harry pot", "magic", "BôK-001", 40.0f, "ko nho", 400, "chuyen dai");
        System.out.println("MP3:");
        mp3.showInfo();
        System.out.println();
        System.out.println("book:");
        book.showInfo();
    }
}
