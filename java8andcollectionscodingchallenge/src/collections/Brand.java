package collections;

import java.util.Set;

public class Brand implements Comparable<Brand>{
	private int brandId;
	private String brandName;
	private Set<Models> models;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brandId, String brandName, Set<Models> models) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.models = models;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Set<Models> getModels() {
		return models;
	}
	public void setModels(Set<Models> models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", models=" + models + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brand other = (Brand) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Brand e) {
		// TODO Auto-generated method stub
		return this.brandName.compareTo(e.brandName);
	}
	

}
