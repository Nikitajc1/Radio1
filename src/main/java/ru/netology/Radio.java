package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int soundVolume;
    private int minStation = 0;
    private int quantityOfStations;
    private int currentStation = minStation;

}

