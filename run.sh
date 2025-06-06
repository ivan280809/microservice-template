
#!/bin/bash

echo "Loading environment variables from .env"
export $(grep -v '^#' .env | xargs)

echo "Running application..."
./mvnw clean spring-boot:run
