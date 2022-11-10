package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.frontline.Напрямок;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаСхідномуФронті;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class СитуаціяНаСхідномуФронтіНапрямокСтратегія implements СитуаціяНаФронтіНапрямокСтратегія {
    @Override
    public List<String> отриматиЦілевказання(СитуаціяНаФронті ситуаціяНаФронті) {
        СитуаціяНаСхідномуФронті ситуаціяНаСхідномуФронті = (СитуаціяНаСхідномуФронті) ситуаціяНаФронті;
        return List.of(String.format("Беремо місто %s в котел", ситуаціяНаСхідномуФронті.getМістоВКотлі().getНазва()));
    }

    @Override
    public Напрямок напрямок() {
        return Напрямок.СХІД;
    }
}
