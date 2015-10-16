package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;


public class MatchPausedState extends AbstractState {

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyGuest2(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyGuest2(JScoreboardManager frame) {
        frame.getCancelGuestPenalty2Button().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyGuest1(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyGuest1(JScoreboardManager frame) {
        frame.getCancelGuestPenalty1Button().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyHost2(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyHost2(JScoreboardManager frame) {
        frame.getCancelHostPenalty2Button().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnCancelPenaltyHost1(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnCancelPenaltyHost1(JScoreboardManager frame) {
        frame.getCancelHostPenalty1Button().setEnabled(true);
    }


    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.State#initBtnTimeoutHost(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnTimeoutGuest(JScoreboardManager frame) {
        frame.getTimeoutGuestButton().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.floorball.state.AbstractState#initBtnTimeoutHost(scoreboard.floorball.JScoreboardManager)
     */
    @Override
    public void initBtnTimeoutHost(JScoreboardManager frame) {
        frame.getTimeoutHostButton().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initSpinnerGuest(scoreboard.floorball .JChronometerManagerFrame)
     */
    @Override
    public void initSpinnerGuest(final JScoreboardManager frame) {
        frame.getGuestGoalSpinner().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initBtnGoBackInTime(scoreboard.floorball. JScoreboardManager)
     */
    @Override
    public void initBtnGoBackInTime(final JScoreboardManager frame) {
        frame.getGoBackInTimeButton().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initSpinnerHost(scoreboard.floorball .JChronometerManagerFrame)
     */
    @Override
    public void initSpinnerHost(final JScoreboardManager frame) {
        frame.getHostGoalSpinner().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @seecom.ondrejkvasnovsky.chronometer.state.JChronometerManagerFrameState#initSpinnerPeriod(com.ondrejkvasnovsky.
     * chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initSpinnerPeriod(final JScoreboardManager frame) {
        frame.getPeriodSpinner().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @seecom.ondrejkvasnovsky.chronometer.state.AbstractState#initBtnContinueMatch(scoreboard.floorball.
     * JScoreboardManager)
     */
    @Override
    public void initBtnContinueMatch(final JScoreboardManager frame) {
        frame.getContinueMatchButton().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initTxtGuest(scoreboard.floorball .JChronometerManagerFrame)
     */
    @Override
    public void initTxtGuest(final JScoreboardManager frame) {
        frame.getGuestNameField().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initTxtGuestPenality1(com.ondrejkvasnovsky
     * .chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initTxtGuestPenality1(final JScoreboardManager frame) {
        if (":".equals(frame.getGuestPenalty1Field().getText().trim())) {
            frame.getGuestPenalty1Field().setEnabled(true);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initTxtGuestPenalty1(com.ondrejkvasnovsky
     * .chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initTxtGuestPenalty1(final JScoreboardManager frame) {
        if (":".equals(frame.getGuestPenalty2Field().getText().trim())) {
            frame.getGuestPenalty2Field().setEnabled(true);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initTxtHost(scoreboard.floorball .JChronometerManagerFrame)
     */
    @Override
    public void initTxtHost(final JScoreboardManager frame) {
        frame.getHostNameField().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initTxtHostPenalty1(com.ondrejkvasnovsky.
     * chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initTxtHostPenalty1(final JScoreboardManager frame) {
        if (":".equals(frame.getHostPenalty1Field().getText().trim())) {
            frame.getHostPenalty1Field().setEnabled(true);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see scoreboard.floorball.state.State#initTxtHostPenalty2(com.ondrejkvasnovsky.
     * chronometer.JChronometerManagerFrame)
     */
    @Override
    public void initTxtHostPenalty2(final JScoreboardManager frame) {
        if (":".equals(frame.getHostPenalty2Field().getText().trim())) {
            frame.getHostPenalty2Field().setEnabled(true);
        }
    }
}
