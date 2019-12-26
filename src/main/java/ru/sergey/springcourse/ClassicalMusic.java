package ru.sergey.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

     private List<String> sound = new ArrayList<>();

    {
    sound.add("Hungarian Rhapsody");
    sound.add("Wiener Philharmoniker");
    sound.add("Vivaldi - The Four Seasons");}


    @Override
    public List<String> getSong() {
        return sound; }
}
