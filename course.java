public class course {
    private int id;
    private String Name;
    private String type;
    private int year;
    private String Ispractical;



    public course(int id, String name, String type, int year, String ispractical) {
        this.id = id;
        Name = name;
        this.type = type;
        this.year = year;
        Ispractical = ispractical;
    }
    @Override
    public String toString() {
        return "course [Ispractical=" + Ispractical + ", Name=" + Name + ", id=" + id + ", type=" + type + ", year="
                + year + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIspractical() {
        return Ispractical;
    }

    public void setIspractical(String ispractical) {
        Ispractical = ispractical;
    }

}
