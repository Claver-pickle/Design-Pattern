public abstract class Button {
    //버튼에 표시될 타이틀
    protected String caption; 

    public Button(String caption){
        this.caption = caption;
    }

    //버튼에 대한 클릭 메서드
    public void clickEvent(){
        System.out.println(caption + " 버튼을 클릭했습니다.");
    }

    //화면상의 컴포넌트를 그리는 메서드
    abstract void render();
}
