package fr.phishguard.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/import")
    public String importData() {
        service.importData();
        return "Import termine";
    }
}
