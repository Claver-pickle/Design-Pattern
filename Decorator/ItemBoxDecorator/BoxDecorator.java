public class BoxDecorator extends Decorator{

    public BoxDecorator(Item item) {
        super(item);
    }

    @Override
    public int getLinesCount() {
        return item.getLinesCount() + 2;
    }

    @Override
    public int getMaxLength() {
        return item.getMaxLength() + 2;
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index) + 2;
    }

    @Override
    public String getString(int index) {
        return null;
    }

    
    
}
