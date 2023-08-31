public class ImageViewer implements StandartImageViewer {

    MediaAdapter mediaAdapter;

    @Override
    public void view(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("jpg")) {
            System.out.println("Opening jpg file: " + fileName);
        }

        else if (imageType.equalsIgnoreCase("png") ||
                imageType.equalsIgnoreCase("jpeg")
        ) {
            mediaAdapter = new MediaAdapter(imageType);
            mediaAdapter.view(imageType, fileName);
        } else {
            System.out.println("Invalid media. " + imageType + " format not supported");
        }
    }
}
