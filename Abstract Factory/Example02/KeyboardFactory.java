public class KeyboardFactory{
    
    public Keyboard creatKeyboard(String type){
        Keyboard keyboard = null;
        switch(type){
            case "LG" :
                keyboard = new LGKeyboard();
                break;
            case "Samsung" :
                keyboard = new SamsungKeyboard();
                break;
        }
        return keyboard;
    }
}
