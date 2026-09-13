public class HospitalDirector {

    private static final int GENERAL_HOSPITAL_BEDS = 200;
    private static final int SMALL_CLINIC_BEDS = 30;
    private static final int EMERGENCY_HOSPITAL_BEDS = 150;
    
    private static final String GENERAL_HOSPITAL_NAME = "General Hospital";
    private static final String SMALL_CLINIC_NAME = "Small Clinic";
    private static final String EMERGENCY_HOSPITAL_NAME = "Emergency Hospital"; 
    
    public Hospital buildGeneralHospital() {
        return new HospitalBuilder()
            .setName(GENERAL_HOSPITAL_NAME)
            .setBeds(GENERAL_HOSPITAL_BEDS)
            .setEmergencyDepartment(true)
            .setIntensiveCareUnit(true)
            .setSurgeryDepartment(true)
            .setLaboratory(true)
            .setPharmacy(true)
            .build();
    }

    public Hospital buildSmallClinic() {
        return new HospitalBuilder()
            .setName(SMALL_CLINIC_NAME)
            .setBeds(SMALL_CLINIC_BEDS)

            .setEmergencyDepartment(false)
            .setIntensiveCareUnit(false)
            .setSurgeryDepartment(false)
            .setLaboratory(true)
            .setPharmacy(true)
            .build();
    }

    public Hospital buildEmergencyHospital() {
        return new HospitalBuilder()
            .setName(EMERGENCY_HOSPITAL_NAME)
            .setBeds(EMERGENCY_HOSPITAL_BEDS)
            .setEmergencyDepartment(true)
            .setIntensiveCareUnit(true)
            .setSurgeryDepartment(true)
            .setLaboratory(true)
            .setPharmacy(false)
            .build();
    }
}