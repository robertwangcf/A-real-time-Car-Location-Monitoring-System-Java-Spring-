sudo docker-compose up

java -jar locationservice/target/location-service-4.0.0.BUILD-SNAPSHOT.jar

echo "start update initialized location data"
curl -H "Content-Type: application/json" localhost:8700/upload -d @carLocations.json

java -jar locationsimulator/target/location-simulator-4.0.0.BUILD-SNAPSHOT.jar

java -jar locationingest/target/location-ingest-4.0.0.BUILD-SNAPSHOT.jar

java -jar locationupdater/target/location-updater-4.0.0.BUILD-SNAPSHOT.jar

java -jar locationdashboard/target/location-dashboard-4.0.0.BUILD-SNAPSHOT.jar

