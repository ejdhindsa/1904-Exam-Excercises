public enum Grades
{
    A(4),
    B(3),
    C(2),
    D(1),
    F(0);
    
    // fields
    private int grade;
    
    private Grades(int grade)
    {
        this.grade = grade;
    } // end of constructor
    
    // GETTERS
    public int getGrade()
    {
        return this.grade;
    } // end of getGrades()
    
} // end of enum