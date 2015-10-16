/**
 * DefaultState.java 16.9.2010
 */
package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public class DefaultState extends AbstractState {

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initBtnShowChronometer(com.ondrejkvasnovsky
     * .chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initBtnShowChronometer(final JScoreboardManager frame) {
        frame.getShowChronometerButton().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @seecom.ondrejkvasnovsky.chronometer.state.AbstractState#initTxtGuest(scoreboard.floorball.
     * JScoreboardManager)
     */
    @Override
    public void initTxtGuest(final JScoreboardManager frame) {
        frame.getGuestNameField().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @seecom.ondrejkvasnovsky.chronometer.state.AbstractState#initTxtHost(scoreboard.floorball.
     * JScoreboardManager)
     */
    @Override
    public void initTxtHost(final JScoreboardManager frame) {
        frame.getHostNameField().setEnabled(true);
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
