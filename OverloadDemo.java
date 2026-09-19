class OverloadDemo {

    void enroll(String courseCode) {
        System.out.println("Enrolled in " + courseCode);
    }

    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + " section " + section);
    }

    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in course number " + numericCourseCode);
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);
    }
}
