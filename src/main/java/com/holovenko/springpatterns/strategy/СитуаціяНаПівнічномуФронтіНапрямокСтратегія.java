package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.frontline.Напрямок;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаПівденномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаПівнічномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.holovenko.springpatterns.entity.frontline.ПораРоку.ВЕСНА;
import static com.holovenko.springpatterns.entity.frontline.ПораРоку.ЗИМА;
import static com.holovenko.springpatterns.entity.frontline.ПораРоку.ЛІТО;
import static com.holovenko.springpatterns.entity.frontline.ПораРоку.ОСІНЬ;

@Component
public class СитуаціяНаПівнічномуФронтіНапрямокСтратегія implements СитуаціяНаФронтіНапрямокСтратегія {
    @Override
    public List<String> отриматиЦілевказання(СитуаціяНаФронті ситуаціяНаФронті) {
        List<String> цілевказання = new ArrayList<>();
        СитуаціяНаПівнічномуФронті ситуаціяНаПівнічномуФронті = (СитуаціяНаПівнічномуФронті) ситуаціяНаФронті;
        switch (ситуаціяНаПівнічномуФронті.getПораРоку()) {
            case ЛІТО -> цілевказання.add("Сили ЗСУ чекають поки білоруська армія викопає ранню картоплю");
            case ВЕСНА -> цілевказання.add("Сили ЗСУ чекають поки білоруська армія посіє картоплю");
            case ОСІНЬ -> цілевказання.add("Сили ЗСУ чекають поки білоруська армія викопає пізню картоплю");
            case ЗИМА -> цілевказання.add("Сили ЗСУ чекають поки білоруська армія з'їсть картоплю");
            default -> цілевказання.add("Сили ЗСУ укріплюють позиції");
        }
        return цілевказання;
    }

    @Override
    public Напрямок напрямок() {
        return Напрямок.ПІВНІЧ;
    }
}
