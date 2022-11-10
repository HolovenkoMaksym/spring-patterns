package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.bavovna.Бавовна;
import com.holovenko.springpatterns.entity.frontline.Напрямок;
import com.holovenko.springpatterns.entity.frontline.НастрійПаровознюка;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ЗалужнийСтворювачБавовниСервісІмпл implements ЗалужнийСтворювачБавовниСервіс {
    private final Map<Напрямок, СитуаціяНаФронтіНапрямокСтратегія> ситуаціяНаФронтіНапрямокСтратегіяMap;
    private final ApplicationEventPublisher applicationEventPublisher;


    public ЗалужнийСтворювачБавовниСервісІмпл(
            List<СитуаціяНаФронтіНапрямокСтратегія> ситуаціяНаФронтіНапрямокСтратегіяs,
            ApplicationEventPublisher applicationEventPublisher
    ) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.ситуаціяНаФронтіНапрямокСтратегіяMap = ситуаціяНаФронтіНапрямокСтратегіяs.stream()
                .collect(Collectors.toMap(СитуаціяНаФронтіНапрямокСтратегія::напрямок, Function.identity()));
    }

    @Override
    public void зробитиБавовну(СитуаціяНаФронті ситуаціяНаФронті) {
        if (паровознюкУПоганомуНастрої(ситуаціяНаФронті.getНастрійПаровознюка())) {
            applicationEventPublisher.publishEvent(new Бавовна(this, List.of("Паровознюк іде до москви")));
            return;
        }

        List<String> цілевказання = new ArrayList<>();
        for (int i = 0; i < ситуаціяНаФронті.getТягаМоскалівДоКуріння().getМножникБавовни(); i++) {
            if (ситуаціяНаФронті.getВідстаньДоНайближчогоХімарса() <= 150) {
                цілевказання.add("Хімарси виходять на полювання");
            }
        }

        СитуаціяНаФронтіНапрямокСтратегія ситуаціяНаФронтіНапрямокСтратегія = ситуаціяНаФронтіНапрямокСтратегіяMap.get(ситуаціяНаФронті.напрямок());
        цілевказання.addAll(ситуаціяНаФронтіНапрямокСтратегія.отриматиЦілевказання(ситуаціяНаФронті));

        applicationEventPublisher.publishEvent(new Бавовна(this, цілевказання));
    }

    private boolean паровознюкУПоганомуНастрої(НастрійПаровознюка настрійПаровознюка) {
        return НастрійПаровознюка.КРАЩЕ_НЕ_ЗНАТИ.equals(настрійПаровознюка) ||
                НастрійПаровознюка.ПОГАНИЙ.equals(настрійПаровознюка);
    }
}
