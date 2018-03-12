import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;
    ArrayList<String> speeds;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer("Crosely", "Cruiser" );
        this.speeds = new ArrayList<>();

    }

    @Test
    public void canGetMake() {
        assertEquals("Crosely", recordPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Cruiser", recordPlayer.getModel());
    }

    @Test
    public void canCheckSpeedArray(){
        recordPlayer.addSpeed("fast");
        recordPlayer.addSpeed("slow");
        assertEquals(2, recordPlayer.getSpeeds());
    }


}