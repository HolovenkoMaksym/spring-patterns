package com.holovenko.springpatterns.observer;

import com.holovenko.springpatterns.entity.bavovna.Бавовна;
import com.holovenko.springpatterns.observer.listeners.БавовнаЛісенер;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class БавовнаМенеджер {

    private final List<БавовнаЛісенер> бавовнаЛісенери = new ArrayList<>();

    public void додатиКаналРозсилки(БавовнаЛісенер бавовнаЛісенер) {
        бавовнаЛісенери.add(бавовнаЛісенер);
    }

    public void прибратиКаналРозсилки(БавовнаЛісенер бавовнаЛісенер) {
        бавовнаЛісенери.remove(бавовнаЛісенер);
    }

    public void повідомитиПроБавовну(Бавовна бавовна) {
        бавовнаЛісенери.forEach(бавовнаЛісенер -> бавовнаЛісенер.відреагуватиНаБавовну(бавовна));
    }
}
