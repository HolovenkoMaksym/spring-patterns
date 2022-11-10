package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;

public interface ЗалужнийСтворювачБавовниСервіс {
    void зробитиБавовну(СитуаціяНаФронті ситуаціяНаФронті);
}
