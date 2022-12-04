package ru.netology;

public class Radio {
    private int currentStation;
    private int soundVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int numCurrentStation) {
        if (numCurrentStation < 0) {
            return;
        }
        if (numCurrentStation > 9) {
            return;
        }
        currentStation = numCurrentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }


    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int numSoundVolume) {
        if (numSoundVolume < 0) {
            return;
        }
        if (numSoundVolume > 10) {
            return;
        }
        soundVolume = numSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
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

