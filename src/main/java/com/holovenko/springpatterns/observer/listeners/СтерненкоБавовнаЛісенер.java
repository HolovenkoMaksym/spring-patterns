package com.holovenko.springpatterns.observer.listeners;

import com.holovenko.springpatterns.console.Printer;
import com.holovenko.springpatterns.entity.bavovna.Бавовна;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class СтерненкоБавовнаЛісенер implements БавовнаЛісенер {

    private final Printer printer;

    @Override
    @EventListener
    public void відреагуватиНаБавовну(Бавовна бавовна) {
        printer.separateBlock();
        printer.print("***Стерненко в ефірі***");
        printer.print("Вітаю вас друзі");
        printer.printList(бавовна.getЦілевказання());
        printer.print("Поставте лайк під цим відео і залиште будь який коментар");
        printer.print("***Ефір завершено***");
        printer.separateBlock();
    }
}
