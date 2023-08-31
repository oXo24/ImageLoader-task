public class JpegViewer implements AdvancedImageViewer {

    @Override
    public void viewPng(String fileName) {
    }

    @Override
    public void viewJpeg(String fileName) {
        System.out.println("Opening jpeg file: " + fileName);
    }
}
