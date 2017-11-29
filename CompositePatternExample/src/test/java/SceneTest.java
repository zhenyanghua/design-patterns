import com.leafyjava.tutorials.composite.ArrayScene;
import com.leafyjava.tutorials.composite.LinkedScene;
import com.leafyjava.tutorials.composite.Marker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SceneTest {

    @Test
    public void compositeShouldOnlyContainsItsOwnMemberTest() {
        LinkedScene linkedScene_1 = new LinkedScene(1, 0, 0);
        LinkedScene linkedScene_2 = new LinkedScene(2, 0, 0);
        ArrayScene arrayScene_1 = new ArrayScene(1, 10, 10);
        Marker marker_1 = new Marker(1, 50, 50);

        linkedScene_1.add(linkedScene_2);
        linkedScene_1.add(arrayScene_1);
        linkedScene_1.add(marker_1);

        assertEquals(3, linkedScene_1.getMembers().size());
    }

    @Test
    public void compositeCanAddOtherMember() {
        LinkedScene linkedScene_2 = new LinkedScene(2, 0, 0);
        ArrayScene arrayScene_1 = new ArrayScene(1, 10, 10);

        arrayScene_1.add(linkedScene_2);

        assertEquals(1, arrayScene_1.getMembers().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void leafShouldThrowExceptionWhenCalledChildRelatedMethods() {
        Marker marker_1 = new Marker(1, 50, 50);
        Marker marker_2 = new Marker(2, 50, 50);
        marker_1.add(marker_2);
    }


}
