/**
 * PeriodEndedState.java 19.9.2010
 */
package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public class PeriodEndedState extends AbstractState {

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.AbstractState#initBtnStartNextPeriod(scoreboard.floorball.
     * JScoreboardManager)
     */
    @Override
    public void initBtnStartNextPeriod(final JScoreboardManager frame) {
        frame.getStartNextPeriodButton().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @seecom.ondrejkvasnovsky.chronometer.state.AbstractState#initTxtTime(scoreboard.floorball.
     * JScoreboardManager)
     */
    @Override
    public void initTxtTime(final JScoreboardManager frame) {
        frame.getTimeField().setEnabled(true);
    }
}
