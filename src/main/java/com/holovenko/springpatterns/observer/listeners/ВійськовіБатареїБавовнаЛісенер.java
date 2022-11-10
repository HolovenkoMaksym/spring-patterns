package com.holovenko.springpatterns.observer.listeners;

import com.holovenko.springpatterns.console.Printer;
import com.holovenko.springpatterns.entity.bavovna.Бавовна;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ВійськовіБатареїБавовнаЛісенер implements БавовнаЛісенер {

    private final Printer printer;

    @Override
    @EventListener
    public void відреагуватиНаБавовну(Бавовна бавовна) {
        printer.separateBlock();
        printer.print("Військові батареї готові до роботи");
        printer.printList(бавовна.getЦілевказання());
        printer.print("Військові батареї успішно виконали бойове завдання");
        printer.separateBlock();
    }
}
