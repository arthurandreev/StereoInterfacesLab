public class CdPlayer extends Component{
    private String playCD;

    public CdPlayer(String make, String model) {
        super(make, model);
        this.playCD = playCD;

    }

    public String canPlayCD() {
        return this.canPlayCD();
    }

    public String getPlayCD() {
        return playCD;
    }

    public void setPlayCD(String playCD) {
        this.playCD = playCD;
    }

    public String play() {
        return "Playing";
    }
}
