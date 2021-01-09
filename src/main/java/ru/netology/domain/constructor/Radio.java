package ru.netology.domain.constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Radio {
    private int currentStation;
    private int currentVolume;


    private int maxStation = 20;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;

    }

    public Radio(int currentStation, int currentVolume, int maxStation, int minStation, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation || newStation < minStation) {
            return;
        }
        this.currentStation = newStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > maxVolume || newVolume < minVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void pressNextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 1);
    }
}