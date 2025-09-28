package editor;

import javax.swing.*;
import javax.swing.text.*;

public class EditorFrame extends JFrame {

  public EditorFrame() {
    setTitle("TforText");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);

    JScrollPane scrollPane = new JScrollPane(textArea);

    add(scrollPane);
  }
}
