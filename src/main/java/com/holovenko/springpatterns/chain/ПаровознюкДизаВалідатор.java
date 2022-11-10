package com.holovenko.springpatterns.chain;

import com.holovenko.springpatterns.entity.frontline.НастрійПаровознюка;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import org.springframework.stereotype.Component;

@Component
public class ПаровознюкДизаВалідатор implements ДизаВалідатор {
    @Override
    public void перевіритиНаДизу(СитуаціяНаФронті ситуаціяНаФронті) {
        if (НастрійПаровознюка.ЧУДОВИЙ.equals(ситуаціяНаФронті.getНастрійПаровознюка())) {
            throw new ДизаЕксепшн("Чи бачили ви коли небудь Паровознюка у гарному настрої? Ось я і не бачив");
        }
    }
}
