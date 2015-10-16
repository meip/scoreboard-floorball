/**
 * PauseMatchAction.java 16.9.2010
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import java.awt.event.ActionEvent;

public class PauseMatchAction extends ScoreboardAbstractAction {

    /**
     * @param frame
     * @param name
     */
    public PauseMatchAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        getFrame().getCurrentDisplay().pauseMatch();
        getFrame().setState(StateHolder.STATE_MATCH_PAUSED);
    }
}
