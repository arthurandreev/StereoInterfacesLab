public class Mp3Player implements IConnect{

    Stereo stereo;


    public String connect(String make) {
        return "Connected to " + make;
    }
}
