package scoreboard.floorball.listener;

import scoreboard.floorball.JScoreboardDisplay;
import scoreboard.timer.TimerTask;
import scoreboard.timer.TimerTaskListener;

import javax.swing.*;


public class PenaltyTimeListener implements TimerTaskListener {

    /**
     * frame
     */
    private final JScoreboardDisplay frame;
    private final JLabel lbl;
    private final TimerTask timer;
    private final JTextField txt;

    /**
     * @param lbl
     * @param frame TODO
     */
    public PenaltyTimeListener(JScoreboardDisplay frame, final JLabel lbl, final JTextField txt, final TimerTask timer) {
        this.frame = frame;
        this.lbl = lbl;
        this.txt = txt;
        this.timer = timer;
    }

    @Override
    public void taskEnded() {
        if (this.timer == getFrame().getGuestPenalty1Timer()) {
            getFrame().getManagerFrame().getGuestPenalty1Field().setText("");
            getFrame().getPenaltyGuest1Label().setText(" ");
            getFrame().getMainTimer().removeMainTimerListener(getFrame().getGuestPenalty1Timer());
            getFrame().setGuestPenalty1Timer(null);
        } else if (this.timer == getFrame().getGuestPenalty2Timer()) {
            getFrame().getManagerFrame().getGuestPenalty2Field().setText("");
            getFrame().getPenaltyGuest2Label().setText(" ");
            getFrame().getMainTimer().removeMainTimerListener(getFrame().getGuestPenalty2Timer());
            getFrame().setGuestPenalty2Timer(null);
        } else if (this.timer == getFrame().getHostPenalty1Timer()) {
            getFrame().getManagerFrame().getHostPenalty1Field().setText("");
            getFrame().getPenaltyHost1Label().setText(" ");
            getFrame().getMainTimer().removeMainTimerListener(getFrame().getHostPenalty1Timer());
            getFrame().setHostPenalty1Timer(null);
        } else if (this.timer == getFrame().getHostPenalty2Timer()) {
            getFrame().getManagerFrame().getHostPenalty2Field().setText("");
            getFrame().getPenaltyHost2Label().setText(" ");
            getFrame().getMainTimer().removeMainTimerListener(getFrame().getHostPenalty2Timer());
            getFrame().setHostPenalty2Timer(null);
        }
    }

    @Override
    public void timeChanged() {
        this.lbl.setText(this.timer.toString("m:ss"));
        this.txt.setText(this.timer.toString("m:ss"));
    }

    /**
     * Returns the frame.
     *
     * @return the frame
     */
    public JScoreboardDisplay getFrame() {
        return this.frame;
    }
}