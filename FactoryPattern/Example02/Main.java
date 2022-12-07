package FactoryPattern.Example02;

public class Main {
    
    public static void main(String[] args) {
        UserFactory userFactory = new NaverUserFactory();
        User user = userFactory.newInstance();

        UserFactory userFactory2 = new KakaoUserFactory();
        User user2 = userFactory2.newInstance();
    }
}
