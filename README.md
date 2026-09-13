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

`Hospital` is the object being created.

`HospitalBuilder` builds a hospital step by step. Its setter methods return the builder, so they can be chained together.

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

`HospitalDirector` provides predefined hospital configurations, and `Main` demonstrates and tests the implementation.

## Validation

The builder checks the hospital state before creating the object:

- The name cannot be empty.
- The number of beds must be greater than 0.

Invalid values cause an `IllegalStateException`.

## Clean Code

### 1. Meaningful Names

**Before:**
```java
.setName("General Hospital")
.setBeds(200)
```

**After:**
```java
.setName(GENERAL_HOSPITAL_NAME)
.setBeds(GENERAL_HOSPITAL_BEDS)
```

The constants make the purpose of the values clear.

### 2. Small Methods

Validation is separated into small methods instead of putting all checks directly into `build()`.

### 3. Consistent Formatting

The classes use consistent indentation, naming, and formatting to keep the code easy to read.

### 4. Validated Construction

`build()` checks the object's state before returning a `Hospital`, preventing invalid objects from being created.

### 5. No Magic Numbers/Strings

Repeated configuration values are stored in named constants instead of unexplained numbers or strings.

## Running

From the project directory:

```bash
javac src/main/java/*.java
java -cp src/main/java Main
```

## Git

The project uses Git with `main` as the main branch.
