import javafx.scene.text.Text;

public abstract class ComponentFactory {
    public abstract Button createButton(String caption);
    public abstract CheckBox creatCheckBox(boolean bChecked);
    public abstract TextEdit creaTextEdit(String value);
}
