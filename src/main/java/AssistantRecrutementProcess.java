public class AssistantRecrutementProcess extends RecruitmentProcess{

    @Override
    protected void executeTechnicalInterview() {
        this.evaluateTechnicalQuestion("What is your typewriting throughput?");
        this.evaluateTechnicalQuestion("Can you speak french?");
        this.evaluateTechnicalQuestion("Can you use ms office?");

    }
}
