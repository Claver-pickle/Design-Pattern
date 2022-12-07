package FactoryPattern.Example02;
//ConcreteCreator
public class NaverUserFactory extends UserFactory{

    @Override
    protected User createUser() {
        return new NaverUser();
    }
    
}
