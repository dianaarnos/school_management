package school.management.system;

// Student's name and id cannot be updated
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Total fees for every student is $30.000
     * Initial pain fees for every student is 0
     * @param id unique id for student
     * @param name student's name
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * Update student's grade
     * @param grade new student's grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * todo move to some sort of command or another class that represents actions
     * Add value to student's paid fees
     * School receives fund
     * @param feesPaid amount paid by the student
     */
    public void payFees(int feesPaid, School school){
       this.feesPaid += feesPaid;
       school.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return this.feesTotal - this.feesPaid;
    }
}
