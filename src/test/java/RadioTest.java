import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void setCurrentStationAbove9() {
        Radio service = new Radio();

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationUnder0() {
        Radio service = new Radio();

        service.setCurrentStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getStation() {
        Radio service = new Radio();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextButton8() {
        Radio service = new Radio();

        service.setCurrentStation(7);
        service.next();

        int expected = 8;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextButtonAfter9() {
        Radio service = new Radio();

        service.setCurrentStation(9);
        service.next();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButton() {
        Radio service = new Radio();

        service.setCurrentStation(1);
        service.prev();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButtonUnder0() {
        Radio service = new Radio();

        service.setCurrentStation(0);
        service.prev();

        int expected = 9;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifSoundUnder0() {
        Radio service = new Radio();

        service.setSoundVolume(-1);

        int expected = 0;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSound() {
        Radio service = new Radio();

        service.setSoundVolume(5);

        int expected = 5;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAbove10() {
        Radio service = new Radio();

        service.setSoundVolume(11);

        int expected = 0;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume10() {
        Radio service = new Radio();

        service.setSoundVolume(10);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio service = new Radio();

        service.setSoundVolume(7);
        service.increaseVolume();

        int expected = 8;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume0() {
        Radio service = new Radio();

        service.setSoundVolume(0);
        service.decreaseVolume();

        int expected = 0;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio service = new Radio();

        service.setSoundVolume(7);
        service.decreaseVolume();

        int expected = 6;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextButton() {
        Radio service = new Radio();

        service.setCurrentStation(7);
        service.next();
        service.next();
        service.next();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
