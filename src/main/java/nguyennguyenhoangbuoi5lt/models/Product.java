package nguyennguyenhoangbuoi5lt.models;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.*;

public class Product{

	private int id;
	@NotBlank(message="tên sản phẩm không được để trống")
	private String name;
	@NotNull(message = "tên sản phẩm không được để trống")
	@Min(value = 1, message = "giá sản phẩm không được nhỏ hơn 1")
	@Max(value=99999999, message="giá sản phẩm không lớn hơn 99999999")
	private long price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Length(min=0,max=50,message="tên hình ảnh không quá 50 kí tự")
	private String image;
}
