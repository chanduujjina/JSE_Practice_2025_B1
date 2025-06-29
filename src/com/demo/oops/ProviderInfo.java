package com.demo.oops;

import java.util.Objects;

public class ProviderInfo {
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);//it may return same value also in case of diffrent data
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProviderInfo other = (ProviderInfo) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	private int id;
	
	private String name;

	@Override
	public String toString() {
		return "ProviderInfo [id=" + id + ", name=" + name + "]";
	}

	public ProviderInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
