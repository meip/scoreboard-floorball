/**
 * StartNextPeriodAction.java 16.9.2010
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class StartNextPeriodAction extends ScoreboardAbstractAction {

    /**
     * @param frame
     * @param name
     * @param icon
     */
    public StartNextPeriodAction(final JScoreboardManager frame, final String name, final Icon icon) {
        super(frame, name, icon);
    }

    /**
     * @param frame
     * @param name
     */
    public StartNextPeriodAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        getFrame().getCurrentDisplay().updateMatchData();
        getFrame().getCurrentDisplay().startNextPeriod();
        getFrame().setState(StateHolder.STATE_MATCH_STARTED);
    }
}
