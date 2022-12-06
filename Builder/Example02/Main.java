package Example02;

import Example02.builder.concrete.PoohBuilder;
import Example02.builder.concrete.ZzangGuBuilder;
import Example02.director.Director;
import Example02.product.Toy;

public class Main {
    public static void main(String[] args){
        Director director = new Director();

        PoohBuilder poohBuilder = new PoohBuilder();
        ZzangGuBuilder zzangGuBuilder = new ZzangGuBuilder();

        director.setToyBuilder(poohBuilder);
        // director.setToyBuilder(zzangGuBuilder);

        Toy toy = director.constructToy();

        System.out.println(toy);
    }
}
