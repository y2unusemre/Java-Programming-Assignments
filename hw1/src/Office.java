/**
 * subclass of Building
 */
public class Office extends Building {
    private String job_type;

    public Office() {
        super();
    }

    public Office(String job_type) {
        super();
        this.job_type = job_type;
    }

    /**
     * office constructor with parameters
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     * @param job_type of  the building
     */
    public Office(int length, int height, int start_point, int end_point, String owner, String job_type) {
        super(length, height, start_point, end_point, owner);
        this.job_type = job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getJob_type() {
        return job_type;
    }
}
