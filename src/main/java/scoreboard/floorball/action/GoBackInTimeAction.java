/**
 * GoBackInTimeAction.java 19.9.2010
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GoBackInTimeAction extends ScoreboardAbstractAction {

    /**
     *
     */
    private static final long serialVersionUID = 3339010344298186098L;

    /**
     * @param frame
     * @param name
     */
    public GoBackInTimeAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
    }

    /**
     * @param frame
     * @param name
     * @param icon
     */
    public GoBackInTimeAction(final JScoreboardManager frame, final String name, final Icon icon) {
        super(frame, name, icon);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        final String value = JOptionPane.showInputDialog(getFrame(), "How many seconds?");
        if (value != null && value.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
            final Integer seconds = Integer.valueOf(value);
            getFrame().getCurrentDisplay().goBackInTime(seconds);
        }
    }
}
