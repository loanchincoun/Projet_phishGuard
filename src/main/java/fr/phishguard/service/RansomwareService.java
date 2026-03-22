package fr.phishguard.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.phishguard.model.dto.RansomwareVictimDto;
import fr.phishguard.model.entity.RansomwareVictimEntity;
import fr.phishguard.repository.RansomwareVictimRepository;
@Service
public class RansomwareService {
	
	private final RansomwareVictimRepository repository;
	private final RestTemplate restTemplate = new RestTemplate();

    public RansomwareService(RansomwareVictimRepository repository) {
        this.repository = repository;
    }

    public void importData() {

        String url = "https://api.ransomware.live/v2/victims/2026/01";

        RansomwareVictimDto[] data =
                restTemplate.getForObject(url, RansomwareVictimDto[].class);

        if (data == null) return;

        for (RansomwareVictimDto dto : data) {

            RansomwareVictimEntity entity = new RansomwareVictimEntity();

            entity.setVictim(dto.victim);
            entity.setGroupName(dto.groupName);
            entity.setActivity(dto.activity);
            entity.setCountry(dto.country);
            entity.setDomain(dto.domain);
            entity.setDescription(dto.description);
            entity.setScreenshotUrl(dto.screenshot);
            entity.setSourceUrl(dto.url);

            entity.setAttackDate(dto.attackdate);
            entity.setDiscoveredDate(dto.discovered);

            if (dto.press != null) {
                entity.setPressSummary(dto.press.summary);
            }

            repository.save(entity);
        }
    }

}
