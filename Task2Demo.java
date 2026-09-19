class Task2Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "SP26-BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 18;

        s1.addCredits(6);
        s2.addCredits(6);

        int s1Remaining = s1.remainingCredits(130);
        int s2Remaining = s2.remainingCredits(130);

        System.out.println(s1.summary());
        System.out.println("Remaining credits for s1: " + s1Remaining);
        System.out.println();
        System.out.println(s2.summary());
        System.out.println("Remaining credits for s2: " + s2Remaining);
    }
}
