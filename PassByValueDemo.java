class PassByValueDemo {

    void changeNumber(int x) {
        System.out.println("Inside method (start): x = " + x);
        x = 99;
        System.out.println("Inside method (end): x = " + x);
    }

    void changeStudent(Student st) {
        System.out.println("Inside method (start): " + st.summary());
        st.completedCredits = 99;
        System.out.println("Inside method (end): " + st.summary());
    }

    void replaceStudent(Student st) {
        System.out.println("Inside method (start): " + st.summary());
        st = new Student();
        st.name = "Temporary";
        System.out.println("Inside method (end): " + st.summary());
    }

    public static void main(String[] args) {
        PassByValueDemo helper = new PassByValueDemo();

        int number = 10;
        System.out.println("Experiment A - primitive int");
        System.out.println("Before: number = " + number);
        helper.changeNumber(number);
        System.out.println("After: number = " + number);
        System.out.println();

        Student st = new Student();
        st.studentId = "SP26-BAI-001";
        st.name = "Abeer Amina";
        st.completedCredits = 15;

        System.out.println("Experiment B - mutate through reference");
        System.out.println("Before: " + st.summary());
        helper.changeStudent(st);
        System.out.println("After: " + st.summary());
        System.out.println("The argument value is copied into the parameter, but the copy still points at the same Student object.");
        System.out.println();

        System.out.println("Experiment C - reassign the parameter");
        System.out.println("Before: " + st.summary());
        helper.replaceStudent(st);
        System.out.println("After: " + st.summary());
        System.out.println("The argument value is copied into the parameter, so only the copy was redirected to the new object.");
    }
}
