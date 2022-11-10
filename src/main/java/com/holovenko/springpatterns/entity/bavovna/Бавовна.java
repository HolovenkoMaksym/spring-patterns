package com.holovenko.springpatterns.entity.bavovna;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.util.List;

@Getter
public class Бавовна extends ApplicationEvent {
    private final List<String> цілевказання;

    public Бавовна(Object source, List<String> цілевказання) {
        super(source);
        this.цілевказання = цілевказання;
    }
}
