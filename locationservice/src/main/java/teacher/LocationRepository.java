package teacher;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {

    @RestResource(rel = "by-service-type")
    Page<Location> findByServiceType(@Param("type") String type, Pageable pageable);

    @RestResource(path = "vin", rel = "by-vin")
    Page<Location> findByUnitInfoUnitVin(@Param("vin") String vin, Pageable pageable);

}
