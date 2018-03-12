import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StereoTest {

    Radio radio;
    CdPlayer cdPlayer;
    RecordPlayer recordPlayer;
    Stereo stereo;

    @Before
    public void before(){
        this.radio = new Radio("Sony", "Radio");
        this.cdPlayer = new CdPlayer("Sony", "Walkman");
        this.recordPlayer = new RecordPlayer("Crosley", "Cruiser");
        this.stereo = new Stereo(5, 10, "deluxe", "Sony");
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canRaiseVolume(){
        stereo.raiseVolume();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canLowerVolume(){
        stereo.lowerVolume();
        assertEquals(4, stereo.getVolume());
    }
    @Test
    public void stereoCanPlayCD(){

    }
}