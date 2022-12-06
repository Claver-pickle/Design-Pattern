package Example02.director;

import Example02.builder.ToyBuilder;
import Example02.product.Toy;

public class Director {
    private ToyBuilder toyBuilder;

    public void setToyBuilder(ToyBuilder toyBuilder){
        this.toyBuilder = toyBuilder;
    }

    public Toy constructToy(){
        //이런식으로 적은게 메소드 체이닝 방식...
        return toyBuilder.create()
                .buildName()
                .buildHair()
                .buildClothes()
                .buildPants()
                .buildShoes()
                .getToy();
    }
}
