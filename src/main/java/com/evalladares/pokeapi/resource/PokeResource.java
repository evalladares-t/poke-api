package com.evalladares.pokeapi.resource;

import com.evalladares.pokeapi.exception.ServerException;
import com.evalladares.pokeapi.model.PokeResponse;
import com.evalladares.pokeapi.service.IPoke;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pokeapi")
@RestController
public class PokeResource {

  private IPoke iPoke;

  public PokeResource(IPoke iPoke) {
    this.iPoke = iPoke;
  }

  @GetMapping("/")
  public PokeResponse getList(HttpServletRequest request){
    String limit = request.getParameter("limit");
    String offset = request.getParameter("offset");
    return iPoke.getPoke(limit, offset);
  }
}
