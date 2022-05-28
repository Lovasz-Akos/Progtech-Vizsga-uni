package template_method_pattern.abstractions;

public abstract class Record {
	 public void Save() {
		this.BeforeSave();
		//save code here
		System.out.println("abstract Save");
		this.AfterSave();
	}
	
	public void BeforeSave() {};
	public void AfterSave() {System.out.println("abstract after save");};
	public void FailedSave() {};
	

}
