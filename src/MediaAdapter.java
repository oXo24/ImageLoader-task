public class MediaAdapter implements StandartImageViewer {

    AdvancedImageViewer advancedImageViewer;

    public MediaAdapter(String imageType) {

        if (imageType.equalsIgnoreCase("png")) {
            advancedImageViewer = new PngViewer();
        } else if (imageType.equalsIgnoreCase("jpeg")) {
            advancedImageViewer = new JpegViewer();
        }
    }

    @Override
    public void view(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("png")) {
            advancedImageViewer.viewPng(fileName);
        } else if (imageType.equalsIgnoreCase("jpeg")) {
            advancedImageViewer.viewJpeg(fileName);
        }
    }
}
