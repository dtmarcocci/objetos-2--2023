package domain;

import java.util.List;

public class Menu {

	private List<ItemDeMenu> items;

	public Menu(List<ItemDeMenu> items) {
		super();
		this.items = items;
	}
	
	public void verifyItem(ItemDeMenu item) {
		if(!this.items.contains(item)) {
			throw new RuntimeException("Lo sentimos, no tenemos stock del producto" + item.getDescripcion());
		}
	}
	public void verifyItem(List<ItemDeMenu> items) {
		for(ItemDeMenu i : items) {
			if(!this.items.contains(i)) {
				throw new RuntimeException("Lo sentimos, no tenemos stock del producto" + i.getDescripcion());
			}
		}
	}
	

}
