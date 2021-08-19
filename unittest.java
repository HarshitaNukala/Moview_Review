package testing;

import newpro.movi_revi;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;

public class unittest {
    @Test
    public void checking() throws FileNotFoundException {
        movi_revi m = mock(movi_revi.class);
        HashMap<Integer, ArrayList<Float>> f;
        f=m.filesread();
        assertEquals(m.minimum(f,2259),2.0F);
        assertEquals(m.maximum(f,1),5.0F);
        assertEquals(m.average(f,1),4.0F);

    }
    @Test
    public void checking2() throws FileNotFoundException {
        movi_revi m2 = mock(movi_revi.class);
        HashMap<Integer, ArrayList<Float>> f2;
        f2=m2.filesread();
        assertEquals(m2.minimum(f2,2),0.5F);
        assertEquals(m2.maximum(f2,3),5.0F);
        assertEquals(m2.average(f2,4),1.0F);
    }
    @Test
    public void checking3() throws FileNotFoundException {
        movi_revi m3 = mock(movi_revi.class);
        HashMap<Integer, ArrayList<Float>> f3;
        f3=m3.filesread();
        assertEquals(m3.minimum(f3,49132),-1.0F);
        assertEquals(m3.maximum(f3,2),5.0F);
        assertEquals(m3.average(f3,1),4.0F);
    }
}
