package ru.sergey.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String>sound = new ArrayList<>();
    {
        sound.add("Wind cries Mary");
        sound.add("AwakeDeluxe");
        sound.add("Greatest Hits");
    }

    @Override
    public List<String> getSong() {
        return sound;
    }
}
