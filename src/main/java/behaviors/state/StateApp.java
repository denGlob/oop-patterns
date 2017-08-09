package behaviors.state;

/**
 * Created by denglob on 8/10/17.
 */
public class StateApp {

    public static void main(String[] args) {

        Station station = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(station);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }

}

interface Station {
    void play();
}

class RadioFM implements Station {
    @Override
    public void play() {
        System.out.println("Radio FM .... ");
    }
}

class RadioDFM implements Station {
    @Override
    public void play() {
        System.out.println("Radio DFM .... ");
    }
}
class Radio7 implements Station {
    @Override
    public void play() {
        System.out.println("Radio 7 .... ");
    }
}

//Context

class Radio {
    Station station;

    void setStation (Station station) { this.station = station; }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        }
        else if (station instanceof RadioDFM) {
            setStation(new RadioFM());
        }
        else if (station instanceof RadioFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}