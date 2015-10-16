/**
 * ScoreboardAbstractAction.java 16.9.2010
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;

import javax.swing.*;

public abstract class ScoreboardAbstractAction extends AbstractAction {

    private final JScoreboardManager frame;

    /**
     * @param frame
     * @param name
     */
    public ScoreboardAbstractAction(final JScoreboardManager frame, final String name) {
        super(name);
        this.frame = frame;
    }

    /**
     * @return the frame
     */
    public final JScoreboardManager getFrame() {
        return this.frame;
    }

    /**
     * @param name
     * @param icon
     */
    public ScoreboardAbstractAction(final JScoreboardManager frame, final String name, final Icon icon) {
        super(name, icon);
        this.frame = frame;
    }
}
