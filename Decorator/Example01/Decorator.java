public abstract class Decorator extends Item{
    protected Item item; //item을 상속받는 모든 클래스에 대한 객체를 장식할 수 있음. 원래 내용물에 대해서도, 장식에 대해서도 장식을 할 수 있다...

    public Decorator(Item item){
        this.item = item;
    }
}
