package com.holovenko.springpatterns.observer.listeners;

import com.holovenko.springpatterns.console.Printer;
import com.holovenko.springpatterns.entity.bavovna.Бавовна;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ТелеграмБлогериБавовнаЛісенер implements БавовнаЛісенер {

    private final Printer printer;

    @Override
    @EventListener
    public void відреагуватиНаБавовну(Бавовна бавовна) {
        printer.separateBlock();
        printer.print("***Телеграм блогери дізнались про бавовну***");
        printer.print("Маємо для вас екстренні новини");
        printer.printList(бавовна.getЦілевказання());
        printer.print("На честь цього ми відкриваємо новий збір");
        printer.print("Робимо 100000 мемів");
        printer.print("***Телеграм блогери чекають нову бавовну***");
        printer.separateBlock();
    }
}
