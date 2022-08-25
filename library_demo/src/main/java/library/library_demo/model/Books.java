package library.library_demo.model;

public class Books {
	private int id;
	private String name;
	private int prices;
	private String autor;
	private String comment;

	public Books() {

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the prices
	 */
	public double getPrices() {
		return prices;
	}

	/**
	 * @param prices the prices to set
	 */
	public void setPrices(int prices) {
		this.prices = prices;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	public Books(int id, String name, int prices, String autor, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.prices = prices;
		this.autor = autor;
		this.comment = comment;
	}

}
