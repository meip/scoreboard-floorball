/**
 * TimeoutAction.java, 13.12.2011 10:43:42
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author kvasnond
 */
public class TimeOutAction extends ScoreboardAbstractAction {

    /**
     * Creates new instance.
     *
     * @param frame
     * @param name
     */
    public TimeOutAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
    }

    /**
     * Creates new instance.
     *
     * @param frame
     * @param name
     * @param icon
     */
    public TimeOutAction(final JScoreboardManager frame, final String name, final Icon icon) {
        super(frame, name, icon);
    }

    /**
     * {@inheritDoc}
     *
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        final String actionCommand = e.getActionCommand();
        if ("TimeoutGuest".equals(actionCommand)) {
            getFrame().getCurrentDisplay().startTimeOutForGuest();
        } else if ("TimeoutHost".equals(actionCommand)) {
            getFrame().getCurrentDisplay().startTimeOutForHost();
        }
        getFrame().setState(StateHolder.STATE_TIMEOUT);
    }

}
