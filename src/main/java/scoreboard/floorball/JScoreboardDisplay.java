package scoreboard.floorball;

import scoreboard.floorball.listener.MainTimerTimeListener;
import scoreboard.floorball.listener.PauseContinueMatchKeyListener;
import scoreboard.floorball.listener.PenaltyTimeListener;
import scoreboard.floorball.listener.TimeOutTimeListener;
import scoreboard.timer.MainTimer;
import scoreboard.timer.TimerTask;
import utils.ResizeLabelFont;

import javax.swing.*;

public class JScoreboardDisplay {
    private JLabel hostLabel;
    private JLabel guestLabel;
    private JLabel timeOutLHostLabel;
    private JLabel timeOutLabel;
    private JLabel timeOutGuestLabel;
    private JLabel scoreGuestLabel;
    private JLabel periodLabel;
    private JLabel scoreHostLabel;
    private JLabel penaltyHost1Label;
    private JLabel penaltyHost2Label;
    private JLabel penaltyGuest1Label;
    private JLabel penaltyGuest2Label;
    private JLabel timeLabel;
    private JPanel displayPanel;

    private final JScoreboardManager managerFrame;
    private final MainTimer mainTimer = new MainTimer();
    private final String timeoutTime = "00:30";
    private MainTimer timeoutTimer = new MainTimer();
    private TimerTask mainTimerTask;
    private TimerTask timeOutGuestTimerTask;
    private TimerTask timeOutHostTimerTask;
    private TimerTask guestPenalty1Timer;
    private TimerTask guestPenalty2Timer;
    private TimerTask hostPenalty1Timer;
    private TimerTask hostPenalty2Timer;

