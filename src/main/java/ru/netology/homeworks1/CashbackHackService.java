package ru.netology.homeworks1;

public class CashbackHackService {

    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

}
