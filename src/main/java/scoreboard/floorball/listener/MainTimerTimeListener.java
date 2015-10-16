package scoreboard.floorball.listener;

import scoreboard.floorball.JScoreboardDisplay;
import scoreboard.floorball.state.StateHolder;
import scoreboard.sound.SoundPlayer;
import scoreboard.timer.TimerTaskListener;

public class MainTimerTimeListener implements TimerTaskListener {

    /**
     * frame
     */
    private final JScoreboardDisplay frame;

    /**
     * Creates new instance.
     *
     * @param jScoreboardDisplay
     */
    public MainTimerTimeListener(final JScoreboardDisplay jScoreboardDisplay) {
        this.frame = jScoreboardDisplay;
    }

    @Override
    public void taskEnded() {
        this.frame.getMainTimer().pause();
        new SoundPlayer().playHorn();
        this.frame.getMainTimer().removeMainTimerListener(this.frame.getMainTimerTask());
        this.frame.setMainTimerTask(null);
        this.frame.getManagerFrame().getTimeField().setText("20:00");
        this.frame.getTimeLabel().setText("20:00");
        final Integer period = Integer.valueOf(this.frame.getPeriodLabel().getText()) + 1;
        this.frame.getManagerFrame().getPeriodSpinner().setValue(period.toString());
        this.frame.getManagerFrame().setState(StateHolder.STATE_PERIOD_ENDED);
    }

    @Override
    public void timeChanged() {
        this.frame.getTimeLabel().setText(this.frame.getMainTimerTask().toString("mm:ss"));
        this.frame.getManagerFrame().getTimeField().setText(this.frame.getMainTimerTask().toString("mm:ss"));
    }
}