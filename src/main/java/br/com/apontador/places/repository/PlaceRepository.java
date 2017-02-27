package br.com.apontador.places.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResult;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.apontador.places.model.Place;

public interface PlaceRepository extends MongoRepository<Place, String> {
	
	@Query(value = "{active: true,  name: { $regex: ?0, $options: 'i' } }")
	Page<GeoResult<Place>> findByAddressLocationNear(String q, Point location, Distance distance, Pageable pageable);

	@Query(value = "{active: true}")
	Page<Place> findAll(Pageable pageable);
	
	Place findByAddressPlaceId(String placeId);
}
