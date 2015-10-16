package scoreboard.floorball.state;

import scoreboard.floorball.JScoreboardManager;

public interface State {

    public void initPnlMain(JScoreboardManager frame);

    public void initTxtHost(JScoreboardManager frame);

    public void initBtnStart(JScoreboardManager frame);

    public void initTxtGuestPenalty1(JScoreboardManager frame);

    public void initTxtGuestPenality1(JScoreboardManager frame);

    public void initTxtHostPenalty2(JScoreboardManager frame);

    public void initTxtHostPenalty1(JScoreboardManager frame);

    public void initBtnPause(JScoreboardManager frame);

    public void initSpinnerPeriod(JScoreboardManager frame);

    public void initSpinnerGuest(JScoreboardManager frame);

    public void initSpinnerHost(JScoreboardManager frame);

    public void initTxtGuest(JScoreboardManager frame);

    public void initTxtTime(JScoreboardManager frame);

    public void initBtnShowChronometer(JScoreboardManager frame);

    public void initBtnContinueMatch(JScoreboardManager frame);

    public void initBtnStartNextPeriod(JScoreboardManager frame);

    public void initBtnGoBackInTime(JScoreboardManager frame);

    public void initBtnTimeoutGuest(JScoreboardManager frame);

    public void initBtnTimeoutHost(JScoreboardManager frame);

    public void initBtnCancelPenaltyGuest2(JScoreboardManager frame);

    public void initBtnCancelPenaltyGuest1(JScoreboardManager frame);

    public void initBtnCancelPenaltyHost2(JScoreboardManager frame);

    public void initBtnCancelPenaltyHost1(JScoreboardManager frame);
}
