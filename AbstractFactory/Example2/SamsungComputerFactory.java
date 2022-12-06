public class SamsungComputerFactory implements ComputerFactory{
    //삼성 컴퓨터 공장
    public SamsungComputerFactory() {
    }

    @Override
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }
    
}
