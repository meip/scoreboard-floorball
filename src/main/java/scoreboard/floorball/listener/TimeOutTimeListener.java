/**
 * TimeOutTimeListener.java, 13.12.2011 15:21:28
 */
package scoreboard.floorball.listener;

import scoreboard.floorball.JScoreboardDisplay;
import scoreboard.floorball.state.StateHolder;
import scoreboard.sound.SoundPlayer;
import scoreboard.timer.MainTimer;
import scoreboard.timer.TimerTaskListener;

/**
 * @author kvasnond
 */
public class TimeOutTimeListener implements TimerTaskListener {

    public enum Type {
        Host, Guest
    }

    /**
     * frame
     */
    private final JScoreboardDisplay frame;
    private final Type type;

    /**
     * Creates new instance.
     *
     * @param frame
     */
    public TimeOutTimeListener(final JScoreboardDisplay frame, Type type) {
        this.frame = frame;
        this.type = type;
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.timer.TimerTaskListener#taskEnded()
     */
    @Override
    public void taskEnded() {
        new SoundPlayer().playHorn();
        this.frame.getTimeOutLabel().setText("");
        this.frame.getTimeOutGuestLabel().setText("");
        this.frame.getTimeOutLHostLabel().setText("");
        this.frame.getManagerFrame().setState(StateHolder.STATE_MATCH_PAUSED);
        this.frame.getTimeoutTimer().pause();
        this.frame.setTimeoutTimer(null);
        this.frame.setTimeoutTimer(new MainTimer());
    }

    /**
     * {@inheritDoc}
     *
     * @see scoreboard.timer.TimerTaskListener#timeChanged()
     */
    @Override
    public void timeChanged() {
        switch (type) {
            case Host:
                this.frame.getTimeOutLabel().setText(this.frame.getTimeOutHostTimerTask().toString("mm:ss"));
                break;
            case Guest:
                this.frame.getTimeOutLabel().setText(this.frame.getTimeOutGuestTimerTask().toString("mm:ss"));
                break;
        }
    }

}
