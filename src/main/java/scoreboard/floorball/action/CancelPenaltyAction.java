/**
 * CancelPenaltyAction.java, 13.12.2011 18:52:13
 */
package scoreboard.floorball.action;

import scoreboard.floorball.JScoreboardManager;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author kvasnond
 */
public class CancelPenaltyAction extends ScoreboardAbstractAction {

    public enum Type {
        Host1, Host2, Guest1, Guest2
    }

    private Type type;

    /**
     * Creates new instance.
     *
     * @param frame
     * @param name
     */
    public CancelPenaltyAction(final JScoreboardManager frame, final String name, final Type type) {
        super(frame, name);
        this.type = type;
    }

    /**
     * Creates new instance.
     *
     * @param frame
     * @param name
     * @param icon
     */
    public CancelPenaltyAction(final JScoreboardManager frame, final String name, final Icon icon) {
        super(frame, name, icon);
    }

    /**
     * {@inheritDoc}
     *
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println("X " + this.type);
        switch (type) {
            case Host1:
                getFrame().getCurrentDisplay().getHostPenalty1Timer().setTime(0);
                getFrame().getCurrentDisplay().getPenaltyHost1Label().setText("");
                getFrame().getHostPenalty1Field().setText("");
                break;
            case Host2:
                getFrame().getCurrentDisplay().getHostPenalty2Timer().setTime(0);
                getFrame().getCurrentDisplay().getPenaltyHost2Label().setText("");
                getFrame().getHostPenalty2Field().setText("");
                break;
            case Guest1:
                getFrame().getCurrentDisplay().getGuestPenalty1Timer().setTime(0);
                getFrame().getCurrentDisplay().getPenaltyGuest1Label().setText("");
                getFrame().getGuestPenalty1Field().setText("");
                break;
            case Guest2:
                getFrame().getCurrentDisplay().getGuestPenalty2Timer().setTime(0);
                getFrame().getCurrentDisplay().getPenaltyGuest2Label().setText("");
                getFrame().getGuestPenalty2Field().setText("");
                break;

        }
    }

}
