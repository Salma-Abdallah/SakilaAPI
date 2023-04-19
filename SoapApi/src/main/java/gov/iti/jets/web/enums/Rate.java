package gov.iti.jets.web.enums;

public enum Rate {
    G("G"),
    PG("PG"),
    PG_13("PG-13"),
    R("R"),
    NC_17("NC-17");

    private String description;

    Rate(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}
