package FactoryPattern.Example02;
//ConcreteCreator
public class KakaoUserFactory extends UserFactory{

    @Override
    protected User createUser() {
        return new KakaoUser();
    }

}
