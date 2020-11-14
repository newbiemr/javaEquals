package project01;

public class TestClass {

	public static void main(String[] args) {
//		Model model1 = new Model(1, "aciklama1");
//		Model model2 = new Model(2, "aciklama2");
//
//		boolean esit = model1.equals(model2);
//
//		System.out.println(esit);
//
//		model2.setId(1);
//		model2.setDesc("aciklama1");
//
//		esit = model1.equals(model2);
//		System.out.println(esit);
		
		ModelV2 model = new ModelV2(1, "aciklama1");
		
		System.out.println(model.equals(model)); // 1 - kendisi
		
		Model basicModel = new Model(1, "aciklama1");
		
		System.out.println(model.equals(basicModel)); // 2 - farklı tip
		
		ModelV2 model2 = new ModelV2(1, "aciklama1");
		
		System.out.println(model.equals(model2)); // 3 - farklı nesneler, aynı bilgiler
		
	}

}
