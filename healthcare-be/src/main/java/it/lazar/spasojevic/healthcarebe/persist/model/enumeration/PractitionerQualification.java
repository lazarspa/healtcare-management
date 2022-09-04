package it.lazar.spasojevic.healthcarebe.persist.model.enumeration;

public enum PractitionerQualification {

    DOCTOR_OF_MEDICINE("Doctor of Medicine"),
    MEDICAL_ASSISTANT("Medical Assistant"),
    NURSE_PRACTITIONER("Nurse Practitioner"),
    DOCTOR_OF_PHARMACY("Doctor of Pharmacy"),
    CERTIFIED_NURSE_MIDWIFE("Certified Nurse Midwife"),
    EMERGENCY_MEDICAL_TECHNICIAN("Emergency Medical Technician");

    private final String qualification;

    PractitionerQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification(){
        return this.qualification;
    }
}
