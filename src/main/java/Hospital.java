public class Hospital {
    private String name;
    private int beds;
    private boolean emergencyDepartment;
    private boolean intensiveCareUnit;
    private boolean surgeryDepartment;
    private boolean laboratory;
    private boolean pharmacy;


    public Hospital(
        String name,
        int beds,
        boolean emergencyDepartment,
        boolean intensiveCareUnit,
        boolean surgeryDepartment,
        boolean laboratory,
        boolean pharmacy
    ) {
        this.name = name;
        this.beds = beds;
        this.emergencyDepartment = emergencyDepartment;
        this.intensiveCareUnit = intensiveCareUnit;
        this.surgeryDepartment = surgeryDepartment;
        this.laboratory = laboratory;
        this.pharmacy = pharmacy;
    }

    @Override
    public String toString() {
        return "Hospital{" +
            "name='" + name + '\'' +
            ", beds=" + beds +
            ", emergencyDepartment=" + emergencyDepartment +
            ", intensiveCareUnit=" + intensiveCareUnit +
            ", surgeryDepartment=" + surgeryDepartment +
            ", laboratory=" + laboratory +
            ", pharmacy=" + pharmacy +
            '}';
    }
}