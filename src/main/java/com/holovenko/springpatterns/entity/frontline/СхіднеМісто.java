package com.holovenko.springpatterns.entity.frontline;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum СхіднеМісто {
    БАЛАКЛІЯ("Балаклія"),
    ІЗЮМ("Ізюм"),
    ЛИМАН("Лиман");

    private final String назва;
}
