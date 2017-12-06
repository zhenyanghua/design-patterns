import com.leafyjava.tutorials.decorator.FirTree;
import com.leafyjava.tutorials.decorator.WithLight;
import com.leafyjava.tutorials.decorator.WithOrnament;
import com.leafyjava.tutorials.decorator.WithSong;
import org.junit.Assert;
import org.junit.Test;

public class TreeDecoratorTest {

    @Test
    public void DecorateTreeWithLightOrnamentSongTest() {
        FirTree firTree = new FirTree(7, "Balsam Fir");
        WithLight treeWithLight = new WithLight(firTree);
        WithOrnament treeWithLightOrnament = new WithOrnament(treeWithLight);
        WithSong treeWithLightOrnamentSong = new WithSong(treeWithLightOrnament);
        Assert.assertEquals("Balsam Fir with big-light on with ornaments sings a song", treeWithLightOrnamentSong.getType());
    }
}
