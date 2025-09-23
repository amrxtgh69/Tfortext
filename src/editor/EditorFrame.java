package editor;

import javax.swing.*;
import javax.awt.*;

public class EditorFrame extends JFrame {
  private JTextArea textArea; //this is private because it belongs to the object and can be used anywhere un the class 

  //constructor
  public EditorFrame() {
    super("Tfortext");

    textArea = new JTextArea();
  }
}
  
