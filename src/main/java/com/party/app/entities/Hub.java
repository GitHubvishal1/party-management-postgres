package com.party.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hub {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String callback;
	private String query;

	public Hub() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "Hub [id=" + id + ", callback=" + callback + ", query=" + query + "]";
	}

	public Hub(int id, String callback, String query) {
		super();
		this.id = id;
		this.callback = callback;
		this.query = query;
	}

}
