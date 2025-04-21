package resturantPack;

public class MenuItemNotFoundException extends RuntimeException {
	public MenuItemNotFoundException() {
		super("Item not found");
	}
}
