package project01;

public class ModelV2 {
	private int id;
	private String desc;

	@Override
	public boolean equals(Object o) {
		
		System.out.println("[this=" + this + "] [arg=" + o + "]");
		// 1
		if (o == this) {
			return true;
		}

		// 2
		if (!(o instanceof ModelV2)) {
			return false;
		}

		ModelV2 model = (ModelV2) o;
		// 3
		return this.id == model.id && this.desc == model.desc;
	}

	public ModelV2(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

}
