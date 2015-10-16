/**
 * StartMatchAction.java 16.9.2010
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import java.awt.event.ActionEvent;

public class StartMatchAction extends ScoreboardAbstractAction {

    /**
     *
     */
    private static final long serialVersionUID = -4559207726606808606L;

    /**
     * @param frame
     * @param name
     */
    public StartMatchAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        getFrame().getCurrentDisplay().startMatch();
        getFrame().setState(StateHolder.STATE_MATCH_STARTED);
    }
}
