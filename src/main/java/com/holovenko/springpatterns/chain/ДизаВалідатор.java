package com.holovenko.springpatterns.chain;

import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;

public interface ДизаВалідатор {
    void перевіритиНаДизу(СитуаціяНаФронті ситуаціяНаФронті);
}
