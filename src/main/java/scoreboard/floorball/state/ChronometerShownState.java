/**
 * ChronometerShownState.java 16.9.2010
 */
package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public class ChronometerShownState extends DefaultState {

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.AbstractState#initBtnStart(com.ondrejkvasnovsky
     * .chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initBtnStart(final JScoreboardManager frame) {
        frame.getStartMatchButton().setEnabled(true);
    }

    @Override
    public void initBtnShowChronometer(final JScoreboardManager frame) {
        frame.getShowChronometerButton().setEnabled(false);
    }
}
