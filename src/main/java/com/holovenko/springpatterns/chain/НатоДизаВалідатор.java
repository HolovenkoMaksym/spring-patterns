package com.holovenko.springpatterns.chain;

import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

@Component
public class НатоДизаВалідатор implements ДизаВалідатор {
    @Override
    public void перевіритиНаДизу(СитуаціяНаФронті ситуаціяНаФронті) {
        if (!ситуаціяНаФронті.getЧиПрисутніВійськаНато()) {
            throw new ДизаЕксепшн("расєя воює не з Україною а з військами НАТО)))");
        }
    }
}
