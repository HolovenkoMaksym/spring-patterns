package com.holovenko.springpatterns.chain;

import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ДизаСервісІмпл implements ДизаСервіс {

    private final List<ДизаВалідатор> дизаВалідаторs;

    @Override
    public void перевірити(СитуаціяНаФронті ситуаціяНаФронті) {

        дизаВалідаторs
                .forEach(дизаВалідатор -> дизаВалідатор.перевіритиНаДизу(ситуаціяНаФронті));
    }
}
