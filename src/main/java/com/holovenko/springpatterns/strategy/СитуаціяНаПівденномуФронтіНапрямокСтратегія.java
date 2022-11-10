package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.frontline.Напрямок;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаПівденномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class СитуаціяНаПівденномуФронтіНапрямокСтратегія implements СитуаціяНаФронтіНапрямокСтратегія {
    @Override
    public List<String> отриматиЦілевказання(СитуаціяНаФронті ситуаціяНаФронті) {
        List<String> цілевказання = new ArrayList<>();
        СитуаціяНаПівденномуФронті ситуаціяНаПівденномуФронті = (СитуаціяНаПівденномуФронті) ситуаціяНаФронті;
        switch (ситуаціяНаПівденномуФронті.getРиторикаПропагандистів()) {
            case МИ_ГОТОВІ_ДО_ШАГУ_ДОБРОЇ_ВОЛІ -> цілевказання.add("Сили ЗСУ проривають лінію оборони");
            case ТАКИМИ_ТЕМПАМИ_ВОНИ_ЗАЙМУТЬ_КРИМ_ДО_НОВОГО_РОКУ -> цілевказання.add("Сили ЗСУ звільняють черговий населений пункт");
            case НІЯКОЇ_ЕВАКУАЦІЇ_НЕМАЄ -> цілевказання.add("Сили ЗСУ накопичують бойову міць");
            default -> цілевказання.add("Чекаємо інформацію від генштабу");
        }
        цілевказання.add("Обираємо цілі подалі від скупчення кавунів та виноградних полів");
        return цілевказання;
    }

    @Override
    public Напрямок напрямок() {
        return Напрямок.ПІВДЕНЬ;
    }
}
