/**
 * MainTimerListener.java 19.9.2010
 */
package scoreboard.timer;

public interface MainTimerListener {

    public void timeChanged(int changedTime);

    public void goBackInTime(int seconds);
}
