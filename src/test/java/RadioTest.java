import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        this.radio = new Radio("Sony", "Radio");
    }

    @Test
    public void radioHasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void radioHadModel(){
        assertEquals("Radio", radio.getModel());
    }

    @Test
    public void radioCanTune(){
        assertEquals("Tuning", radio.tune());
    }

}