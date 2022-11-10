package com.holovenko.springpatterns.chain;

import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import com.holovenko.springpatterns.entity.frontline.ТягаДоКуріння;
import org.springframework.stereotype.Component;

@Component
public class КурінняМоскалівДизаВалідатор implements ДизаВалідатор {
    @Override
    public void перевіритиНаДизу(СитуаціяНаФронті ситуаціяНаФронті) {
        if (ТягаДоКуріння.СЛАБКА.equals(ситуаціяНаФронті.getТягаМоскалівДоКуріння())) {
            throw new ДизаЕксепшн("У москалів не може бути слабка тяга до куріння");
        }
    }
}
