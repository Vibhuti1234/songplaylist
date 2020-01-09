package collections;

import java.util.Set;

public class Models implements Comparable<Models> {
	private int modelId;
	private String modelName;
	private Set<User> users;
	public Models() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Models(int modelId, String modelName, Set<User> users) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.users = users;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Models [modelId=" + modelId + ", modelName=" + modelName + ", users=" + users + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
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
		Models other = (Models) obj;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Models e) {
		// TODO Auto-generated method stub
		return this.modelName.compareTo(e.modelName);
	}
   
}
