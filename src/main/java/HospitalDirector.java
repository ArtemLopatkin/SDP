public class HospitalDirector {

    public Hospital buildGeneralHospital() {
        return new HospitalBuilder()
            .setName("General Hospital")
            .setBeds(200)
            .setEmergencyDepartment(true)
            .setIntensiveCareUnit(true)
            .setSurgeryDepartment(true)
            .setLaboratory(true)
            .setPharmacy(true)
            .build();
    }

    public Hospital buildSmallClinic() {
        return new HospitalBuilder()
            .setName("Small Clinic")
            .setBeds(30)
            .setEmergencyDepartment(false)
            .setIntensiveCareUnit(false)
            .setSurgeryDepartment(false)
            .setLaboratory(true)
            .setPharmacy(true)
            .build();
    }

    public Hospital buildEmergencyHospital() {
        return new HospitalBuilder()
            .setName("Emergency Hospital")
            .setBeds(150)
            .setEmergencyDepartment(true)
            .setIntensiveCareUnit(true)
            .setSurgeryDepartment(true)
            .setLaboratory(true)
            .setPharmacy(false)
            .build();
    }
}