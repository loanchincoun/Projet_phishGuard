package fr.phishguard.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RansomwareVictimDto {
	   public String victim;
	    public String activity;
	    public String country;
	    public String description;
	    public String domain;

	    @JsonProperty("group")
	    public String groupName;

	    public String screenshot;
	    public String url;
	    public String attackdate;
	    public String discovered;

	    public Press press;

	    public static class Press {
	        public String summary;
	    }

}

