/**
 * AbstractState.java 16.9.2010
 */
package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public abstract class AbstractState implements State {

    /**
     *
     */
    public AbstractState() {
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnTimeoutHost(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnTimeoutGuest(JScoreboardManager frame) {
        frame.getTimeoutGuestButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnTimeoutHost(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnTimeoutHost(JScoreboardManager frame) {
        frame.getTimeoutHostButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnContinueMatch(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnContinueMatch(final JScoreboardManager frame) {
        frame.getContinueMatchButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnGoBackInTime(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnGoBackInTime(final JScoreboardManager frame) {
        frame.getGoBackInTimeButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnPause(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnPause(final JScoreboardManager frame) {
        frame.getPauseMatchButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnShowChronometer(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnShowChronometer(final JScoreboardManager frame) {
        frame.getShowChronometerButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnStart(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnStart(final JScoreboardManager frame) {
        frame.getStartMatchButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnStartNextPeriod(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnStartNextPeriod(final JScoreboardManager frame) {
        frame.getStartNextPeriodButton().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initPnlMain(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initPnlMain(final JScoreboardManager frame) {
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initSpinnerGuest(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initSpinnerGuest(final JScoreboardManager frame) {
        frame.getGuestGoalSpinner().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initSpinnerHost(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initSpinnerHost(final JScoreboardManager frame) {
        frame.getHostGoalSpinner().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initSpinnerPeriod(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initSpinnerPeriod(final JScoreboardManager frame) {
        frame.getPeriodSpinner().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtGuest(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtGuest(final JScoreboardManager frame) {
        frame.getGuestNameField().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtGuestPenalty1(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtGuestPenalty1(final JScoreboardManager frame) {
        frame.getGuestPenalty1Field().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyGuest2(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyGuest2(JScoreboardManager frame) {
        frame.getCancelGuestPenalty2Button().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyGuest1(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyGuest1(JScoreboardManager frame) {
        frame.getCancelGuestPenalty1Button().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyHost2(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyHost2(JScoreboardManager frame) {
        frame.getCancelHostPenalty2Button().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyHost1(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyHost1(JScoreboardManager frame) {
        frame.getCancelHostPenalty1Button().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtGuestPenalty2(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtGuestPenalty2(final JScoreboardManager frame) {
        frame.getGuestPenalty2Field().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtHost(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtHost(final JScoreboardManager frame) {
        frame.getGuestNameField().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtHostPenalty1(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtHostPenalty1(final JScoreboardManager frame) {
        frame.getHostPenalty1Field().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtHostPenalty2(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtHostPenalty2(final JScoreboardManager frame) {
        frame.getHostPenalty2Field().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initTxtTime(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initTxtTime(final JScoreboardManager frame) {
        frame.getTimeField().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initFocus(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initFocus(JScoreboardManager frame){

    }
}
