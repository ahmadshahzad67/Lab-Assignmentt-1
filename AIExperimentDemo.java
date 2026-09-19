class AIExperimentDemo {

    void boostExperiment(AIExperiment exp, int bonus) {
        exp.completedEpochs = exp.completedEpochs + bonus;
    }

    public static void main(String[] args) {
        AIExperimentDemo helper = new AIExperimentDemo();

        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "ImageClassifier";
        exp1.completedEpochs = 0;
        exp1.targetEpochs = 20;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "TextSummarizer";
        exp2.completedEpochs = 0;
        exp2.targetEpochs = 15;

        System.out.println("Initial state:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
        System.out.println();

        exp1.runEpochs(5);
        exp2.runEpochs(3, 2);

        System.out.println("After runEpochs calls:");
        System.out.println(exp1.status());
        System.out.println("Remaining for exp1: " + exp1.remainingEpochs());
        System.out.println(exp2.status());
        System.out.println("Remaining for exp2: " + exp2.remainingEpochs());
        System.out.println();

        System.out.println("Only exp1 changes below:");
        exp1.runEpochs(2);
        System.out.println(exp1.status());
        System.out.println(exp2.status());
        System.out.println();

        System.out.println("Before boostExperiment: " + exp1.status());
        helper.boostExperiment(exp1, 10);
        System.out.println("After boostExperiment: " + exp1.status());
        System.out.println("The change is visible because the copied reference still points at the same exp1 object.");
    }
}
