package ru.sergey.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicType type){
        Random randomNum =new  Random();
        if(type == MusicType.CLASSIC){
            int num = randomNum.nextInt(classicalMusic.getSong().size());
            return classicalMusic.getSong().get(num);

        }else{
            int num = randomNum.nextInt(rockMusic.getSong().size());
            return rockMusic.getSong().get(num);
        }


    }

}
