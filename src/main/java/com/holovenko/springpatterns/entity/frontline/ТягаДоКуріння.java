package com.holovenko.springpatterns.entity.frontline;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ТягаДоКуріння {
    СЛАБКА(0),
    СЕРЕДНЯ(1),
    СИЛЬНА(2);

    private final Integer множникБавовни;
}
