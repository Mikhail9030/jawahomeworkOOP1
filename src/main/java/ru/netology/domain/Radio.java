package ru.netology.domain;

public class Radio {

    int currentNumberStation;
    int enteredNumberStation;
    int currentSoundVolume;

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void numberStationNext() {
        if (currentNumberStation == 9) {
            this.currentNumberStation = 0;
            return;
        }
        currentNumberStation++;
        return;
    }

    public void numberStationPrev() {
        if (currentNumberStation == 0) currentNumberStation = 10;
        currentNumberStation--;
        return;
    }

    public void volumeStationUp() {
        if (currentSoundVolume >= 10) {
            currentSoundVolume = 10;
            return;
        } else {
            currentSoundVolume++;
            return;
        }

    }

    public void volumeStationDoun() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
            return;
        } else {
            currentSoundVolume--;
            return;
        }
    }
}