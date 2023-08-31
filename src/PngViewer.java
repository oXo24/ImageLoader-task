public class PngViewer implements AdvancedImageViewer {

    @Override
    public void viewPng(String fileName) {
        System.out.println("Opening png file: "+ fileName);
    }

    @Override
    public void viewJpeg(String fileName) {
    }
}
