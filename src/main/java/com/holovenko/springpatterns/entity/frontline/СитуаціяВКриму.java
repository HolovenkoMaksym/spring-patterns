package com.holovenko.springpatterns.entity.frontline;

import lombok.Getter;

@Getter
public class СитуаціяВКриму extends СитуаціяНаФронті {
    private final Boolean наявністьДобрихЛюдейЗВибухівкоюУВантажівці;
    private final Integer кількістьНаводнихДронівКамікадзе;

    public СитуаціяВКриму(Integer відстаньДоНайближчогоХімарса,
                          ТягаДоКуріння тягаМоскалівДоКуріння,
                          Boolean чиПрисутніВійськаНато,
                          НастрійПаровознюка настрійПаровознюка,
                          Boolean наявністьДобрихЛюдейЗВибухівкоюУВантажівці,
                          Integer кількістьНаводнихДронівКамікадзе) {
        super(відстаньДоНайближчогоХімарса, тягаМоскалівДоКуріння, чиПрисутніВійськаНато, настрійПаровознюка);
        this.наявністьДобрихЛюдейЗВибухівкоюУВантажівці = наявністьДобрихЛюдейЗВибухівкоюУВантажівці;
        this.кількістьНаводнихДронівКамікадзе = кількістьНаводнихДронівКамікадзе;
    }

    @Override
    public Напрямок напрямок() {
        return Напрямок.КРИМ;
    }
}
