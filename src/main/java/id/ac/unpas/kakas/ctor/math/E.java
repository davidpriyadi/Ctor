package id.ac.unpas.kakas.ctor.math;

import java.util.ArrayList;
import java.util.List;

public class E {

	private List<String> dataList = new ArrayList<String>();

	public boolean contains(String n) {

		return dataList.contains(n);
	}

	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "E []";
	}
}
