package kadai_018;

public abstract class Kato_Chapter18 {
	
    //フィールド
	public String familyName;
	public String givenName;
	public String address;
	
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	//メソッド
	public void commonIntroduce() {
		System.out.println("私の名前は" + familyName + givenName +"です。");
		System.out.println("住所は" + address + "です。");
	}
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
	
	
	
	
}
