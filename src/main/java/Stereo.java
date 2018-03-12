public class Stereo extends Component{
    CdPlayer cdPlayer;
    RecordPlayer recordPlayer;
    Radio radio;
    private int volume;
    private int volLimit;

    public Stereo(int volume, int volLimit, String model, String make){
        super(make, model);
        this.volume = volume;
        this.volLimit = volLimit;
    }


    public int getVolume() {
        return this.volume;
    }

    public void raiseVolume() {
        if(volume < volLimit) {
            this.volume += 1;
        }
    }


    public void lowerVolume() {
        if(volume > 0){
            this.volume -= 1;
        }
    }
}
