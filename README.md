# Hospital Builder

This project is a Java implementation of the Builder design pattern.

## Structure

```text
src/main/java/
├── Hospital.java
├── HospitalBuilder.java
├── HospitalDirector.java
└── Main.java
```

## How it works

`Hospital` is the object that is being created.

`HospitalBuilder` creates a hospital step by step. It has setter methods for the hospital name, number of beds, and departments. The methods return the builder, so they can be chained together.

Example:

```java
Hospital hospital = new HospitalBuilder()
        .setName("General Hospital")
        .setBeds(200)
        .setEmergencyDepartment(true)
        .setIntensiveCareUnit(true)
        .setSurgeryDepartment(true)
        .setLaboratory(true)
        .setPharmacy(true)
        .build();
```

`HospitalDirector` contains predefined ways to build hospitals.

`Main` is used to test the builder and validation.

## Validation

The builder checks the values before creating the object.

- The name cannot be empty.
- The number of beds must be greater than 0.

If invalid values are passed, an `IllegalStateException` is thrown.

## Test examples

The project includes examples of:

- a general hospital;
- a small clinic;
- an emergency hospital;
- invalid hospital name;
- invalid number of beds.

## Running the project

From the project directory:

```bash
javac src/main/java/*.java
java -cp src/main/java Main
```

## Git

The project uses Git and the main branch is `main`.
