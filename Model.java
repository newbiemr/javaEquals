package project01;

public class Model {

	private int id;
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean equals(Model obj) {
		return this.id == obj.id && this.desc == obj.desc;
	}

	public Model(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

}
