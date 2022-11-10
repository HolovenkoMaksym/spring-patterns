package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.frontline.Напрямок;
import com.holovenko.springpatterns.entity.frontline.СитуаціяВКриму;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class СитуаціяВКримуНапрямокСтратегія implements СитуаціяНаФронтіНапрямокСтратегія {
    @Override
    public List<String> отриматиЦілевказання(СитуаціяНаФронті ситуаціяНаФронті) {
        List<String> цілевказання = new ArrayList<>();
        СитуаціяВКриму ситуаціяВКриму = (СитуаціяВКриму) ситуаціяНаФронті;
        if (ситуаціяВКриму.getНаявністьДобрихЛюдейЗВибухівкоюУВантажівці()) {
            цілевказання.add("Добрі люди спалюють мости");
        }
        if (ситуаціяВКриму.getКількістьНаводнихДронівКамікадзе() > 0) {
            цілевказання.add("Флот РФ прилягає відпочивати на дно");
        }
        return цілевказання;
    }

    @Override
    public Напрямок напрямок() {
        return Напрямок.КРИМ;
    }
}
