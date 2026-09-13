public class Main {
    public static void main(String[] args) {

        Hospital hospital = new HospitalBuilder()
            .setName("Central Hospital")
            .setBeds(200)
            .setEmergencyDepartment(true)
            .setIntensiveCareUnit(true)
            .setSurgeryDepartment(true)
            .setLaboratory(true)
            .setPharmacy(true)
            .build();

        System.out.println(hospital);
    }
}