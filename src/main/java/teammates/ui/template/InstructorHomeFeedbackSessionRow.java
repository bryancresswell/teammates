package teammates.ui.template;

public class InstructorHomeFeedbackSessionRow extends HomeFeedbackSessionRow {
    private boolean isRecent;
    private String startTime;
    private String startTimeToolTip;
    private String endTime;
    private String endTimeToolTip;
    private String href;
    private InstructorFeedbackSessionActions actions;

    public InstructorHomeFeedbackSessionRow(String name, String tooltip, String status,
            String startTime, String startTimeToolTip, String endTime, String endTimeToolTip,
            String href, boolean isRecent, InstructorFeedbackSessionActions actions) {
        super(name, tooltip, status);
        this.startTime = startTime;
        this.startTimeToolTip = startTimeToolTip;
        this.endTime = endTime;
        this.endTimeToolTip = endTimeToolTip;
        this.isRecent = isRecent;
        this.href = href;
        this.actions = actions;
    }

    public boolean isRecent() {
        return isRecent;
    }

    public String getHref() {
        return href;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public InstructorFeedbackSessionActions getActions() {
        return actions;
    }

    public String getStartTimeToolTip() {
        return startTimeToolTip;
    }

    public String getEndTimeToolTip() {
        return endTimeToolTip;
    }
    
}
