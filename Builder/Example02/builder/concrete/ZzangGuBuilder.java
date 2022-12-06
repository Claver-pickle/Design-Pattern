package Example02.builder.concrete;

import Example02.builder.ToyBuilder;

public class ZzangGuBuilder extends ToyBuilder{

    //return this를 하면서 해당 객체를 계속 리턴하는 방식으로 메소드 체이닝 방식이 가능해진다.
    @Override
    public ToyBuilder buildName() {
        toy.setName("ZzangGu");
        return this;
    }

    @Override
    public ToyBuilder buildHair() {
        toy.setHair("Short black");
        return this;
    }

    @Override
    public ToyBuilder buildClothes() {
        toy.setClothes("Red short sleeved T-shirt");
        return this;
    }

    @Override
    public ToyBuilder buildPants() {
        toy.setPants("Yellow shorts");
        return this;
    }

    @Override
    public ToyBuilder buildShoes() {
        toy.setShoes("Yellow");
        return this;
    }
    
}
