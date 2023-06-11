package com.evalladares.pokeapi.poke.resource;

import com.evalladares.pokeapi.commons.exception.ServerException;
import com.evalladares.pokeapi.poke.model.PokeResponse;
import com.evalladares.pokeapi.poke.service.IPoke;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;

@RequestMapping("/pokeapi")
@RestController
public class PokeResource {

  private static final Logger LOG = Logger.getLogger("PokeResource");
  private IPoke iPoke;

  public PokeResource(IPoke iPoke) {
    this.iPoke = iPoke;
  }

  @GetMapping("/")
  public PokeResponse getList(@RequestParam(required = false) String limit,
                              @RequestParam(required = false) String offset) {
    LOG.info("POKE GET LIST");

    return iPoke.getPoke(limit, offset).get().orElseThrow(ServerException::new);

  }
}
