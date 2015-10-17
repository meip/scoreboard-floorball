/**
 * StateHolder.java 16.9.2010
 */
package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public class StateHolder {

    public static final ChronometerShownState STATE_START_ENABLED = new ChronometerShownState();
    public static final DefaultState STATE_DEFAULT = new DefaultState();
    public static final MatchStartedState STATE_MATCH_STARTED = new MatchStartedState();
    public static final MatchPausedState STATE_MATCH_PAUSED = new MatchPausedState();
    public static final PeriodEndedState STATE_PERIOD_ENDED = new PeriodEndedState();
    public static final TimeOutState STATE_TIMEOUT = new TimeOutState();

    private State state;
    private final JScoreboardManager frame;

    public StateHolder(final JScoreboardManager frame) {
        this.frame = frame;
    }

    /**
     * @return the state
     */
    public final State getState() {
        return this.state;
    }

    /**
     * @param state the state to set
     */
    public final void setState(final State state) {
        this.state = state;
        applyState();
        System.out.println(state.getClass().getSimpleName() + " applied");
    }

    private void applyState() {
        this.state.initPnlMain(this.frame);
        this.state.initTxtHost(this.frame);
        this.state.initBtnStart(this.frame);
        this.state.initTxtGuestPenalty2(this.frame);
        this.state.initTxtGuestPenalty1(this.frame);
        this.state.initTxtHostPenalty2(this.frame);
        this.state.initTxtHostPenalty1(this.frame);
        this.state.initBtnPause(this.frame);
        this.state.initSpinnerPeriod(this.frame);
        this.state.initSpinnerGuest(this.frame);
        this.state.initSpinnerHost(this.frame);
        this.state.initTxtGuest(this.frame);
        this.state.initTxtTime(this.frame);
        this.state.initBtnShowChronometer(this.frame);
        this.state.initBtnContinueMatch(this.frame);
        this.state.initBtnGoBackInTime(this.frame);
        this.state.initBtnStartNextPeriod(this.frame);
        this.state.initBtnTimeoutHost(this.frame);
        this.state.initBtnTimeoutGuest(this.frame);
        this.state.initBtnCancelPenaltyGuest1(this.frame);
        this.state.initBtnCancelPenaltyGuest2(this.frame);
        this.state.initBtnCancelPenaltyHost1(this.frame);
        this.state.initBtnCancelPenaltyHost2(this.frame);
        this.state.initFocus(this.frame);
    }
}
