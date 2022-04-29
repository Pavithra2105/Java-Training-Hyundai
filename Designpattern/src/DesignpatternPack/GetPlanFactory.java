package DesignpatternPack;

public class GetPlanFactory {
	
	public Plan getPlan(String ShirtBrand) {
		if(ShirtBrand == null) {
			return null;
		}
		if(ShirtBrand.equalsIgnoreCase("Arrow")) {
			return new Arrow();
		}
		
		if(ShirtBrand.equalsIgnoreCase("PeterEngland")) {
			return new PeterEngland();
		}
		
		if(ShirtBrand.equalsIgnoreCase("Polo")) {
			return new Polo();
		}
		return null;
		
		
	}

}