    public JScoreboardDisplay(JScoreboardManager managerFrame) {
        this.managerFrame = managerFrame;
        this.timeLabel.setText(managerFrame.getTimeField().getText());
        this.hostLabel.setText(managerFrame.getHostNameField().getText());
        this.guestLabel.setText(managerFrame.getGuestNameField().getText());

        JFrame frame = new JFrame("FB Riders Score Board");
        frame.setContentPane(this.displayPanel);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1024, 768);
        frame.addKeyListener(new PauseContinueMatchKeyListener(managerFrame));
    }

    public void pauseMatch() {
        this.getMainTimer().pause();
    }

    public void penaltyToGuest() {
        if (this.guestPenalty1Timer == null
                && !"".equals(this.managerFrame.getGuestPenalty1Field().getText().trim())
                && !":".equals(this.managerFrame.getGuestPenalty1Field().getText().trim())) {
            this.guestPenalty1Timer = new TimerTask(this.managerFrame.getGuestPenalty1Field().getText());
            this.getMainTimer().addMainTimerListener(this.guestPenalty1Timer);
            final PenaltyTimeListener listener = new PenaltyTimeListener(
                    this, this.getPenaltyGuest1Label(),
                    this.managerFrame.getGuestPenalty1Field(),
                    this.guestPenalty1Timer);
            this.guestPenalty1Timer.add(listener);
        }
        if (this.guestPenalty2Timer == null
                && !"".equals(this.managerFrame.getGuestPenalty2Field().getText().trim())
                && !":".equals(this.managerFrame.getGuestPenalty2Field().getText().trim())) {
            this.guestPenalty2Timer = new TimerTask(this.managerFrame.getGuestPenalty2Field()
                    .getText());
            this.getMainTimer().addMainTimerListener(this.guestPenalty2Timer);
            final PenaltyTimeListener listener = new PenaltyTimeListener(
                    this, this.penaltyGuest2Label, this.managerFrame.getGuestPenalty2Field(),
                    this.guestPenalty2Timer);
            this.guestPenalty2Timer.add(listener);
        }
    }

    public void penaltyToHost() {
        if (this.hostPenalty1Timer == null
                && !"".equals(this.managerFrame.getHostPenalty1Field().getText().trim())
                && !":".equals(this.managerFrame.getHostPenalty1Field().getText().trim())) {
            this.hostPenalty1Timer = new TimerTask(this.managerFrame.getHostPenalty1Field()
                    .getText());
            final PenaltyTimeListener listener = new PenaltyTimeListener(
                    this, this.penaltyHost1Label, this.managerFrame.getHostPenalty1Field(),
                    this.hostPenalty1Timer);
            this.getMainTimer().addMainTimerListener(this.hostPenalty1Timer);
            this.hostPenalty1Timer.add(listener);
        }
        if (this.hostPenalty2Timer == null
                && !"".equals(this.managerFrame.getHostPenalty2Field().getText().trim())
                && !":".equals(this.managerFrame.getHostPenalty2Field().getText().trim())) {
            this.hostPenalty2Timer = new TimerTask(this.managerFrame.getHostPenalty2Field()
                    .getText());
            final PenaltyTimeListener listener = new PenaltyTimeListener(
                    this, this.penaltyHost2Label, this.managerFrame.getHostPenalty2Field(),
                    this.hostPenalty2Timer);
            this.getMainTimer().addMainTimerListener(this.hostPenalty2Timer);
            this.hostPenalty2Timer.add(listener);
        }
    }

    public void continueMatch() {
        this.mainTimer.cont();
    }

    public void goBackInTime(final Integer seconds) {
        this.mainTimer.goBackInTime(seconds);
        updateTimeTaskData();
    }

    public void startTimeOutForHost() {
        this.timeOutLHostLabel.setText("T");
        this.timeOutLabel.setText(timeoutTime);
        this.timeOutHostTimerTask = new TimerTask(timeoutTime);
        this.timeOutHostTimerTask.add(new TimeOutTimeListener(this, TimeOutTimeListener.Type.Host));
        this.timeoutTimer.addMainTimerListener(timeOutHostTimerTask);
        this.timeoutTimer.start();
    }


    public void startTimeOutForGuest() {
        this.timeOutGuestLabel.setText("T");
        this.timeOutLabel.setText(timeoutTime);
        this.timeOutGuestTimerTask = new TimerTask(timeoutTime);
        this.timeOutGuestTimerTask.add(new TimeOutTimeListener(this, TimeOutTimeListener.Type.Guest));
        this.timeoutTimer.addMainTimerListener(timeOutGuestTimerTask);
        this.timeoutTimer.start();
    }

    public void startMatch() {
        this.mainTimer.start();
        this.setMainTimerTask(new TimerTask(this.getManagerFrame().getTimeField().getText()));
        this.mainTimer.addMainTimerListener(this.mainTimerTask);
        this.getMainTimerTask().add(new MainTimerTimeListener(this));
    }

    public void startNextPeriod() {
        this.setMainTimerTask(new TimerTask(this.getManagerFrame().getTimeField().getText()));
        this.mainTimer.addMainTimerListener(this.mainTimerTask);
        this.getMainTimerTask().add(new MainTimerTimeListener(this));
        this.mainTimer.cont();
    }

    public void updateMatchData() {
        this.scoreGuestLabel.setText(this.getManagerFrame().getGuestGoalSpinner().getValue().toString());
        this.scoreHostLabel.setText(this.getManagerFrame().getHostGoalSpinner().getValue().toString());
        this.periodLabel.setText(this.getManagerFrame().getPeriodSpinner().getValue().toString());
        this.hostLabel.setText(this.getManagerFrame().getHostNameField().getText());
        this.guestLabel.setText(this.getManagerFrame().getGuestNameField().getText());
    }

    public void updateTimeTaskData() {
        if (this.mainTimer != null) {
            this.timeLabel.setText(this.getMainTimerTask().toString("mm:ss"));
            this.managerFrame.getTimeField().setText(this.getMainTimerTask().toString("mm:ss"));
        }
        if (this.guestPenalty1Timer != null) {
            this.managerFrame.getGuestPenalty1Field().setText(
                    this.guestPenalty1Timer.toString("m:ss"));
            this.penaltyGuest1Label.setText(this.guestPenalty1Timer.toString("m:ss"));
        }
        if (this.guestPenalty2Timer != null) {
            this.managerFrame.getGuestPenalty2Field().setText(
                    this.guestPenalty2Timer.toString("m:ss"));
            this.penaltyGuest2Label.setText(this.guestPenalty2Timer.toString("m:ss"));
        }
        if (this.hostPenalty1Timer != null) {
            this.managerFrame.getHostPenalty1Field().setText(
                    this.hostPenalty1Timer.toString("m:ss"));
            this.penaltyHost1Label.setText(this.hostPenalty1Timer.toString("m:ss"));
        }
        if (this.hostPenalty2Timer != null) {
            this.managerFrame.getHostPenalty2Field().setText(
                    this.hostPenalty2Timer.toString("m:ss"));
            this.penaltyHost2Label.setText(this.hostPenalty2Timer.toString("m:ss"));
        }
    }

    public JLabel getHostLabel() {
        return hostLabel;
    }

    public JLabel getGuestLabel() {
        return guestLabel;
    }

    public JLabel getTimeOutLHostLabel() {
        return timeOutLHostLabel;
    }

    public JLabel getTimeOutLabel() {
        return timeOutLabel;
    }

    public JLabel getTimeOutGuestLabel() {
        return timeOutGuestLabel;
    }

    public JLabel getScoreGuestLabel() {
        return scoreGuestLabel;
    }

    public JLabel getPeriodLabel() {
        return periodLabel;
    }

    public JLabel getScoreHostLabel() {
        return scoreHostLabel;
    }

    public JLabel getPenaltyHost1Label() {
        return penaltyHost1Label;
    }

    public JLabel getPenaltyHost2Label() {
        return penaltyHost2Label;
    }

    public JLabel getPenaltyGuest1Label() {
        return penaltyGuest1Label;
    }

    public JLabel getPenaltyGuest2Label() {
        return penaltyGuest2Label;
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    public JScoreboardManager getManagerFrame() {
        return managerFrame;
    }

    public void setTimeoutTimer(MainTimer timeoutTimer) {
        this.timeoutTimer = timeoutTimer;
    }

    public MainTimer getTimeoutTimer() {
        return timeoutTimer;
    }

    public TimerTask getTimeOutGuestTimerTask() {
        return timeOutGuestTimerTask;
    }

    public TimerTask getTimeOutHostTimerTask() {
        return timeOutHostTimerTask;
    }

    public MainTimer getMainTimer() {
        return mainTimer;
    }

    /**
     * Returns the mainTimerTask.
     *
     * @return the mainTimerTask
     */
    public TimerTask getMainTimerTask() {
        return mainTimerTask;
    }

    /**
     * Sets the mainTimerTask.
     *
     * @param mainTimerTask the mainTimerTask to set
     */
    public void setMainTimerTask(TimerTask mainTimerTask) {
        this.mainTimerTask = mainTimerTask;
    }


    public TimerTask getHostPenalty2Timer() {
        return hostPenalty2Timer;
    }

    public void setHostPenalty2Timer(TimerTask hostPenalty2Timer) {
        this.hostPenalty2Timer = hostPenalty2Timer;
    }

    public TimerTask getGuestPenalty2Timer() {
        return guestPenalty2Timer;
    }

    public void setGuestPenalty2Timer(TimerTask guestPenalty2Timer) {
        this.guestPenalty2Timer = guestPenalty2Timer;
    }

    public TimerTask getHostPenalty1Timer() {
        return hostPenalty1Timer;
    }

    public void setHostPenalty1Timer(TimerTask hostPenalty1Timer) {
        this.hostPenalty1Timer = hostPenalty1Timer;
    }

    public TimerTask getGuestPenalty1Timer() {
        return guestPenalty1Timer;
    }

    public void setGuestPenalty1Timer(TimerTask guestPenalty1Timer) {
        this.guestPenalty1Timer = guestPenalty1Timer;
    }

    public void createUIComponents() {
        hostLabel = new ResizeLabelFont("Host");
        timeLabel = new ResizeLabelFont("20:00");
        guestLabel = new ResizeLabelFont("Guest");
    }
}
