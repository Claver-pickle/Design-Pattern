package FactoryPattern.Example02;
//ConcreteProduct
public class NaverUser implements User{

    @Override
    public void signup() {
        System.out.println("네이버 아이디로 가입");
    }

    @Override
    public void signout() {
        System.out.println("카카오톡 로그아웃");
    }
    
}
