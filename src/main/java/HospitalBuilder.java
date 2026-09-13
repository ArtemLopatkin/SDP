public class HospitalBuilder {
    private String name;
    private int beds;
    private boolean emergencyDepartment;
    private boolean intensiveCareUnit;
    private boolean surgeryDepartment;
    private boolean laboratory;
    private boolean pharmacy;

    public HospitalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HospitalBuilder setBeds(int beds) {
        this.beds = beds;
        return this;
    }

    public HospitalBuilder setEmergencyDepartment(boolean emergencyDepartment) {
        this.emergencyDepartment = emergencyDepartment;
        return this;
    }

    public HospitalBuilder setIntensiveCareUnit(boolean intensiveCareUnit) {
        this.intensiveCareUnit = intensiveCareUnit;
        return this;
    }

    public HospitalBuilder setSurgeryDepartment(boolean surgeryDepartment) {
        this.surgeryDepartment = surgeryDepartment;
        return this;
    }

    public HospitalBuilder setLaboratory(boolean laboratory) {
        this.laboratory = laboratory;
        return this;
    }

    public HospitalBuilder setPharmacy(boolean pharmacy) {
        this.pharmacy = pharmacy;
        return this;
    }

    public Hospital build() {

        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Hospital name is required");
        }

        if (beds <= 0) {
            throw new IllegalStateException("Number of beds must be greater than 0");
        }

        return new Hospital(
            name,
            beds,
            emergencyDepartment,
            intensiveCareUnit,
            surgeryDepartment,
            laboratory,
            pharmacy
        );
    }

    
}