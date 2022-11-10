package com.holovenko.springpatterns.chain;

import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

@Component
public class ХімарсДизаВалідатор implements ДизаВалідатор {
    @Override
    public void перевіритиНаДизу(СитуаціяНаФронті ситуаціяНаФронті) {
        if (ситуаціяНаФронті.getВідстаньДоНайближчогоХімарса() <= 100) {
            throw new ДизаЕксепшн("Хімарси не підходять до позицій настільки близько");
        }
    }
}
