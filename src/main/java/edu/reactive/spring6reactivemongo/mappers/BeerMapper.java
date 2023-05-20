package edu.reactive.spring6reactivemongo.mappers;

import edu.reactive.spring6reactivemongo.domain.Beer;
import edu.reactive.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
