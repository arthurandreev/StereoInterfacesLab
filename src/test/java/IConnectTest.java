import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IConnectTest {

    Mp3Player mp3Player;
    Stereo stereo;

    @Before
    public void before() {
        mp3Player = new Mp3Player();
        stereo = new Stereo(4, 5, "Rubbish", "Sony");
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Connected to Sony", mp3Player.connect(stereo.getMake()));
    }

}