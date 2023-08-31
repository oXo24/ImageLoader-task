public class Main {

    public static void main(String[] args) {

        ImageViewer imageViewer = new ImageViewer();

        imageViewer.view("jpg", "Vacation.jpg");
        imageViewer.view("jpeg", "Cat_meme.jpeg");
        imageViewer.view("png", "Schedule.png");
    }
}
