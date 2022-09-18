public class studentcoure {
    private int id;
    private String Grade;
    private int date;
    private int student_id;
    private int course_id;

    public studentcoure(int id, String grade, int date, int student_id, int course_id) {
        this.id = id;
        Grade = grade;
        this.date = date;
        this.student_id = student_id;
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "studentcoure [Grade=" + Grade + ", course_id=" + course_id + ", date=" + date + ", id=" + id
                + ", student_id=" + student_id + "]";
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getId() {
        return id;
    }

    public String getGrade() {
        return Grade;
    }

    public int getDate() {
        return date;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getCourse_id() {
        return course_id;
    }

}
