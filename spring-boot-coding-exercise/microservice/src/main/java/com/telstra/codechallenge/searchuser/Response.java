package com.telstra.codechallenge.searchuser;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	
	private long total_count;
	private String incomplete_results;
	private List<Item> items;
	public long getTotal_count() {
		return total_count;
	}
	
	public void setTotal_count(long total_count) {
		this.total_count = total_count;
	}
	public String getIncomplete_results() {
		return incomplete_results;
	}
	public void setIncomplete_results(String incomplete_results) {
		this.incomplete_results = incomplete_results;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "Response [total_count=" + total_count + ", incomplete_results=" + incomplete_results + ", items="
				+ items + "]";
	}

}
