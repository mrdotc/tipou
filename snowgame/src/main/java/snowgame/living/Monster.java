package snowgame.living;

public class Monster {
	
	private String id;
	
	private String name;
	
	private int HP;
	
	private int MP;
	
	

	public Monster() {
		
	}

	public Monster(String id, String name, int hP, int mP) {
		this.id = id;
		this.name = name;
		HP = hP;
		MP = mP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
