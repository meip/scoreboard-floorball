package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import java.awt.event.ActionEvent;


public class ContinueMatchAction extends ScoreboardAbstractAction {

    /**
     * @param frame
     * @param name
     */
    public ContinueMatchAction(final JScoreboardManager frame, final String name) {
        super(frame, name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        final JScoreboardManager frame = getFrame();
        frame.getCurrentDisplay().continueMatch();
        frame.getCurrentDisplay().updateMatchData();
        frame.getCurrentDisplay().penaltyToGuest();
        frame.getCurrentDisplay().penaltyToHost();
        frame.setState(StateHolder.STATE_MATCH_STARTED);
    }
}
