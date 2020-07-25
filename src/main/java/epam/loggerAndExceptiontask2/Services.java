package epam.loggerAndExceptiontask2;

public class Services implements MaterialsCost{
	String materialtype;
	Integer housearea;
	Boolean homeautomation;
	Services(String materialtype,Integer housearea){
		this.materialtype=materialtype;
		this.housearea=housearea;
		this.homeautomation=false;
	}
	Services(String materialtype,Integer housearea,Boolean homeautomation){
		this.materialtype=materialtype;
		this.housearea=housearea;
		this.homeautomation=homeautomation;
	}
	public Integer getConstructionCost() {
		switch(materialtype) {
		case "abovestandard":
			return aboveStandardMaterials();
	    case "highstandard":
		    return highStandardMaterials();
	    default:
			return standardMaterials();}
	}
	public Integer standardMaterials(){
		return 1200*housearea;
	}
	public Integer aboveStandardMaterials() {
		return 1500*housearea;
	}
	public Integer highStandardMaterials() {
		if(!homeautomation) {
			return 1800*housearea;
		}
		return 2500*housearea;
	}
}
