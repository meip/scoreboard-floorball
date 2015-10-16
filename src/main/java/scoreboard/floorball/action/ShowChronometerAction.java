/**
 * ShowChronometerAction.java 16.9.2010
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardDisplay;
import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import java.awt.event.ActionEvent;

public class ShowChronometerAction extends ScoreboardAbstractAction {

    /**
     * @param frame
     * @param name
     */
    public ShowChronometerAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        final JScoreboardDisplay chronometer = new JScoreboardDisplay(getFrame());
        getFrame().setCurrentDisplay(chronometer);
        getFrame().setState(StateHolder.STATE_START_ENABLED);
    }
}
