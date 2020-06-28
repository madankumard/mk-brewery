package mk.springframework.mkbrewery.controller;

import mk.springframework.mkbrewery.services.BeerService;
import mk.springframework.mkbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    @ResponseStatus(HttpStatus.OK)
    public BeerDto getBeer(@PathVariable("beerId") UUID beerId) {
        return beerService.getBeerById(beerId);
    }
}
