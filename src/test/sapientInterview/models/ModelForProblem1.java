package test.sapientInterview.models;

/**
 * 
 * 
 * @author soumi
 *
 */
public class ModelForProblem1 {

	private String charList;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charList == null) ? 0 : charList.hashCode());
		result = prime * result + occuranceCount;
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
		ModelForProblem1 other = (ModelForProblem1) obj;
		if (charList == null) {
			if (other.charList != null)
				return false;
		} else if (!charList.equals(other.charList))
			return false;
		if (occuranceCount != other.occuranceCount)
			return false;
		return true;
	}
	private int occuranceCount;
	
	public ModelForProblem1(String charList, int occuranceCount) {
		super();
		this.charList = charList;
		this.occuranceCount = occuranceCount;
	}
	
	public String getCharList() {
		return charList;
	}
	public void setCharList(String charList) {
		this.charList = charList;
	}
	public int getOccuranceCount() {
		return occuranceCount;
	}
	public void setOccuranceCount(int occuranceCount) {
		this.occuranceCount = occuranceCount;
	}
	
	
}
