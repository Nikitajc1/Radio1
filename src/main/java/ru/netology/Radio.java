package ru.netology;

public class Radio {
    private int soundVolume;
    private int minStation = 0;
    private int quantityOfStations;
    private int currentStation = minStation;

    public Radio() {
        quantityOfStations = 10;
    }

    public Radio(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }

    public int getMaxStation() {
        return quantityOfStations - 1;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int numCurrentStation) {
        if (numCurrentStation < getMinStation()) {
            return;
        }
        if (numCurrentStation > getMaxStation()) {
            return;
        }
        currentStation = numCurrentStation;
    }

    public void next() {
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
        } else {
            currentStation = getMinStation();
        }
    }


    public void prev() {
        if (currentStation > getMinStation()) {
            currentStation = currentStation - 1;
        } else {
            currentStation = getMaxStation();
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int numSoundVolume) {
        if (numSoundVolume < 0) {
            return;
        }
        if (numSoundVolume > 100) {
            return;
        }
        soundVolume = numSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            return;
        }
    }
}

