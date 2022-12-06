public class MainEntry {
    
    public static void main(String[] args){
        ComponentFactory factory = new LinuxFactory();

        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.creatCheckBox(false);
        TextEdit textEdit = factory.creaTextEdit("디자인패턴");

        button.render();
        checkBox.render();
        textEdit.render();

        button.clickEvent();
        checkBox.setChecked(true);
        textEdit.setValue("GoF의 디자인패턴");
    }
}
