package cluedo;
/**
 * a simple class that represents cards in the game
 * @author abubakhami
 *
 */
public class Card {
	
	private String name;
	private String type;
	public Card(String name, String type){
		this.name = name;
		this.type = type;


	}

	public String getName() {
		return name;

	}

	public String getype() {
		return type;

	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Card other = (Card) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}




	}


