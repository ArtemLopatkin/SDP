public class Main {
    public static void main(String[] args) {

        HospitalDirector director = new HospitalDirector();

        Hospital generalHospital = director.buildGeneralHospital();
        Hospital smallClinic = director.buildSmallClinic();
        Hospital emergencyHospital = director.buildEmergencyHospital();

        System.out.println(generalHospital);
        System.out.println(smallClinic);
        System.out.println(emergencyHospital);
    }
}