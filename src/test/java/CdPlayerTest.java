import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CdPlayer("Sony", "Walkman");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Walkman", cdPlayer.getModel());
    }

    @Test
    public void canPlayCD() {
        assertEquals("Playing", cdPlayer.play());
    }



}