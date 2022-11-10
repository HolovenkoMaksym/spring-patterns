package com.holovenko.springpatterns.entity.frontline;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class СитуаціяНаФронті {
    private final Integer відстаньДоНайближчогоХімарса;
    private final ТягаДоКуріння тягаМоскалівДоКуріння;
    private final Boolean чиПрисутніВійськаНато;
    private final НастрійПаровознюка настрійПаровознюка;

    public abstract Напрямок напрямок();
}
