# Number Adder

A simple Maven project that takes 3 numbers and adds them together.

## Features

- Interactive command-line interface
- Input validation for numeric values
- Support for decimal numbers
- Comprehensive unit tests
- Maven build system

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, run:

```bash
mvn clean compile
```

## Running the Application

### Option 1: Using Maven exec plugin
```bash
mvn exec:java -Dexec.mainClass="com.example.NumberAdder"
```

### Option 2: Build and run the JAR
```bash
mvn clean package
java -jar target/number-adder-1.0.0.jar
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

## CI/CD Pipeline

This project includes a GitHub Actions workflow that automatically:

1. **Builds** the project on every push and pull request
2. **Tests** the application to ensure quality
3. **Deploys** to JFrog Artifactory when:
   - A pull request is merged
   - Code is pushed to main/master branch

### JFrog Artifactory Integration

The project uses **JFrog CLI with OIDC authentication** to deploy to JFrog Artifactory:
- **URL**: https://appdev1.jfrog.io/
- **Repository**: calc-NumberAdder
- **Authentication**: OIDC (OpenID Connect) - no secrets required

### OIDC Authentication

The workflow uses GitHub's OIDC tokens for secure authentication with JFrog Artifactory. This approach:
- ✅ **No secrets required** - uses GitHub's built-in OIDC
- ✅ **More secure** - temporary tokens with limited scope
- ✅ **Automatic rotation** - tokens are generated fresh for each run

### Manual Deployment

To manually deploy using JFrog CLI:

```bash
# Install JFrog CLI
curl -fL https://install-cli.jfrog.io | sh

# Configure and authenticate
jf c import jfrog-cli.conf
jf c use --server-id 0
jf auth oidc --server-id 0

# Deploy
jf mvn deploy --build-name=number-adder --build-number=1
```

## Usage

When you run the application, it will:

1. Prompt you to enter the first number
2. Prompt you to enter the second number  
3. Prompt you to enter the third number
4. Display the sum of all three numbers

Example output:
```
=== Number Adder ===
This program adds three numbers together.
Enter the first number: 5
Enter the second number: 10
Enter the third number: 15

=== Result ===
5.00 + 10.00 + 15.00 = 30.00
```

## Project Structure

```
src/
├── main/java/com/example/
│   └── NumberAdder.java          # Main application class
└── test/java/com/example/
    └── NumberAdderTest.java      # Unit tests
```

## License

This project is open source and available under the MIT License. 