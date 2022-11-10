package com.holovenko.springpatterns;

import com.holovenko.springpatterns.chain.ДизаЕксепшн;
import com.holovenko.springpatterns.chain.ДизаСервіс;
import com.holovenko.springpatterns.console.Printer;
import com.holovenko.springpatterns.entity.frontline.НастрійПаровознюка;
import com.holovenko.springpatterns.entity.frontline.ПораРоку;
import com.holovenko.springpatterns.entity.frontline.РиторикаПропагандистів;
import com.holovenko.springpatterns.entity.frontline.СитуаціяВКриму;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаПівденномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаПівнічномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаСхідномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import com.holovenko.springpatterns.entity.frontline.СхіднеМісто;
import com.holovenko.springpatterns.entity.frontline.ТягаДоКуріння;
import com.holovenko.springpatterns.strategy.ЗалужнийСтворювачБавовниСервіс;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CLR implements CommandLineRunner {

    private final ДизаСервіс дизаСервіс;
    private final ЗалужнийСтворювачБавовниСервіс залужнийСтворювачБавовниСервіс;
    private final Printer printer;

    @Override
    public void run(String... args) {
        СитуаціяНаФронті ситуаціяНаФронті = ситуаціяВКриму();
        try {
            дизаСервіс.перевірити(ситуаціяНаФронті);
            залужнийСтворювачБавовниСервіс.зробитиБавовну(ситуаціяНаФронті);
        } catch (ДизаЕксепшн е) {
            printer.print("Задетекчена диза");
            printer.print(е.getMessage());
        }
    }

    private СитуаціяВКриму ситуаціяВКриму() {
        return new СитуаціяВКриму(
                130,
                ТягаДоКуріння.СЕРЕДНЯ,
                true,
                НастрійПаровознюка.НОРМАЛЬНИЙ,
                true,
                4
        );
    }

    private СитуаціяНаСхідномуФронті ситуаціяНаСхідномуФронті() {
        return new СитуаціяНаСхідномуФронті(
                120,
                ТягаДоКуріння.СИЛЬНА,
                true,
                НастрійПаровознюка.НОРМАЛЬНИЙ,
                СхіднеМісто.ІЗЮМ
        );
    }

    private СитуаціяНаПівденномуФронті ситуаціяНаПівденномуФронті() {
        return new СитуаціяНаПівденномуФронті(
                120,
                ТягаДоКуріння.СИЛЬНА,
                true,
                НастрійПаровознюка.НОРМАЛЬНИЙ,
                РиторикаПропагандистів.МИ_ГОТОВІ_ДО_ШАГУ_ДОБРОЇ_ВОЛІ
        );
    }

    private СитуаціяНаПівнічномуФронті ситуаціяНаПівнічномуФронті() {
        return new СитуаціяНаПівнічномуФронті(
                110,
                ТягаДоКуріння.СЕРЕДНЯ,
                true,
                НастрійПаровознюка.НОРМАЛЬНИЙ,
                ПораРоку.ЛІТО
        );
    }
}
