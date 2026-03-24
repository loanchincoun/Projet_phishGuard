package fr.phishguard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.phishguard.service.RansomwareService;

@RestController
@RequestMapping("/phishguard")
public class RansomwareControler {

	private final RansomwareService service;

    public RansomwareControler(RansomwareService service) {
        this.service = service;
    }
    @GetMapping("/import/{annee}/{mois}")
    public String importData(@PathVariable int annee, @PathVariable int mois) {
        service.importData(annee, mois);
        return "Import termine";
    }
}
