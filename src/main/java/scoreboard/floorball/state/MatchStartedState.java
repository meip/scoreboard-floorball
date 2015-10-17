package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public class MatchStartedState extends AbstractState {

    /*
     * (non-Javadoc)
     * 
     * @seecom.ondrejkvasnovsky.chronometer.state.AbstractState#initBtnPause(scoreboard.floorball.
     * JScoreboardManager)
     */
    @Override
    public void initBtnPause(final JScoreboardManager frame) {
        frame.getPauseMatchButton().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     *
     * @see scoreboard.floorball.state.State#initFocus(com.ondrejkvasnovsky.
     * chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initFocus(JScoreboardManager frame){
        frame.getPauseMatchButton().grabFocus();
    }
}
