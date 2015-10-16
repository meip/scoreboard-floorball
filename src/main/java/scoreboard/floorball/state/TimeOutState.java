/**
 * TimeOutState.java, 13.12.2011 13:09:42
 */
package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;


public class TimeOutState extends MatchStartedState {

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.MatchStartedState#initBtnPause(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnPause(final JScoreboardManager frame) {
        frame.getPauseMatchButton().setEnabled(false);
    }
}
