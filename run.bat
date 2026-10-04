@echo off
if not exist "config\application.properties" (
    echo Missing config\application.properties. Copy it from config\application.properties.example and update its values.
    exit /b 1
)

if not exist "target\nro-server-1.0.0.jar" (
    echo Missing target\nro-server-1.0.0.jar. Run "mvn clean package" first.
    exit /b 1
)

java -server -jar target\nro-server-1.0.0.jar
pause
