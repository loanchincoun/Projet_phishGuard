package fr.phishguard.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ransomwareVictim")
public class RansomwareVictimEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String victim;
	private String groupName;
	private String activity;
	private String country;
	private String domain;

	@Lob
    @Column(columnDefinition = "TEXT")
	private String description;

	private String screenshotUrl;
	private String sourceUrl;
	
	@Lob
    @Column(columnDefinition = "TEXT")
	private String pressSummary;

	private String attackDate;
	private String discoveredDate;

	public Long getId() { return id; }

	public String getVictim() { return victim; }
	public void setVictim(String victim) { this.victim = victim; }

	public String getGroupName() { return groupName; }
	public void setGroupName(String groupName) { this.groupName = groupName; }

	public String getActivity() { return activity; }
	public void setActivity(String activity) { this.activity = activity; }

	public String getCountry() { return country; }
	public void setCountry(String country) { this.country = country; }

	public String getDomain() { return domain; }
	public void setDomain(String domain) { this.domain = domain; }

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	public String getScreenshotUrl() { return screenshotUrl; }
	public void setScreenshotUrl(String screenshotUrl) { this.screenshotUrl = screenshotUrl; }

	public String getSourceUrl() { return sourceUrl; }
	public void setSourceUrl(String sourceUrl) { this.sourceUrl = sourceUrl; }

	public String getPressSummary() { return pressSummary; }
	public void setPressSummary(String pressSummary) { this.pressSummary = pressSummary; }

	public String getAttackDate() { return attackDate; }
	public void setAttackDate(String attackDate) { this.attackDate = attackDate; }

	public String getDiscoveredDate() { return discoveredDate; }
	public void setDiscoveredDate(String discoveredDate) { this.discoveredDate = discoveredDate; }
}


