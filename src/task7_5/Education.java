package task7_5;

public enum Education {
    VORONEZH_STATE_UNIVERSITY("Voronezh State University", "Studencheskaya sq, 1", 25000),
    VORONEZH_STATE_TECHNICAL_UNIVERSITY("Voronezh State Technical University", "Moskovskiy av, 14", 17000),
    VORONEZH_STATE_MEDICAL_UNIVERSITY("Voronezh State Medical University", "Studencheskaya st, 10", 8000),
    VORONEZH_STATE_ARCHITECTURAL_CONSTRUCTION_UNIVERSITY("Voronezh State Architectural Construction University", "20th Anniversary of October st, 84", 5000),
    VORONEZH_STATE_PEDAGOGICAL_UNIVERSITY("Voronezh State University", "Lenina st, 86", 10000);
    private final String name;
    private final String address;
    private final int numberOfStudents;


    Education(String name, String address, int numberOfStudents) {
        this.name = name;
        this.address = address;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
