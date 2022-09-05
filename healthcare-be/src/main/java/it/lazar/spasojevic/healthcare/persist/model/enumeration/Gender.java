package it.lazar.spasojevic.healthcare.persist.model.enumeration;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    OTHER("other"),
    UNKNOWN("unknown");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
