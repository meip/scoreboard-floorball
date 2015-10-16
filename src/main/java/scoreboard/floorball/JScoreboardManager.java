package scoreboard.floorball;

import scoreboard.floorball.action.*;
import scoreboard.floorball.listener.PauseContinueMatchKeyListener;
import scoreboard.floorball.state.State;
import scoreboard.floorball.state.StateHolder;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JScoreboardManager {
    private JPanel managerPanel;
    private JTextField hostNameField;
    private JTextField guestNameField;
    private JSpinner periodSpinner;
    private JSpinner guestGoalSpinner;
    private JFormattedTextField hostPenalty1Field;
    private JFormattedTextField guestPenalty1Field;
    private JButton cancelHostPenalty1Button;
    private JButton cancelGuestPenalty1Button;
    private JFormattedTextField hostPenalty2Field;
    private JFormattedTextField guestPenalty2Field;
    private JFormattedTextField timeField;
    private JSpinner hostGoalSpinner;
    private JButton showChronometerButton;
    private JButton startMatchButton;
    private JButton pauseMatchButton;
    private JButton continueMatchButton;
    private JButton timeoutGuestButton;
    private JButton goBackInTimeButton;
    private JButton startNextPeriodButton;
    private JButton timeoutHostButton;
    private JButton cancelHostPenalty2Button;
    private JButton cancelGuestPenalty2Button;


    private JScoreboardDisplay currentDisplay;
    private final PauseMatchAction pauseMatchAction = new PauseMatchAction(this, "Pause match");
    private final ContinueMatchAction continueMatchAction = new ContinueMatchAction(this, "Continue match");
    private final StateHolder stateHolder;
    private final Integer[] values;

    public static void main(String[] args) {
        JScoreboardManager jScoreboardManager = new JScoreboardManager();
        JFrame frame = new JFrame("JScoreboardManager");
        frame.setContentPane(jScoreboardManager.managerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(new PauseContinueMatchKeyListener(jScoreboardManager));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
                final int result = JOptionPane.showConfirmDialog(
                        frame,
                        "Do you really want to close the scoreboard?",
                        "Exit scoreboard?", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    public JScoreboardManager() {
        this.stateHolder = new StateHolder(this);
        // init values for score spinner
        this.values = new Integer[100];
        for (int i = 0; i < 100; i++) {
            this.values[i] = i;
        }
        cancelGuestPenalty1Button.setAction(new CancelPenaltyAction(this, "X", CancelPenaltyAction.Type.Guest1));
        cancelGuestPenalty2Button.setAction(new CancelPenaltyAction(this, "X", CancelPenaltyAction.Type.Guest2));
        cancelHostPenalty1Button.setAction(new CancelPenaltyAction(this, "X", CancelPenaltyAction.Type.Host1));
        cancelHostPenalty2Button.setAction(new CancelPenaltyAction(this, "X", CancelPenaltyAction.Type.Host2));
        continueMatchButton.addActionListener(this.continueMatchAction);
        pauseMatchButton.addActionListener(this.pauseMatchAction);
        showChronometerButton.addActionListener(new ShowChronometerAction(this, "Show chronometer"));
        startMatchButton.addActionListener(new StartMatchAction(this, "Start Match"));
        startNextPeriodButton.addActionListener(new StartNextPeriodAction(this, "Start next period"));
        goBackInTimeButton.addActionListener(new GoBackInTimeAction(this, "Go back in Time"));
        timeoutHostButton.setAction(new TimeOutAction(this, "Time-Out Host"));
        timeoutHostButton.setActionCommand("TimeoutHost");
        timeoutGuestButton.setAction(new TimeOutAction(this, "Time-Out Guest"));
        timeoutGuestButton.setActionCommand("TimeoutGuest");
        timeField.setFormatterFactory(new DefaultFormatterFactory(createFormatter("##:##")));
        timeField.setText("20:00");
        guestPenalty1Field.setFormatterFactory(new DefaultFormatterFactory(createFormatter("#:##")));
        guestPenalty2Field.setFormatterFactory(new DefaultFormatterFactory(createFormatter("#:##")));
        hostPenalty1Field.setFormatterFactory(new DefaultFormatterFactory(createFormatter("#:##")));
        hostPenalty2Field.setFormatterFactory(new DefaultFormatterFactory(createFormatter("#:##")));
        guestGoalSpinner.setModel(new SpinnerListModel(values));
        hostGoalSpinner.setModel(new SpinnerListModel(values));
        periodSpinner.setModel(new SpinnerListModel(new String[]{"1", "2", "3"}));
        // setup default state (start state)
        setState(StateHolder.STATE_DEFAULT);
    }

    protected MaskFormatter createFormatter(final String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (final java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
        }
        return formatter;
    }

    /**
     * @param state
     * @see scoreboard.floorball.state.StateHolder#setState(scoreboard.floorball.state.State)
     */
    public final void setState(State state) {
        this.stateHolder.setState(state);
    }

    public void setCurrentDisplay(JScoreboardDisplay currentDisplay) {
        this.currentDisplay = currentDisplay;
    }

    public JScoreboardDisplay getCurrentDisplay() {
        return currentDisplay;
    }

    public JTextField getGuestNameField() {
        return guestNameField;
    }

    public JTextField getHostNameField() {
        return hostNameField;
    }

    public JSpinner getGuestGoalSpinner() {
        return guestGoalSpinner;
    }

    public JSpinner getHostGoalSpinner() {
        return hostGoalSpinner;
    }

    public JSpinner getPeriodSpinner() {
        return periodSpinner;
    }

    public JFormattedTextField getGuestPenalty1Field() {
        return guestPenalty1Field;
    }

    public JFormattedTextField getGuestPenalty2Field() {
        return guestPenalty2Field;
    }

    public JFormattedTextField getHostPenalty1Field() {
        return hostPenalty1Field;
    }

    public JFormattedTextField getHostPenalty2Field() {
        return hostPenalty2Field;
    }

    public JFormattedTextField getTimeField() {
        return timeField;
    }

    public JButton getCancelGuestPenalty1Button() {
        return cancelGuestPenalty1Button;
    }

    public JButton getCancelGuestPenalty2Button() {
        return cancelGuestPenalty2Button;
    }

    public JButton getCancelHostPenalty1Button() {
        return cancelHostPenalty1Button;
    }

    public JButton getCancelHostPenalty2Button() {
        return cancelHostPenalty2Button;
    }

    public JButton getContinueMatchButton() {
        return continueMatchButton;
    }

    public JButton getGoBackInTimeButton() {
        return goBackInTimeButton;
    }

    public JButton getPauseMatchButton() {
        return pauseMatchButton;
    }

    public JButton getShowChronometerButton() {
        return showChronometerButton;
    }

    public JButton getStartMatchButton() {
        return startMatchButton;
    }

    public JButton getStartNextPeriodButton() {
        return startNextPeriodButton;
    }

    public JButton getTimeoutGuestButton() {
        return timeoutGuestButton;
    }

    public JButton getTimeoutHostButton() {
        return timeoutHostButton;
    }

    public StateHolder getStateHolder() {
        return stateHolder;
    }

    public PauseMatchAction getPauseMatchAction() {
        return pauseMatchAction;
    }

    public ContinueMatchAction getContinueMatchAction() {
        return continueMatchAction;
    }
}
