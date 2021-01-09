package ru.netology.domain.constructor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From zero station'; 0; 1",
                    "'Go last station'; 18; 19",
                    "'More maximum station'; 20; 0"
            }
            , delimiter = ';'
    )
    void pressNextStationTest(String name, int start, int expected) {
        Radio radio=new Radio();
        radio.setCurrentStation(start);

        radio.pressNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From middle station'; 15; 14",
                    "'Go first station'; 1; 0",
                    "'Less minimum station'; 0; 19"
            }
            , delimiter = ';'
    )
    void pressPrevStationTest(String name, int start, int expected) {
        Radio radio=new Radio();
        radio.setCurrentStation(start);

        radio.pressPrevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Zero volume'; 0; 1",
                    "'Go max volume'; 99; 100",
                    "'More maximum volume'; 100; 100"
            }
            , delimiter = ';'
    )
    void pressPlusVolumeTest(String name, int start, int expected) {
        Radio radio=new Radio();
        radio.setCurrentVolume(start);

        radio.pressPlusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Middle volume'; 50; 40",
                    "'Go min volume'; 1; 0",
                    "'Less minimum volume'; 0; 0"
            }
            , delimiter = ';'
    )
    void pressMinusVolumeTest(String name, int start, int expected) {
        Radio radio=new Radio();
        radio.setCurrentVolume(start);

        radio.pressMinusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}