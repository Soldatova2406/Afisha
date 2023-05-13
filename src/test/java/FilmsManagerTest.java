import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afisha.FilmsManager;

public class FilmsManagerTest {
    @Test
    public void findAllTest() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllLimitTest() {
        FilmsManager manager = new FilmsManager(3);

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAll1Test() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast5Test() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");

        String[] actual = manager.findLast();
        String[] expected = {"Movie V","Movie IV","Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOver5Test() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");
        manager.add("Movie VI");

        String[] actual = manager.findLast();
        String[] expected = {"Movie VI","Movie V","Movie IV","Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);
    }


}
