package com.holovenko.springpatterns.strategy;

import com.holovenko.springpatterns.entity.frontline.Напрямок;
import com.holovenko.springpatterns.entity.frontline.СитуаціяНаФронті;

import java.util.List;

public interface СитуаціяНаФронтіНапрямокСтратегія {
    List<String> отриматиЦілевказання(СитуаціяНаФронті ситуаціяНаФронті);
    Напрямок напрямок();
}
