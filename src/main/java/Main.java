public class Main {
    public static void main(String[] args) {

        HospitalDirector director = new HospitalDirector();

        Hospital generalHospital = director.buildGeneralHospital();
        Hospital smallClinic = director.buildSmallClinic();
        Hospital emergencyHospital = director.buildEmergencyHospital();

        System.out.println(generalHospital);
        System.out.println(smallClinic);
        System.out.println(emergencyHospital);

        // Additional test cases

        System.out.println("Test 1: empty name");

        try {
            new HospitalBuilder()
                .setName("")
                .setBeds(200)
                .setEmergencyDepartment(true)
                .setIntensiveCareUnit(true)
                .setSurgeryDepartment(true)
                .setLaboratory(true)
                .setPharmacy(true)
                .build();
        } catch (IllegalStateException e) {
            System.out.println("Test failed: empty name was rejected");
        }


        System.out.println("Test 2: negative beds");

        try {
            new HospitalBuilder()
                .setName("Test Hospital")
                .setBeds(-100)
                .setEmergencyDepartment(true)
                .setIntensiveCareUnit(true)
                .setSurgeryDepartment(true)
                .setLaboratory(true)
                .setPharmacy(true)
                .build();
        } catch (IllegalStateException e) {
            System.out.println("Test passed: negative beds were rejected");
        }
    }
}