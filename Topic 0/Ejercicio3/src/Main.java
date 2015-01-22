public class Main {
	public static void main(String args[]) {
		HospitalBuilder hospitalBuilder = new PrivateHospital();
		MedicalInstitutions medicalInstitution = new MedicalInstitutions(hospitalBuilder);
		medicalInstitution.constructHospital();
		Hospital hospital = medicalInstitution.getHospital();
		System.out.println("The Private Hospital has: " + hospital);

		hospitalBuilder = new PublicHospital();
		medicalInstitution = new MedicalInstitutions(hospitalBuilder);
		medicalInstitution.constructHospital();
		hospital = medicalInstitution.getHospital();
		System.out.println("The Public Hospital has: " + hospital);

		hospitalBuilder = new RuralHospital();
		medicalInstitution = new MedicalInstitutions(hospitalBuilder);
		medicalInstitution.constructHospital();
		hospital = medicalInstitution.getHospital();
		System.out.println("The Rural Hospital has: " + hospital);

	}
}