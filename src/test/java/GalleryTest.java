import org.example.Artwork;
    import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Gallery;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("BrightNetwork");
        Artwork monaLisa = new Artwork("Mona Lisa", "Van Gough", 150.00);
        Artwork monet = new Artwork("Frida", "Kahlo", 250.00);
        Artwork flowerPot = new Artwork("FlowerPot", "Zsolt", 550.00);
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(monet);
        gallery.addArtwork(flowerPot);

    }
    @Test
    public void canGetName() {
        assertThat(gallery.getName()).isEqualTo("BrightNetwork");

    }
//    @Test
//    public void canIncreaseTill(){
//        assertThat(gallery.increaseTill(10.00).isEqualTo(10.00));
//    }


}
