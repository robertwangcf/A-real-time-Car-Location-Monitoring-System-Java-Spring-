package teacher.service;

import teacher.model.CurrentPosition;

/**
 *
 *
 *
 */
public interface PositionService {

    void processPositionInfo(long id,
                             CurrentPosition currentPosition,
                             boolean exportPositionsToKml,
                             boolean sendPositionsToIngestionSerice);

}
