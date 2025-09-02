public class Course {
    private int id;       // I use this to identify the course
    private String name;  //This is the course names
    private String code;  // This refers to the course number, so like 229

    public Course() { //This part is just setting up the default variable, before it is set to a different one
        this.id = 0;
        this.name = "Default Name for Class";
        this.code = "0";
    }

    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // For this section, I get the variables and set them to the specific things I want: Basically, the Getter Setter spot
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Course ID: " + id + ", Name: " + name + ", Code: " + code;
    }
}

