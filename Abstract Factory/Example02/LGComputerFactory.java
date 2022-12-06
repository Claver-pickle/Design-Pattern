public class LGComputerFactory implements ComputerFactory{

    public LGComputerFactory() {}

    @Override
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public LGMouse createMouse() {
        return new LGMouse();
    }
    
}
