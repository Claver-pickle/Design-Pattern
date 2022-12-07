package FactoryPattern.Example02;
//Creator
public abstract class UserFactory {
    
    public User users;

    public User newInstance(){
        User user = createUser();
        user.signup();
        return user;
    }

    protected abstract User createUser();
}
