package teacher.service;

import teacher.model.GpsSimulatorRequest;
import teacher.model.Point;
import teacher.task.GpsSimulator;

import java.io.File;
import java.util.List;

/**
 *
 *
 */

public interface GpsSimulatorFactory {

    GpsSimulator prepareGpsSimulator(GpsSimulatorRequest gpsSimulatorRequest);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, File kmlFile);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, List<Point> points);

}
