import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void setCurrentStation11() {
        Radio service = new Radio(12);

        service.setCurrentStation(11);

        int expected = 11;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAbove() {
        Radio service = new Radio(12);

        service.setCurrentStation(13);

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStationIfDefaultQuantity() {
        Radio service = new Radio();

        int expected = 9;
        int actual = service.getMaxStation();

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
    public void prevButtonUnder0Default() {
        Radio service = new Radio();

        service.setCurrentStation(0);
        service.prev();

        int expected = 9;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButtonUnder0SetByUser() {
        Radio service = new Radio(65);

        service.setCurrentStation(0);
        service.prev();

        int expected = 64;
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
    public void setVolumeAbove100() {
        Radio service = new Radio();

        service.setSoundVolume(101);

        int expected = 0;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume100() {
        Radio service = new Radio();

        service.setSoundVolume(100);
        service.increaseVolume();

        int expected = 100;
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
    public void testNextButtonDefault() {
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
