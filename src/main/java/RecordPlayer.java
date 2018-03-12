import java.util.ArrayList;

public class RecordPlayer extends Component{

    private ArrayList<String> speeds;

    public RecordPlayer(String make, String model) {
        super(make, model);
        this.speeds = new ArrayList<>();
    }

    public void addSpeed(String speed){
        speeds.add(speed);
    }

    public int getSpeeds() {
        return speeds.size();
    }
}
