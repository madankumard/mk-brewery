package mk.springframework.mkbrewery.web.mappers;

import mk.springframework.mkbrewery.domain.Beer;
import mk.springframework.mkbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
