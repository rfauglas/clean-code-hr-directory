abstract public class RecruitmentProcess {
    private Person candidate = null;
    private String jobDescription;

    public RecruitmentProcess(Person candidate, String jobDescription) {
        this.candidate = candidate;
        this.jobDescription = jobDescription;
    }

    public void executeRecruitement() {
        executeHRInterview();
        executeExpertiseEvaluationInterview();
        debriefRecruitment();
    }

    private void debriefRecruitment() {
    }

    private final void executeHRInterview() {
    }

    private final void executeExpertiseEvaluationInterview() {

    }
    abstract  protected void executeTechnicalInterview();


//Just for differentiation of implementations...
    protected void evaluateTechnicalQuestion(String question) {
        //Raise technical question
    }

    private void introduceCompany() {
    }

    private int letCandidateIntroduceHimself() {
    }

    private void introduceJobDescription() {
    }

    public enum QuestionWeight {
        Low,Medium,High
    }
}
