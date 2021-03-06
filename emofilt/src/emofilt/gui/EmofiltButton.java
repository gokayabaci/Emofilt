/*
 * Created on 13.01.2005
 *
 * @author Felix Burkhardt
 */
package emofilt.gui;

import java.awt.Font;
import javax.swing.JButton;

import emofilt.Emofilt;

/**
 * Emofilt specific GUI element.
 * 
 * @author Felix Burkhardt
 */
public class EmofiltButton extends JButton {

    /**
     * Constructor given a label.
     */
    public EmofiltButton(String s) {
        super(s);
        setFont(new Font(Emofilt._config.getString("mainFrame.font.name"), Integer
                .parseInt(Emofilt._config.getString("mainFrame.font.style")),
                Integer.parseInt(Emofilt._config.getString("mainFrame.font.size"))));
    }

}
