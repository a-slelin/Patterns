package Example;

public class Client {
    public static Dialog dialog;
    public static void initialize() throws Exception{
        String config = System.getProperty("os.name");
        switch (config) {
            case "Windows 11":
                dialog = new WindowsDialog();
                break;
            case "Web":
                dialog = new WebDialog();
            default:
                throw new Exception("Unknown operating system!");
        }
    }
    public static void main(String[] args) throws Exception{
        initialize();
        dialog.renderWindow();
    }
}
