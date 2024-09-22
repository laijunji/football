package com.jackie.football;

import java.util.List;
import org.springframework.web.bind.annotation.*;


@RestController
public class PlayerController {
    @RequestMapping("/players")
    public List<String> listPlayers() {
        return List.of("Ivana ANDRES", "Alexia PUTELLAS");
    }
}