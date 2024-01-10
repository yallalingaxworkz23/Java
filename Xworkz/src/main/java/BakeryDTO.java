import java.io.Serializable;

public class BakeryDTO  implements Serializable{
	
	private String name;
	private String price;
	private String quantity;
	private String discount;
	private String gst;
	private String manfdate;
	private String expiredate;
	public BakeryDTO() {
		super();
	}
	public BakeryDTO(String name, String price, String quantity, String discount, String gst, String manfdate,
			String expiredate) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.gst = gst;
		this.manfdate = manfdate;
		this.expiredate = expiredate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getManfdate() {
		return manfdate;
	}
	public void setManfdate(String manfdate) {
		this.manfdate = manfdate;
	}
	public String getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}
	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", price=" + price + ", quantity=" + quantity + ", discount=" + discount
				+ ", gst=" + gst + ", manfdate=" + manfdate + ", expiredate=" + expiredate + "]";
	}
	
	
	

}
