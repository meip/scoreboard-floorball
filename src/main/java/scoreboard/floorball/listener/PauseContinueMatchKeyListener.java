/**
 * PauseContinueMatchKeyListener.java 20.9.2010
 */
package scoreboard.floorball.listener;

import scoreboard.floorball.JScoreboardManager;
import scoreboard.floorball.state.StateHolder;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class PauseContinueMatchKeyListener implements KeyListener {

    /**
     *
     */
    private final JScoreboardManager frame;

    /**
     * @param JScoreboardManager
     */
    public PauseContinueMatchKeyListener(
            final JScoreboardManager JScoreboardManager) {
        this.frame = JScoreboardManager;
    }

    @Override
    public void keyTyped(final KeyEvent e) {
    }

    @Override
    public void keyReleased(final KeyEvent e) {
    }

    @Override
    public void keyPressed(final KeyEvent e) {
        if (this.frame.getCurrentDisplay() != null) {
            System.out.println("key - " + e.getKeyCode());
            if (this.frame.getStateHolder().getState() == StateHolder.STATE_MATCH_PAUSED) {
                if (37 == e.getKeyCode()) {
                    this.frame.getCurrentDisplay().goBackInTime(-1);
                }
                if (39 == e.getKeyCode()) {
                    this.frame.getCurrentDisplay().goBackInTime(1);
                }
            }
            final int keyCodeSpace = 32;
            if (keyCodeSpace == e.getKeyCode()) {
                if (this.frame.getStateHolder().getState() == StateHolder.STATE_MATCH_STARTED) {
                    this.frame.getPauseMatchAction().actionPerformed(new ActionEvent(
                            this.frame.getPauseMatchButton(), 0, "space pressed"));
                } else {
                    this.frame.getContinueMatchAction().actionPerformed(new ActionEvent(
                            this.frame.getContinueMatchButton(), 0, "space pressed"));
                }
            }
        }
    }
}