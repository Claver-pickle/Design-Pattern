package FactoryPattern.Example02;
//ConcreteProduct
public class KakaoUser implements User{

    @Override
    public void signup() {
        System.out.println("카카오톡 아이디로 가입");        
    }

    @Override
    public void signout() {
        System.out.println("카카오톡 로그아웃");
    }
    
}
